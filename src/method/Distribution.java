package method;

import entity.Student;
import entity.Department;
import global.Global;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import javax.sound.sampled.Line;

public class Distribution {
 



	public Distribution() {
    }

    public void allocteStudent(int round, float g, float v,float c) {
        int checked = 0;int C=1;
        Iterator departmentIterator = Global.departmentList.iterator();

        while(true) {
            while(departmentIterator.hasNext()) {
            	Department department = (Department)departmentIterator.next();
                List<Student> tempStudentList = new ArrayList();
                List<Student> countStudentList = new ArrayList();
                Iterator var10 = Global.studentList.iterator();

                Student student;
                while(var10.hasNext()) {
                    student = (Student)var10.next();
                    int[] application = student.getSapplication();
                    if (application[round] == department.gettId()) {
                        tempStudentList.add(student);
                    }
                }

                var10 = tempStudentList.iterator();

                while(var10.hasNext()) {
                    student = (Student)var10.next();
                    GetTempComposite gtp = new GetTempComposite();
                    int[] tempComposite = new int[2];
                    tempComposite = gtp.getComposite(student, round);
                    float composite = 0.0F;
                    float gradePoints = 0.0F;
                    gradePoints = student.getGradePoint();
                    composite = gradePoints * g + tempComposite[0]* v+tempComposite[1]*c;
                    student.setComposite(composite);
                }

                Collections.sort(tempStudentList, new sortbypoint());
                int sectionCurrent = department.getSectionRest();
                if (tempStudentList.size() >= sectionCurrent) {
                    List<Student> myStudentList = new ArrayList();
                    for (int i = 0; i < sectionCurrent; i++) {
                        Student s = tempStudentList.get(i);
                        
                        myStudentList.add(s);
                        department.addStudent(s);    
                        
                        C=s.getdepartmentCount();
                        C++;
                       
                        if(C==1)
                        	{Global.countStu++;}
                        s.setdepartmentCount(C);
                        tempStudentList.set(i,s); 
                        ++checked;
                    }

                    sectionCurrent -= sectionCurrent;
                    department.setSectionRest(sectionCurrent);
                    Global.doneDepartmentList.add(department);
                    departmentIterator.remove();
                } else {
                    sectionCurrent -= tempStudentList.size();
                    department.setSectionRest(sectionCurrent);

                    for(int i = 0; i < tempStudentList.size(); ++i) {
       
                    	Student s = (Student)tempStudentList.get(i);
                        department.addStudent(s);
                        C=s.getdepartmentCount();
                        C++; 
                        s.setdepartmentCount(C);
                        tempStudentList.set(i,s);

                        if(C==1)
                        	Global.countStu++; 
                        ++checked;
                    }
                }
            }

            return;
        }
    }

  

	class sortbypoint implements Comparator {
    	sortbypoint() {
        }

        public int compare(Object o1, Object o2) {
            Student s1 = (Student)o1;
            Student s2 = (Student)o2;
            float temp1 = s1.getComposite();
            float temp2 = s2.getComposite();
            if (temp1 < temp2) {
                return 1;
            } else {
                return temp1 == temp2 ? 0 : -1;
            }
        }
    }
}
