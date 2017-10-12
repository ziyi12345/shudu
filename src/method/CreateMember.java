package method;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import entity.Student;
import entity.Department;
import global.Global;


public class CreateMember {
	public String createStudentName(){		
		String stringBase = "abcdefghijklmnopqrstuvwxyz";
		Random random = new Random();
		StringBuffer studentName = new StringBuffer();     
		    for (int i = 0; i < 4; i++) {     
		        int number = random.nextInt(stringBase.length());     
		        studentName.append(stringBase.charAt(number));     
		    }     
		    return studentName.toString();    		
	}

	public float createGradePoint(){
		Random random = new Random();
		float gradePoint = random.nextFloat()*4+1;
		gradePoint =  (float) ((int)((gradePoint*100+5))/100.0);
		return gradePoint;
	}


	public int[] creatApplication(){
		int[] application = new int[5];
		Random random = new Random ();  
        boolean[]  bool = new boolean[20];  
        int randInt = 0;  

        for(int i = 0; i < 5 ; i++) {  
            do{  
                randInt  = random.nextInt(20);  
                         }while(bool[randInt]);   
            bool[randInt] = true; 
            application[i]=randInt+1;
        }
		return application;
		
		
	}
	public int[] creatCharacter(){
		int[] application = new int[5];
		Random random = new Random ();  
        boolean[]  bool = new boolean[5];  
        int randInt = 0;  

        for(int i = 0; i < 3 ; i++) {  
            do{  
                randInt  = random.nextInt(5);  
                         }while(bool[randInt]);   
            bool[randInt] = true; 
            application[randInt]=1;
        }
		return application;
		
		
	}
	
	public int[] creatnCharacter(){
		int[] application = new int[2];
		Random random = new Random ();  
        boolean[]  bool = new boolean[5];  
        int randInt = 0;  

        for(int i = 0; i < 2 ; i++) {  
            do{  
                randInt  = random.nextInt(5);  
                         }while(bool[randInt]);   
            bool[randInt] = true; 
            application[i]=randInt;
        }
		return application;	
	}
	public int[] creatTime(){
		int[] application = new int[10];
		Random random = new Random ();  
        boolean[]  bool = new boolean[10];  
        int randInt = 0;  

        for(int i = 0; i < 3 ; i++) {  
            do{  
                randInt  = random.nextInt(10);  
                         }while(bool[randInt]);   
            bool[randInt] = true; 
            application[randInt]=1;
        }
		return application;
		
		
	}
	
public int[] creatnTime(){
		int[] application = new int[3];
		Random random = new Random ();  
        boolean[]  bool = new boolean[10];  
        int randInt = 0;  

        for(int i = 0; i < 3 ; i++) {  
            do{  
                randInt  = random.nextInt(10);  
                         }while(bool[randInt]);   
            bool[randInt] = true; 
            application[i]=randInt;
        }
		return application;	
	}
	
	public List<Student> createAllStudent(){
		CreateMember cm = new CreateMember();
		List<Student> studentList= new ArrayList<Student>();
		for(int i=0;i<300;i++){
		Student s = new Student(); 
		s.setsName(cm.createStudentName());
		s.setGradePoint(cm.createGradePoint());
		s.setSapplication(cm.creatApplication());
		s.setdepartmentId(cm.creatdepartmentId());
		s.setComposite(0);
		s.setdepartmentCount(0);
		s.settime(cm.creatTime());
		s.setCharacter(cm.creatCharacter());
		studentList.add(s);
		
		}
		return studentList;
	}
	
	




	private int[] creatdepartmentId() {
		int[] application = new int[5];
		
		return application;
	}

	public String createTeacherName(){
			
			String stringBase = "abcdefghijklmnopqrstuvwxyz";
			Random random = new Random();
			StringBuffer teacherName = new StringBuffer();     
			    for (int i = 0; i < 4; i++) {     
			        int number = random.nextInt(stringBase.length());     
			        teacherName.append(stringBase.charAt(number));     
			    }     
			    return teacherName.toString();    
			
		}
	

	public int createSectionMax(){
		Random random = new Random();
		int sectionMax = random.nextInt(6)+10;
		return sectionMax;
	}
	

	public List<Department> createAllTeacher(){
		CreateMember cm = new CreateMember();
		List<Department> departmentList= new ArrayList<Department>();
		for(int i=1;i<=20;i++){
		Department t = new Department();
		t.settId(i);
		t.settName(cm.createTeacherName());
		int temp = cm.createSectionMax();
		Global.countAll+=temp;
		t.setSectionMax(temp);
		t.setSectionRest(temp);
		t.setnTime(cm.creatnTime());
		t.setnCharacter(cm.creatnCharacter());
		departmentList.add(t);
		}
		return departmentList;
	}
}
