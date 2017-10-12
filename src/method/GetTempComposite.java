package method;

import entity.Student;
import entity.Department;
import global.Global;
import java.util.Iterator;

public class GetTempComposite {
	
	public int[] getComposite(Student student,int round){
		//获得学生志愿
		int t1=0,t2=0,ta=0,ca=0,i=0,x=0;
		int[] temarr=new int[2];
		int[] tempValue = student.getSapplication();
		//记录学生此轮综合值
		int tempComposite=0;
	
		//变量此轮及之后学生志愿所选教师的热度		
		for(i=round;i<=round;i++){
			
			//志愿不重复，找到相符就跳出
			for(Department department : Global.departmentList ){
				//当前志愿与教师id相符
				if(tempValue[i]==department.gettId()){
					//累加
					int [] dt=department.getnTime();
					int [] dc=department.getnCharacter();
			       	int [] st=student.gettime();
					int [] sc=student.getcharacter();
					for( x = 0;x<3;x++)
					{t1=dt[x];
					if(st[t1]==0)
					ta=ta+2;
					}
					for(x=0;x<2;x++)
					{t2=dc[x];
					if(sc[t2]==1)
					ca=ca+2;}
		           break;                        
				}				
			}		
		}		
		temarr[0]=ta;
		temarr[1]=ca;    
	    return temarr;

	}

}
