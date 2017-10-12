package entity;

import java.util.ArrayList;
import java.util.List;

public class Department {
	
	private int tId;  
	private String tName; 
	private int sectionMax;  
	private int sectionRest;  
	private List<Student> myStudent = new ArrayList<Student>(); 
	private float heat; 
	private int[] nCharacter=new int[2]; 
	private int[] nTime=new int[3];
		
    public List<Student> getMyStudent() {
		return myStudent;
	}
	public void setMyStudent(List<Student> myStudent) {
		this.myStudent = myStudent;
	}

	public  int gettId() {
		return tId;
	}

	public void settId(int tId) {
		this.tId = tId;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public int getSectionMax() {
		return sectionMax;
	}

	public void setSectionMax(int sectionMax) {
		this.sectionMax = sectionMax;
	}

	public int getSectionRest() {
		return sectionRest;
	}

	public void setSectionRest(int sectionRest) {
		this.sectionRest = sectionRest;
	}
	public void addStudent(Student s){
		myStudent.add(s);
	}
	
	public float getHeat() {
		return heat;
	}
	public void setHeat(float heat) {
		this.heat = heat;
	}
	public String toString() {
		return "部门编号"+tId+" | "+"部门姓名"+tName+" | "+"最大人数"+sectionMax+" | "+"剩余人数"+sectionRest;
	}
	public void setnTime(int[] nTime) {
		this.nTime=nTime;
	}
	public void setnCharacter(int[] nCharacter) {
		this.nCharacter=nCharacter;
	}

	public int[] getnTime() {
	return nTime;
}
	public int[] getnCharacter() {
	return nCharacter;
}
}
