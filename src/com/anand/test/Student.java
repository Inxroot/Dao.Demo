package com.anand.test;

public class Student {

	private String name;
	private int rollNo;
	Student (String name,int roll){
		this.name = name;
		this.rollNo =roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	
}
