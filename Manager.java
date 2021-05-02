import java.io.Serializable;
import  java.util.*;
public class Manager extends  Employee implements Serializable {
    Manager(String surname,String name,String login,String password,String id,int salary,int workExperience){
        super(surname,name,login,password,id,salary,workExperience);
    }
    public Manager() {
    	
	}
	public void addCourse(Course course,int x){

    }
    public void viewInfo(){

    }
    public void sendMessage(String message){

    }
}