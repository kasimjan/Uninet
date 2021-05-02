import java.util.*;

import java.io.*;

public class Test{
    public static ArrayList<Student> students = new ArrayList<Student>();
    public static ArrayList<Teacher> teachers = new ArrayList<Teacher>();
    public static ArrayList<Course> courses = new ArrayList<Course>();
    public static ArrayList<Manager> managers = new ArrayList<Manager>();
    public static ArrayList<Executor> executors = new ArrayList<Executor>();
    public static ArrayList<Order> orders = new ArrayList<Order>();
    public static ArrayList<CourseFile> courseFiles = new ArrayList<CourseFile>();
    private static Admin admin;
    private static  int choose,firstA, secondA, exam;
    private static  String courseTitle,msg;
    private static Scanner scan = new Scanner(System.in);
    private static boolean exit = false;
    private static void serialize(){
    	String[] typeof = new String[7];
        typeof[0] = "Student";
        typeof[1] = "Teacher";
        typeof[2] = "Course";
        typeof[3] = "Manager";
        typeof[4] = "Executor";
        typeof[5] = "Order";
        typeof[6] = "CourseFile";
        for(int i = 0;i<7;i++){
            String type = typeof[i];
            switch (type){
            	case "Student":
            		try{ 	
				      FileOutputStream fos = new FileOutputStream("info" + type + ".txt");
				      ObjectOutputStream oos = new ObjectOutputStream(fos);
				      oos.writeObject(students);
				      oos.flush();
				      oos.close();
				      fos.close();
            		}
            		catch(FileNotFoundException ex){
            			System.out.println("File Not Found");            
            		}
            		catch (IOException ex){     
            			System.out.println("IOException");
            		}
            		break;
            	case "Teacher":	
            		try{ 
			        	 FileOutputStream fos = new FileOutputStream("info" +type + ".txt");
			             ObjectOutputStream oos = new ObjectOutputStream(fos);
			             oos.writeObject(teachers);
			             oos.flush();
			             oos.close();             
			             fos.close();
            		}catch(FileNotFoundException ex){          
            			System.out.println("File Not Found"); 
            		}catch (IOException ex){     
            			System.out.println("IOException");
            		}
            		break;
            	case "Executor":       
            		try{ 
	        		  FileOutputStream fos = new FileOutputStream("info" +type + ".txt");
	                  ObjectOutputStream oos = new ObjectOutputStream(fos);
	                  oos.writeObject(executors);
	                  oos.flush();
	                  oos.close();
	                  fos.close();  
            		}catch(FileNotFoundException ex){   
            			System.out.println("File Not Found");
            		}catch (IOException ex){  
            			System.out.println("IOException");
            		}
            		break;
                case "Manager":	
                	try{
	                  FileOutputStream fos = new FileOutputStream("info" +type + ".txt");
	                  ObjectOutputStream oos = new ObjectOutputStream(fos);
	                  oos.writeObject(managers);
	                  oos.flush();
	                  oos.close();
	                  fos.close();  
                	}catch(FileNotFoundException ex){ 
                		System.out.println("File Not Found"); 
                	}catch (IOException ex){
                        System.out.println("IOException");    
                    }
                    break;
                case "CourseFile":
                    try{
                        FileOutputStream fos = new FileOutputStream("info" +type + ".txt");
                        ObjectOutputStream oos = new ObjectOutputStream(fos);
                        oos.writeObject(courseFiles);
                        oos.flush();
                        oos.close();
                        fos.close();
                    }catch(FileNotFoundException ex){
                        System.out.println("File Not Found");
                    }catch (IOException ex){
                        System.out.println("IOException");
                    }
                    break;
                case "Course":
                    try{
                        FileOutputStream fos = new FileOutputStream("info" +type + ".txt");
                        ObjectOutputStream oos = new ObjectOutputStream(fos);
                        oos.writeObject(courses);
                    }catch(FileNotFoundException ex){
                        System.out.println("File Not Found");
                    }catch (IOException ex){
                        System.out.println("IOException");
                    }
                    break;
                case "Order":
                    try{
                        FileOutputStream fos = new FileOutputStream("info" +type + ".txt");
                        ObjectOutputStream oos = new ObjectOutputStream(fos);
                        oos.writeObject(orders);
                        oos.flush();
                        oos.close();
                        fos.close();
                    }catch(FileNotFoundException ex){
                        System.out.println("File Not Found");
                    }catch (IOException ex){
                        System.out.println("IOException");
                    }
                    break;
            }
        }
    }
    private static void deserialize(){
        String[] typeof = new String[7];
        typeof[0] = "Student";
        typeof[1] = "Teacher";
        typeof[2] = "Course";
        typeof[3] = "Manager";
        typeof[4] = "Executor";
        typeof[5] = "Order";
        typeof[6] = "CourseFile";
        for(int i = 0;i<7;i++){
            String type = typeof[i];
            switch (type){
                case "Student":  
                	try {
			           FileInputStream fis = new FileInputStream("info" + type + ".txt");
			           ObjectInputStream ois = new ObjectInputStream(fis);
			           students = (ArrayList) ois.readObject();
			           ois.close();
			           fis.close();
                    }
                	catch(FileNotFoundException ex){
                        System.out.println("Sorry, file not found");
                    }catch (IOException ex) {
                        students = new ArrayList<>();
                    }catch(ClassNotFoundException ex){
                        System.out.println("Sorry, that is class not found");
                    }
                    break;
                case "Teacher":
                    try {
                        FileInputStream fis = new FileInputStream("info" + type + ".txt");
                        ObjectInputStream ois = new ObjectInputStream(fis);
                        teachers = (ArrayList) ois.readObject();
                        ois.close();
                        fis.close();
                    }
                    catch(FileNotFoundException ex){
                        System.out.println("Sorry, file not found");
                    }catch (IOException ex) {
                        teachers = new ArrayList<>();
                    }catch(ClassNotFoundException ex){
                        System.out.println("Sorry, that is class not found");
                    }
                    break;
                case "Executor":
                    try {
                        FileInputStream fis = new FileInputStream("info" + type + ".txt");
                        ObjectInputStream ois = new ObjectInputStream(fis);
                        executors = (ArrayList) ois.readObject();
                        ois.close();
                        fis.close();
                    }
                    catch(FileNotFoundException ex){
                        System.out.println("Sorry, file not found");
                    }catch (IOException ex) {
                        executors = new ArrayList<>();
                    }catch(ClassNotFoundException ex){
                        System.out.println("Sorry, that is class not found");
                    }
                    break;
                case "Manager":
                    try {
                        FileInputStream fis = new FileInputStream("info" + type + ".txt");
                        ObjectInputStream ois = new ObjectInputStream(fis);
                        managers = (ArrayList) ois.readObject();
                        ois.close();
                        fis.close();
                    }
                    catch(FileNotFoundException ex){
                        System.out.println("Sorry, file not found");
                    }catch (IOException ex) {
                        managers = new ArrayList<>();
                    }catch(ClassNotFoundException ex){
                        System.out.println("Sorry, that is class not found");
                    }
                    break;
                case "CourseFile":
                    try {
                        FileInputStream fis = new FileInputStream("info" + type + ".txt");
                        ObjectInputStream ois = new ObjectInputStream(fis);
                        courseFiles = (ArrayList) ois.readObject();
                        ois.close();
                        fis.close();
                    }
                    catch(FileNotFoundException ex){
                        System.out.println("Sorry, file not found");
                    }catch (IOException ex) {
                        courseFiles = new ArrayList<>();
                    }catch(ClassNotFoundException ex){
                        System.out.println("Sorry, that is class not found");
                    }
                    break;
                case "Course":
                    try {
                        FileInputStream fis = new FileInputStream("info" + type + ".txt");
                        ObjectInputStream ois = new ObjectInputStream(fis);
                        courses = (ArrayList) ois.readObject();
                        ois.close();
                        fis.close();
                    }
                    catch(FileNotFoundException ex){
                        System.out.println("Sorry, file not found");
                    }catch (IOException ex) {
                        courses = new ArrayList<>();
                    }catch(ClassNotFoundException ex){
                        System.out.println("Sorry, that is class not found");
                    }
                    break;
                case "Order":
                    try {
                        FileInputStream fis = new FileInputStream("info" + type + ".txt");
                        ObjectInputStream ois = new ObjectInputStream(fis);
                        orders = (ArrayList) ois.readObject();
                        ois.close();
                        fis.close();
                    }
                    catch(FileNotFoundException ex){
                        System.out.println("Sorry, file not found");
                    }catch (IOException ex) {
                        orders = new ArrayList<>();
                    }catch(ClassNotFoundException ex){
                        System.out.println("Sorry, that is class not found");
                    }
                    break;
            }
        }
    }

    private static Pair<String,String> enter(){
        System.out.println("Please, write your login and password");
        String login = scan.next();
        String password = scan.next();
        Pair<String,String> pair = new Pair<>(login, password);
        return pair;
    }
    private static boolean doesExist(Object o,String type){
        boolean ok = false;
        switch (type){
            case "Student":
                Student student = (Student)o;
                for(Student s: students){
                    if(s.getLogin().equals(student.getLogin())){
                        ok = true;
                        break;
                    }
                }
                break;
            case "Teacher":
                Teacher teacher = (Teacher)o;
                for(Teacher t: teachers){
                    if(t.getLogin().equals(teacher)){
                        ok = true;
                        break;
                    }
                }
                break;
            case "Manager":
                Manager manager = (Manager)o;
                for(Manager m: managers){
                    if(m.getLogin().equals(manager)){
                        ok = true;
                        break;
                    }
                }
                break;
            case "Executor":
                Executor executor = (Executor)o;
                for(Executor e: executors){
                    if(e.getLogin().equals(executor)){
                        ok = true;
                        break;
                    }
                }
                break;
        }
        return ok;
    }
    private static void check(Pair<String,String> pair,String type){
            boolean ok = false;
            int k;
            switch (type){
            case "Student": 
            k = 0;       
            for(int i = 0;i<students.size();i++){
                if(students.get(i).getLogin().equals(pair.getKey()) && students.get(i).getPassword().equals(pair.getValue())){
                   ok = true;
                    k = i;
                    break;
                }                
            }
            if(ok){          
            	Student student = students.get(k);
            	boolean exit1 = false;
	           while(!exit1){
		           System.out.println("Hello, " + student.getName() + " " + student.getSurname());
		           System.out.println("Choose the what you want");
		           System.out.println("1)Register for a course\n2)View a courses\n3)View Transcript\n4) Exit");
		           choose = scan.nextInt();
		           switch (choose) {              
		           		case 1:            
					        System.out.println("These are all available courses");
					        System.out.println("Choose the course what you want study");
					        for(int i = 0;i<courses.size();i++)
					        {
					          System.out.println(i +1  + ")"  + courses.get(i).getTitle());
					           
					        }
					        choose = scan.nextInt();
					        student.setCourses(courses.get(choose - 1));
					        serialize();
					        deserialize();
					        break;
		           		case 2:
		           			boolean exit2 = false;
		           			while(!exit2){
		           				if(courses.size()!=0){
		           					if(student.getCourses() == null || student.getCourses().size() == 0){
		           						System.out.println("You have to register course, now you have no one active course");
		           						exit2 = true;
		           					}else{
		           						System.out.println("These are all your courses");
		           						System.out.println("Choose the course what you want to show");
		           						for(int i = 0;i<student.getCourses().size();i++)
		           						{
		           							System.out.println(i + 1 + ")" + student.getCourses().get(i).getTitle());                                       
		           						}
		           						choose = scan.nextInt();
		           						System.out.println(student.getCourses().get(choose - 1).getTitle());
		           						System.out.println("1)View files of course\n2)View Information about this course\n3)View my marks of this course\n4)Exit");
		           						switch (choose) {
		           						case 1:
		           							if(courses.get(choose - 1).getCourseFiles().size()!=0)
		           							{
								            for (int i = 0; i < student.getCourses().get(choose - 1).getCourseFiles().size(); i++) {
								            	System.out.println(student.getCourses().get(choose - 1).getCourseFiles().get(i));
								
								            }            
		           							}else{
		           								System.out.println("There is no available courseFiles" +"Teacher has to upload it");
		           							}
		           							exit2 = false;
		           								break;
								            case 2:
								            	System.out.println(student.getCourses().get(choose - 1).getTitle() + "\nCount of credit: " + student.getCourses().get(choose - 1).getCredits() + "\nCourse ID:" + student.getCourses().get(choose - 1).getId());
								            break;
								            case 3:
								            	System.out.println(student.getStudentInfo().get(student.getCourses().get(choose -1)).toString());
								            	break;
								            case 4:
								            	exit2 = true;
								            	serialize();
								            	deserialize();
								            	break; 
		           							}
		           					}

            }else{
                                            
      System.out.println("Sorry, there is no available course\n" +"Manager has to add course then check it up");
                      }
                   }
                                
         case 4:
           serialize();
           deserialize();
           exit1 = true;
           break;
                          
           }
                       
           }
            }
            else{
       System.out.println("Such student is not found OR (Combination of password and login is incorrect). Please. try again!");
                    
            }
           break;
           case "Teacher":
           k = 0;
           for(int i = 0;i<teachers.size();i++){
           if(teachers.get(i).getLogin().equals(pair.getKey()) && teachers.get(i).getPassword().equals(pair.getValue())){
           ok = true;
           k = i;
           break;
                       
           }
                    
           }
                   
           if(ok){
           Teacher teacher = teachers.get(k);
        System.out.println("Hello, " + teacher.getName() + " " + teacher.getSurname());
        System.out.println("1)View Courses\n2)Send order to IT support guys\n");
        choose = scan.nextInt();
        switch (choose)
                        
        {
          case 1:
          for(int i = 0;i<teacher.courses.size();i++)
        {
          System.out.println(teacher.courses.get(i));
        }
          System.out.println("Choose the course which you want");
          choose = scan.nextInt();
          Course myCourse = teacher.courses.get(choose -1);
          System.out.println("1)Add CourseFile\n2)Delete CourseFile\n3)Put Marks");
          choose = scan.nextInt();
          switch (choose)
         {
        case 1:
         CourseFile crsFile = new CourseFile();
         System.out.println("Enter the title of the courseFile");
          courseTitle = scan.next();
          crsFile.setTitle(courseTitle);
          myCourse.courseFiles.add(crsFile);
          courses.add(myCourse);
          serialize();
          deserialize();
          case 2:
         System.out.println("Choose the number of file which you want to delete");
         
         for(int i = 0;i<myCourse.courseFiles.size();i++){
                                         
        System.out.println(myCourse.courseFiles.get(i));
         }
                                        choose  = scan.nextInt();
                                        myCourse.courseFiles.remove(choose -1);
                                        courses.add(myCourse);
                                        serialize();
                                        deserialize();
                                        break;
                                    case 3:

                                        for(int i = 0;i<myCourse.getStudents().size();i++)
                                        {
                                            System.out.println(myCourse.getStudents().get(i));
                                            firstA = scan.nextInt();
                                            myCourse.students.get(i).marks.setFirstAttestation(firstA);
                                            secondA = scan.nextInt();
                                            myCourse.students.get(i).marks.setSecondAttestation(secondA);
                                            exam = scan.nextInt();
                                            myCourse.students.get(i).marks.setExam(exam);
                                            courses.add(myCourse);
                                            serialize();
                                            deserialize();
                                        }
                                        break;
                                }
                                break;

                            case 2:
                                System.out.println("Enter the message to IT support guy");
                                msg  = scan.next();
                                Order order = new Order(msg,orderType.NEW);
                                orders.add(order);
                                serialize();
                                deserialize();
                                break;
                        }

                    }else{
                        System.out.println("Such teacher is not found OR (Combination of password and login is incorrect). Please. try again!");
                    }
                    break;


                case "Executor":
                    k = 0;
                    for(int i = 0;i<executors.size();i++){
                        if(executors.get(i).getLogin().equals(pair.getKey()) && executors.get(i).getPassword().equals(pair.getValue())){
                            ok = true;
                            k = i;
                            break;
                        }
                    }
                    if(ok){
                        Executor executor = executors.get(k);
                        System.out.println("Hello, " + executor.getName() + " " + executor.getSurname());
                        System.out.println("1)View New Orders\n2)View other orders\n3)Exit");
                        boolean exit = false;
                        while(!exit){
                            choose = scan.nextInt();
                            switch (choose)
                            {
                                case 1:
                                    System.out.println("Choose order which you want to do");
                                    for(int i = 0;i<executor.orders.size();i++)
                                    {
                                        if(executor.orders.get(i).getType().equals( orderType.NEW))
                                        {
                                            System.out.println(executor.orders.get(i) + executor.orders.get(i).getType().toString());
                                        }
                                    }
                                    choose = scan.nextInt();
                                    executor.orders.get(choose - 1).getType().equals( orderType.ACCEPTED);
                                    break;
                                case 2:
                                    for(int i = 0;i<executor.orders.size();i++)
                                    {
                                        if(!executor.orders.get(i).getType().equals(orderType.NEW))
                                        {
                                            System.out.println(executor.orders.get(i) + executor.orders.get(i).getType().toString());
                                        }
                                    }
                                    break;
                                case 3:
                                    exit = true;
                                    break;

                            }
                            executors.add(executor);
                            serialize();
                            deserialize();
                        }

                    }else{
                        System.out.println("Such student is not found OR (Combination of password and login is incorrect). Please. try again!");
                    }

                    break;
                case "Manager":
                    k = 0;
                    for(int i = 0;i<managers.size();i++){
                        if(managers.get(i).getLogin().equals(pair.getKey()) && managers.get(i).getPassword().equals(pair.getValue())){
                            ok = true;
                            k = i;
                            break;
                        }
                    }
                    if(ok){
                        Manager manager = managers.get(k);
                        System.out.println("Hello, " + managers.get(k).getName() + " " + manager.getSurname());
                        boolean exit = false;
                        while(!exit){
                            System.out.println("What would you like to do?\n" +
                                    "1) add course\n" +
                                    "2) view information about student\n" +
                                    "3) view information about teacher\n" +
                                    "4) exit");
                            String command = scan.next();
                            switch (command){
                                case "1":
                                    Course course = new Course();
                                    System.out.println("Enter required information about course: ");
                                    System.out.print("Title: "); course.setName(scan.next());
                                    System.out.print("ID: "); course.setId(scan.next());
                                    System.out.print("Faculty: "); course.setFaculty(scan.next());
                                    System.out.print("Credits: "); course.setCredits(scan.nextInt());
                                    System.out.print("To add course you have to initialize teachers: \n");
                                    if(!teachers.isEmpty()){
                                        for(int i = 0;i<teachers.size();i++){
                                            System.out.println(i + 1 + ") " + teachers.get(i).toString());
                                        }
                                        System.out.println("Please enter sequence of number that were listed to corresponded teacher that will teach this course\n");
                                        int num = scan.nextInt();
                                        ArrayList<Teacher> cteach = new ArrayList<>();
                                            cteach.add(teachers.get(num-1));
                                            teachers.get(num-1).setCourses(course);
                                            course.setTeachers(cteach);
                                    }else{
                                        System.out.println("There are no available teachers! Admin has to add them");
                                    }
                                    boolean exist = false;
                                    for(Course inCourse: courses){
                                        if(course.equals(inCourse)){
                                            exist = true;
                                            break;
                                        }
                                    }
                                    serialize();
                                    deserialize();
                                    if(!exist){
                                        courses.add(course);
                                        System.out.println("Course was successfully added!");
                                    }else{
                                        System.out.println("Such course already exists");
                                    }
                                    break;
                                case "2":
                                    System.out.println("Enter login of the student: ");
                                    String login = scan.next();
                                    boolean isFound = false;
                                    for(Student student: students){
                                        if(student.getLogin().equals(login)){
                                            isFound = true;
                                            student.toString();
                                        }
                                    }
                                    if(!isFound){
                                        System.out.println("There are no such student. Try again!");
                                    }
                                    break;
                                case "3":
                                    System.out.println("Write login of the teacher: ");
                                    String log = scan.next();
                                    boolean ok1 = false;
                                    for(Teacher teacher: teachers){
                                        if(log.equals(teacher.getLogin())){
                                            teacher.toString();
                                            ok1 = true;
                                        }
                                    }
                                    if(!ok1){
                                        System.out.println("Such teacher is not found");
                                    }
                                    break;

                                case "4":
                                    serialize();
                                    deserialize();
                                    exit = true;
                                    break;
                            }
                        }
                    }else{
                        System.out.println("Such " + type + " is not found OR (Combination of password and login is incorrect). Please. try again!");
                    }
                    break;
                case "Admin":
                    try{
                        FileReader fr = new FileReader("C:\\Users\\User\\Desktop\\OOP\\lab\\Intranet\\bin\\admin.txt");
                        BufferedReader br = new BufferedReader(fr);
                        String line = br.readLine();
                        String[] a = line.split(" ");
                        admin = new Admin(a[0],a[1],a[2],a[3],a[4],Integer.parseInt(a[5]),Integer.parseInt(a[6]));
                        if(pair.getKey().equals(a[2])){
                            if(pair.getValue().equals(a[3])){
                                System.out.println("Welcome, " + a[0]);
                                boolean exit1 = false;
                                while(!exit1){
                                    System.out.println("There are listed that actions for you: ");
                                    System.out.print("1) add User\n" +
                                                     "2) view User\n" +
                                                     "3) reset password\n"+
                                                     "4) exit\n");
                                    switch(scan.next()){
                                        case "1":
                                            System.out.println("What kind of user would you like to add?: ");
                                            System.out.print("Student\n" +
                                                    "Teacher\n"+
                                                    "Executor\n" +
                                                    "Manager\n"+
                                                    "Exit\n");
                                            String userType = scan.next();
                                            switch (userType){
                                                case "Student":
                                                    System.out.println("Print all required information:  surname, name, login, password,  id, yearOfStudy, faculty, speciality, gpa");
                                                    String[] infoStudent = new String[9];
                                                    for(int i = 0;i<9;i++){
                                                        infoStudent[i] = scan.next();
                                                    }
                                                    
                                                    
                                                    Object student = admin.addUser(userType,infoStudent);
                                                    //Course cs = new Course("abc","123",12,"asd",teachers,students);
                                                    //courses.add(cs);
                                                    students.add((Student) student);
                                                    
                                                    break;
                                                case "Teacher": 
                                                    System.out.println("Print all required information:  surname, name, login, password,  id, salary, workExperience, faculty");
                                                    String[] infoTeacher = new String[8];
                                                    for(int i = 0;i<8;i++){
                                                        infoTeacher[i] = scan.next();
                                                    }
                                                    Object teacher1 = admin.addUser(userType,infoTeacher);
                                                    teachers.add((Teacher)teacher1);
                                                    break;
                                                case "Executor":
                                                    System.out.println("Print all required information:  surname, name, login, password,  id, salary ,workExperience");
                                                    String[] infoExecutor = new String[7];
                                                    for(int i = 0;i<7;i++){
                                                        infoExecutor[i] = scan.next();
                                                    }
                                                    Object executor = admin.addUser(userType,infoExecutor);
                                                    if(!doesExist(executor,userType)){
                                                        executors.add((Executor)executor);
                                                    }else{
                                                        System.out.println("Sorry, such " + userType + " already exists");
                                                    }
                                                    break;
                                                case "Manager":
                                                    System.out.println("Print all required information: surname, name, login, password, id, salary, workExperience");
                                                    String[] infoManager = new String[7];
                                                    for(int i = 0;i<7;i++){
                                                        infoManager[i] = scan.next();
                                                    }
                                                    Object manager = admin.addUser(userType,infoManager);
                                                    if(!doesExist(manager,userType)){
                                                        managers.add((Manager)manager);
                                                    }else{
                                                        System.out.println("Sorry, such " + userType + " already exists");
                                                    }
                                                    break;
                                                case "Exit":
                                                    exit1 = true;
                                                    serialize();
                                                    deserialize();
                                                    break;
                                            }
                                            serialize();
                                            deserialize();
                                            break;
                                        case "2":
                                            System.out.println("Print login of the user: ");
                                            String login = scan.next();
                                            boolean found = false;
                                            for(Student student: students){
                                                if(student.getLogin().equals(login)){
                                                    found = true;
                                                    System.out.println(student.toString());
                                                    break;
                                                }
                                            }
                                            for(Teacher teacher: teachers){
                                                if(teacher.getLogin().equals(login)){
                                                    found = true;
                                                    System.out.println(teacher.toString());
                                                    break;
                                                }
                                            }
                                            for(Executor executor: executors){
                                                if (executor.getLogin().equals(login)) {
                                                    found = true;
                                                    System.out.println(executor.toString());
                                                    break;
                                                }
                                            }
                                            for(Manager manager:managers){
                                                if(manager.getLogin().equals(login)){
                                                    found = true;
                                                    System.out.println(manager.toString());
                                                    break;
                                                }
                                            }
                                            if(!found){
                                                System.out.println("User is not found!");
                                            }
                                            break;
                                        case "3":
                                            boolean found2 = false;
                                            System.out.println("Print login of the user: ");
                                            login = scan.next();
                                            for(Student student: students){
                                                if(student.getLogin().equals(login)){
                                                    found2 = true;
                                                    System.out.println(student.toString());
                                                    System.out.println("Would you exactly like to change password of this user?[yes/no]");
                                                    if(scan.next().equals("yes")){
                                                        System.out.println("Enter password: ");
                                                        student.setPassword(scan.next());
                                                    }
                                                    break;
                                                }
                                            }
     for(Teacher teacher: teachers){
                                        
                                            	
     if(teacher.getLogin().equals(login)){
      
    	 found2 = true;

     System.out.println(teacher.toString());
                                                   
     System.out.println("Would you exactly like to change password of this user?[yes/no]");
                                                   
     if(scan.next().equals("yes")){
     System.out.println("Enter password: ");
     teacher.setPassword(scan.next());
       }
      break;
       }
       }
     for(Executor executor: executors){
     if (executor.getLogin().equals(login)) {
     found2 = true;
     System.out.println(executor.toString());
     System.out.println("Would you exactly like to change password of this user?[yes/no]");
     if(scan.next().equals("yes")){
     System.out.println("Enter password: ");
     executor.setPassword(scan.next());
       }
     break;
      }
     }
      for(Manager manager:managers){
      if(manager.getLogin().equals(login)){
      found2 = true;
      System.out.println(manager.toString());
      System.out.println("Would you exactly like to change password of this user?[yes/no]");
      if(scan.next().equals("yes")){
                                                        System.out.println("Enter password: ");
                                                        manager.setPassword(scan.next());
                                                    }
                                                    break;
                                                }
                                            }
                                            if(!found2){
                                                System.out.println("Such user is not found");
                                            }
                                            break;
                                        case "4":
                                            serialize();
                                            deserialize();
                                            exit1 = true;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                            }else{
                                System.out.println("Incorrect password. Try again");
                            }
                        }else{
                            System.out.println("Incorrect login. Try again!");
                        }
                    }catch(FileNotFoundException ex){
                        System.out.println("Admin file not found");
                        System.exit(1);
                    }catch(IOException ex){
                        System.out.println("IO exception");
                        System.exit(2);
                    }
                    break;
                default:
                    break;
            }
    }

    public static void welcome(){
    deserialize();
      while(!exit){
      System.out.println("HELLO, how would like to login to INTRANET?");
      System.out.println("Choose one of the listed options: ");
      System.out.println("  Admin");
      System.out.println("  Student");
      System.out.println("  Teacher");
      System.out.println("  Manager");
      System.out.println("  Executor");
      System.out.println("  OR type " + (char)34 + "exit" + (char)34 + " to leave program!");
      String type;
      type = scan.next();
      Pair<String,String> pair;
      if(type.equals("exit")){
      System.out.println("Good bye, have a nice day!");
      serialize();
      deserialize();
       exit = true;
      }
      else{
                
    	  if(type.equals("Admin") || type.equals("Student") || type.equals("Teacher") || type.equals("Manager")|| type.equals("Executor")) {
                    pair = enter();
                    check(pair,type);
                
    	  }else {
           
    		  System.out.println("INCORRECT, try again!");
                }
            }
        }
    }
}