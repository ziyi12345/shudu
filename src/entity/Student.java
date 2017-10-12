package entity;

import java.util.Arrays;

public class Student {
	private String sName; 
	private float gradePoint; 
	private int[] sapplication = new int[5];
	private int[] departmentId;
	private int departmentCount;
	private float composite;
	private int[] time =new int [10];
	private int[] character =new int[5];
	public Student() {
		
	}
	

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public float getGradePoint() {
		return gradePoint;
	}

	public void setGradePoint(float gradePoint) {
		this.gradePoint = gradePoint;
	}

	public int[] getSapplication() {
		return sapplication;
	}

	public void settime(int[] time) {
		this.time = time;
	}
	public void setCharacter(int[] character) {
		this.character = character;
	}
	public void setSapplication(int[] sapplication) {
		this.sapplication = sapplication;
	}

	public int[] getdepartmentId() {
		return departmentId;
	}

	public void setdepartmentId(int[] departmentId) {
		this.departmentId = departmentId;
	}



	public void setComposite(float composite) {
		this.composite = composite;
	}


	public String toString() {
		return "Student [sName=" + sName + ", gradePoint=" + gradePoint
				+ ", sapplication=" + Arrays.toString(sapplication)
				+ ", teacherId=" + departmentId + "]";
	}


	public int[] gettime() {
	return time;
}
	public int[] getcharacter() {
	return character;
}

	  public float getComposite() {
	        return this.composite;
	    }


	public int setdepartmentCount(int i) {
		return this.departmentCount = i;
		
	}


	public int getdepartmentCount() {
		return departmentCount;
	}

	  
}
