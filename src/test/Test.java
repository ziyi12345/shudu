package test;

import global.Global;
import method.CreateMember;
import method.Distribution;
import method.PrintUtils;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public Test() {
    }

    public static void main(String[] args) {
        for(int k = 1; k <= 100; ++k) {
            Global.countAll = 0;
            Global.countStu = 0;
            CreateMember cm = new CreateMember();

            do {
                Global.countAll = 0;
                Global.departmentList = cm.createAllTeacher();
            } while(Global.countAll < 100);
            float g = 0.2f;
            float v = 0.2f;
            float c = 0.2f;
            System.out.println("输入优先类型：" );
            Scanner sr = new Scanner(System.in);//初始化scanner对象
            int num = sr.nextInt();
            do
            {switch(num)
            { case 1:g=0.6f;break;
            case 2:v=0.6f;break;
            case 3:c=0.6f;break;
            default: System.out.println("输入错误请重新输入：" );num = sr.nextInt();}
            }
            while(num!=1&&num!=2&&num!=3);
            Global.studentList = cm.createAllStudent();
            Global.doneDepartmentList = new ArrayList<>();
            System.out.println("部门限选总人数：" + Global.countAll);
            System.out.println("部门总数：" + Global.departmentList.size());
            System.out.println("学生总数：" +Global.studentList.size());
          
            Distribution distribution = new Distribution();

            for(int i = 0; i < 5; ++i) {
                distribution.allocteStudent(i, g, v, c);
            }

            PrintUtils printUtils = new PrintUtils();
            printUtils.printUnfinishedDepartment();
            printUtils.printFinishedTeach();
           
            printUtils.printStudent(Global.studentList);
            System.out.println("被选中学生人数：" + Global.countStu + "  百分比：" + (double)Global.countStu* 1.0D / 300.0D * 100.0D + "%");
        }

    }
}