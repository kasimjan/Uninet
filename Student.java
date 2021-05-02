import java.io.Serializable;
import  java.util.*;
public class Student extends User implements Serializable {
    private int yearOfStudy;
    private String faculty;
    private String speciality;
    private double gpa;
    private ArrayList<Course> courses;
    private HashMap<Course,Mark> studentInfo;
    public Mark marks;
    Student(){}
    Student(String surname,String name,String login,String password, String id,int yearOfStudy,String faculty,String speciality,double gpa){
        super(surname,name,login,password,id);
        this.faculty = faculty;
        this.speciality = speciality;
        this.gpa = gpa;
        this.yearOfStudy = yearOfStudy;
    }
    public  void setCourses(Course course)
    {
        if(this.courses == null){
            ArrayList<Course> courses = new ArrayList<>();
            this.courses = courses;
            this.courses.add(course);
        }else{
            courses.add(course);
        }
    }
   public ArrayList<Course> getCourses()
   {
       return  this.courses;
   }
    Student(String surname,String name,String login,String password, String id,int yearOfStudy,String faculty,String speciality,double gpa,HashMap<Course, Mark> studentInfo){
        super(surname,name,login,password,id);
        this.faculty = faculty;
        this.speciality = speciality;
        this.gpa = gpa;
        this.studentInfo = studentInfo;
        this.yearOfStudy = yearOfStudy;
    }
    Student(User u,int yearOfStudy,String faculty,String speciality,double gpa,HashMap<Course, Mark> studentInfo){
        super(u,u.getLogin(),u.getPassword(),u.getId());
        this.faculty = faculty;
        this.speciality = speciality;
        this.gpa = gpa;
        this.studentInfo = studentInfo;
        this.yearOfStudy = yearOfStudy;
    }
    public void viewCourses(){
        for(Map.Entry<Course,Mark> entry: this.studentInfo.entrySet()){
            String course = entry.getKey().getName();
            System.out.println(course + " \n");
        }
    }

    public String getFaculty() {
        return faculty;
    }



    @Override
    public String toString() {
        return  "It is all about this Student\n" + surname + " " + name + "\n" + "Faculty: " + faculty + " " + "Speciality: " + speciality;
    }

    public double getGpa() {
        return gpa;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }



    public String getSpeciality() {
        return speciality;
    }

    public HashMap<Course, Mark> getStudentInfo() {
        return studentInfo;
    }

}
