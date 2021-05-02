public class Admin extends Employee{
    Admin(String surname,String name,String login,String password,String id,int salary,int workExperience ){
        super(surname,name,login,password,id,salary,workExperience);
    }
    public Admin() {
    	
	}
    
	public Object addUser(String type,String[] info){
        Object res = new Object();
        switch (type){
            case "Student":
                Student s = new Student(info[0],info[1],info[2],info[3],info[4],Integer.parseInt(info[5]),info[6],info[7],Double.parseDouble(info[8]));
                res = s;
                break;
            case "Teacher":
                Teacher t = new Teacher(info[0],info[1],info[2],info[3],info[4],Integer.parseInt(info[5]),Integer.parseInt(info[6]),info[7]);
                res = t;
                break;
            case "Manager":
                Manager m = new Manager(info[0],info[1],info[2],info[3],info[4],Integer.parseInt(info[5]),Integer.parseInt(info[6]));
                res = m;
                break;
            case "Executor":
                Executor e = new Executor(info[0],info[1],info[2],info[3],info[4],Integer.parseInt(info[5]),Integer.parseInt(info[6]));
                res = e;
                break;
        }
        return res;
    }
    public String toString(){
        return super.toString();
    }
}