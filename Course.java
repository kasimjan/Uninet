import  java.io.*;
import  java.util.*;
public class Course implements  Serializable {
    private String title;
    private String id;
    private int credits;
    private String faculty;
    private ArrayList<Teacher> teachers;
    public ArrayList<Student> students;
    public ArrayList<CourseFile> courseFiles;
    private TreeMap<Teacher,ArrayList<Student>> studentsTeach;

    Course(){}
    Course(String name, String id, int credits, String faculty, ArrayList<Teacher> teachers,ArrayList<Student> students){
        this.title = name;
        this.id = id;
        this.credits = credits;
        this.faculty = faculty;
        this.teachers = teachers;
        this.students = students;
    }
    public String getTitle()
    {
        return  this.title;
    }
    public void setName(String name){
        this.title = name;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setCredits(int credits){
        this.credits = credits;
    }
    public void setFaculty(String faculty){
        this.faculty = faculty;
    }
    public void setTeachers(ArrayList<Teacher> teachers){
        this.teachers = teachers;
    }
    public void setStudents(ArrayList<Student> students){
        this.students = students;
    }
    public void setCourseFiles(ArrayList<CourseFile> courseFiles){
        this.courseFiles = courseFiles;
    }
    public String getName(){
        return this.title;
    }
    public String getId(){
        return this.id;
    }
    public int getCredits(){
        return this.credits;
    }
    public String getFaculty(){
        return this.faculty;
    }
    public ArrayList<Teacher> getTeachers(){
        return this.teachers;
    }
    public ArrayList<Student> getStudents(){
        return this.students;
    }
    public ArrayList<CourseFile> getCourseFiles(){
        return this.courseFiles;
    }
    public String toString(){
        return this.id + " " + this.title + " " +this.credits + " " +this.faculty;
    }
    public boolean equals(Object o){
        Course c = (Course)o;
        boolean ok = false;
        if(c.getName().equals(this.title) && c.getId().equals(this.id) && c.getCredits() == this.credits && c.getFaculty().equals(this.faculty) && c.getCourseFiles().equals(this.courseFiles) && c.getTeachers().equals(this.teachers) && c.getStudents().equals(this.students)){
            ok = true;
        }
        return ok;
    }
}