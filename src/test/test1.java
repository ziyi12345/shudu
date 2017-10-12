package test;

import global.Global;
import method.CreateMember;
import method.PrintUtils;

public class test1 {
    public test1() {
    }

    public static void main(String[] args) {
        CreateMember cm = new CreateMember();
        PrintUtils printUtils = new PrintUtils();
        Global.departmentList = cm.createAllTeacher();
        Global.studentList = cm.createAllStudent();
        printUtils.printUnfinishedDepartment();
    }
}

