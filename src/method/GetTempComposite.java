package method;

import entity.Student;
import entity.Department;
import global.Global;
import java.util.Iterator;

public class GetTempComposite {
	
	public int[] getComposite(Student student,int round){
		//���ѧ��־Ը
		int t1=0,t2=0,ta=0,ca=0,i=0,x=0;
		int[] temarr=new int[2];
		int[] tempValue = student.getSapplication();
		//��¼ѧ�������ۺ�ֵ
		int tempComposite=0;
	
		//�������ּ�֮��ѧ��־Ը��ѡ��ʦ���ȶ�		
		for(i=round;i<=round;i++){
			
			//־Ը���ظ����ҵ����������
			for(Department department : Global.departmentList ){
				//��ǰ־Ը���ʦid���
				if(tempValue[i]==department.gettId()){
					//�ۼ�
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
