import  java.util.*;
import  java.io.*;
public class Driver {
    public  static  String log, par, courseTitle, id,faculty;
    public  static Scanner scan = new Scanner(System.in);
    public static  Vector<Student> students = new Vector<>();
    public static  Vector<Teacher> teachers = new Vector<>();
    public static  Vector<Admin> admins = new Vector<>();
    public static  int choose,credits;
    public static void Teacher(Object obj)
    {
        Teacher myTeacher = (Teacher) obj;
        System.out.println("Welcome to our Intranet Teacher");
        System.out.println("Hello " + myTeacher.name + " " + myTeacher.surname);
        System.out.println("1)Add courses\n2)View Courses\n3)Add Files\n4)Delete Files\n5)View Students\n6)Put Marks\n7)Send Order to Executors");
        choose = scan.nextInt();
        switch (choose)
        {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
    }
    public static void Admin(Object obj)
    {
        Admin admin = new Admin(courseTitle, courseTitle, courseTitle, courseTitle, courseTitle, choose, choose);
        System.out.println("Welcome to our Intranet Admin");
        System.out.println("Hello " + admin.name + " " + admin.surname);
        System.out.println("1)Manage User\n2)See LogFiles about Users");
        choose = scan.nextInt();
        switch (choose)
        {
            case 1:
                System.out.println("Choose what you want to do");
                System.out.println("1)Add user\n2)Remove user\n3)Update Info about User\n4)");
                choose = scan.nextInt();

                System.out.println("Prepare to create new USER");
                System.out.println("Choose the Person what you want to create");
                System.out.println("1)Admin2)");
                System.out.println("Enter the login of user");
                log  = scan.next();
                System.out.println("Enter the password of the User");
                break;
            case 2:
                break;
        }
    }
    public  static  void Manager(Object obj)
    {
        Manager manager = (Manager) obj;
        System.out.println("Welcome to our Intranet Manager");
        System.out.println("Hello " + manager.name + " " + manager.surname);
        System.out.println("1)Add Courses\n2)View Info\n3)Send Message to Teachers");
        choose = scan.nextInt();
        switch (choose)
        {
            case 1:
                System.out.println("---- Course ----");
                System.out.println("Enter the title of the Course");
                courseTitle = scan.next();
                System.out.println("Enter the id of the Course");
                id = scan.next();
                System.out.println("Enter the credits of the Course");
                credits = scan.nextInt();
                System.out.println("Enter the faculty of the Course");
                faculty = scan.next();
                break;
            case 2:
                break;
            case 3:

                break;
        }
    }
    public static  void Executor(Object obj)
    {
        Executor executor = (Executor) obj;
        System.out.println("Welcome to our Intranet Executor");
        System.out.println("Hello " + executor.name + " " + executor.surname);
        System.out.println("1)View New Orders\n2)View Done Orders\n3)View not Done Orders");
        choose = scan.nextInt();
        switch (choose)
        {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }
    public static void Student(Object obj)
    {
        Student myStudent = (Student) obj;
        System.out.println("Hello " + myStudent.surname + " " + myStudent.name);
        System.out.println("Welcome to our Intranet");
        System.out.println("1)Register for a course\n2)View Courses\n3)View Transcript");
        choose = scan.nextInt();
        switch (choose)
        {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }
    /*public static void test()
    {
          System.out.println("Hello!!!\n How do you want to logIn to our Intranet?");
          System.out.println("1)Admin\n2)Manager\n3)Executor\n4)Teacher\n5)Student");
          int choose;
          choose = scan.nextInt();
          switch (choose)
          {
              case 1:
                  Admin ad  = new Admin();
                  prove("infoAdmin.txt",ad);
                  break;
              case  2:
                  Manager mng = new Manager();
                  prove("infoManager.txt",mng);
                  break;
              case 3:
                  Executor ex = new Executor();
                  prove("infoExecutor.txt",ex);
                  break;
              case 4:
                  Teacher tch = new Teacher();
                  prove("infoTeacher.txt",tch);
                  break;
              case 5:
                  Student ourS = new Student();
                  prove("infoStudent.txt",ourS);
                  break;
          }
    }*/
    /*public  static  void prove(String s,Object obj){
        System.out.println("Enter the login:");
        log = scan.next();
        System.out.println("Enter the password");
        par = scan.next();
        String logpar = (log + par).hashCode() + "";
        boolean flag = false;
        Vector<Object> t = new Vector<>();
        if(obj instanceof  Student)
        {
            t  = (Vector<Student>) obj;
        }
        if(obj instanceof  Admin)
        {
            Vector<Admin> t  = (Vector<Admin>) obj;
        }
        if(obj instanceof  Executor)
        {
            Vector<Executor> t  = (Vector<Executor>) obj;
        }
        if(obj instanceof  Manager)
        {
            Vector<Manager> t  = (Vector<Manager>) obj;
        }
        if(obj instanceof  Teacher)
        {
            Vector<Teacher> t  = (Vector<Teacher>) obj;
        }
        try {
            FileInputStream file_in = new FileInputStream(s);
            ObjectInputStream ois = new ObjectInputStream(file_in);
            for(int i = 0;i<t.size();i++)
            {
                   String logpar1 = (t.get(i).login + t.get(i).password).hashCode() + "";
                   if(logpar.equals(logpar1))
                   {
                       obj = t.get(i);
                       flag = true;
                       break;
                   }
            }
            ois.close();
        } catch (Exception e){
            System.out.println("error");
        }
        if(flag == true)
        {
            if(obj instanceof  Student)
            {
                Student(obj);
            }
            if(obj instanceof  Teacher)
            {
                Teacher(obj);
            }
            if(obj instanceof Executor)
            {
                Executor(obj);
            }
            if(obj instanceof Manager)
            {
                Manager(obj);
            }
            if(obj instanceof  Admin)
            {
                Admin(obj);
            }
        }
        else
        {
            if(obj instanceof  Student)
            {
                prove("infoStudent.txt",obj);
            }
            if(obj instanceof  Teacher)
            {
                prove("infoTeacher.txt",obj);
            }
            if(obj instanceof Executor)
            {
                prove("infoExecutor.txt",obj);
            }
            if(obj instanceof Manager)
            {
                prove("infoManager.txt",obj);
            }
            if(obj instanceof  Admin)
            {
                prove("infoAdmin.txt",obj);
            }
        }
    }
*/


}