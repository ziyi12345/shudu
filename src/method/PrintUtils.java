package method;

import entity.Department;
import entity.Student;
import global.Global;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.io.FileWriter;

public class PrintUtils {
    public PrintUtils() {
    }
   
    public void printStudent(List<Student> stulist) {
    	         File file = new File("g:output_condition1.txt");
    	         FileWriter fw;
    	    	  if (!file.exists()) {  
    	    	        try {  
    	    	            file.createNewFile();   
    	    	            fw=new FileWriter(file);
    	    	  	Iterator var3 = stulist.iterator();
        while(var3.hasNext()) {
            Student s = (Student)var3.next();
            int[] a = s.getSapplication();
            int[] b = s.getdepartmentId();
            
            		 fw.write("ѧ��������" + s.getsName());
            		 fw.write("\r\n");
            		 fw.write("ѧ�����㣺" + s.getGradePoint());
            		 fw.write("\r\n");
            		 fw.write("ѧ�����㣺" + s.getGradePoint());
            		 fw.write("\r\n");
            		 fw.write("ѧ��־Ը��" + a[0] + " " + a[1] + " " + a[2] + " " + a[3] + " " + a[4]);
            		 fw.write("\r\n");
            		 fw.write("ѧ����������" + s.getdepartmentCount());
            		 fw.write("\r\n");
            		 fw.write("...................");
            		 fw.write("\r\n");
    	    	  	}   fw.close();
    	      }catch(Exception e){
    	          e.printStackTrace();}
    	    	  }
    }

    public void printDepartment(List<Department> departmentlist) {
    	   File file = new File("g:output_condition2.txt");
	         FileWriter fw;
	    	  if (!file.exists()) {  
	    	        try {  
	    	            file.createNewFile();   
	    	            fw=new FileWriter(file);
    	for(Department t:departmentlist){
    		fw.write(t.toString());
    		fw.write("\r\n");
    		fw.write("-------���䵽��ѧ��--------");
    		fw.write("\r\n");
			for(Student s:t.getMyStudent()){
				fw.write("ѧ��������"+s.getsName());
				fw.write("\r\n");
				fw.write("ѧ���ۺ�ֵ��"+s.getGradePoint());
				fw.write("\r\n");
			}
		}
		fw.close();
	}
	      catch(Exception e){
	          e.printStackTrace();}
	    	  }
	    	  }

	  
    public void printFinishedTeach() {
    	File file3 = new File("g:output_condition3.txt");
        FileWriter fw;
   	  if (!file3.exists()) {  
   	        try {  
   	            file3.createNewFile();   
   	            fw=new FileWriter(file3);
   	            fw.write("��ǰ������������������" + Global.doneDepartmentList.size());
   	          fw.write("\r\n");
   	  for(Department t:Global.doneDepartmentList){
        	fw.write(t.toString());
        	fw.write("-------���䵽��ѧ��--------");
        	fw.write("\r\n");
            for(Student s:t.getMyStudent()){
                fw.write("ѧ��������" + s.getsName());
                fw.write("\r\n");
            }
            	fw.write("\r\n");
            
        }fw.close();
   	        }catch(Exception e){
	          e.printStackTrace();}
    }
    }
   public void printUnfinishedDepartment(){
   	 File file = new File("g:output_condition4.txt");
        FileWriter fw;
   	  if (!file.exists()) {  
   	        try {  
   	            file.createNewFile();   
   	            fw=new FileWriter(file);

   	System.out.println("��ǰ����δ������������"+Global.departmentList.size());
   	fw.write("\r\n");
   	for(Department t:Global.departmentList){
   		System.out.println(t.toString());
   		fw.write("\r\n");
   		System.out.println("-------���䵽��ѧ��--------");
   		fw.write("\r\n");
   		for(Student s:t.getMyStudent()){
   			System.out.println("ѧ��������"+s.getsName()+"  ѧ�����㣺"+s.getGradePoint());
   			fw.write("\r\n");
   			
   		}
   		fw.write("\r\n");	}
   	fw.write("\r\n");
   	fw.write("\r\n");
   fw.close();}
   catch(Exception e){
       e.printStackTrace();}
   	        }
}
}