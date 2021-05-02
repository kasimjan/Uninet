import java.io.Serializable;
import  java.util.*;
public class Executor extends Employee implements Serializable {
    public ArrayList<Order> orders;
    Executor(String surname,String name,String login,String password,String id,int salary,int workExperience){
        super(surname,name,login,password,id,salary,workExperience);
    }
    public Executor() {
    	
	}
	public void setOrders(ArrayList<Order> orders){
        this.orders = orders;
    }
    public void manageOrders(){
        for(Order order: orders){
            orderType type = orderType.NEW;
            order.setType(type);
        }

    }
}