import java.io.Serializable;
import  java.util.*;
public class Teacher extends Employee implements Serializable  {
    public   ArrayList<Course> courses = new ArrayList<Course>();
    private String faculty;
    public Teacher(){}
    public Teacher(String surname, String name, String login, String password,String id,int salary,int workExperience,String faculty ){
        super(surname,name,login,password,id,salary,workExperience);
        this.faculty = faculty;
    }
    public void setCourses(Course course) {
        if(this.courses == null){
            ArrayList<Course> courses = new ArrayList<>();
            this.courses = courses;
            this.courses.add(course);
        }else{
            courses.add(course);
        }
    }
    public String toString(){
        return super.toString() + " " + this.faculty;
    }
}