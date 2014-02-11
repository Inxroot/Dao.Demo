package com.anand.test;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

	List<Student> students;
	public StudentDaoImpl(){
		students =new ArrayList<Student>();
		Student std1 = new Student("Robert",0);
		Student std2 = new Student("Staxx",0);
		students.add(std1);
		students.add(std2);
		
		
	}
	
	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return students;
	}

	@Override
	public Student getStudent(int rollNo) {
		// TODO Auto-generated method stub
		return students.get(rollNo);
	}

	@Override
	public void updateStudent(Student student) {
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("Student: Roll No " + student.getRollNo() +", updated in the database");

	}

	@Override
	public void deleteStudent(Student student) {
		
		students.remove(student.getRollNo());
		System.out.println("Student: roll no "+student.getRollNo()+"got removed ");
		
	}

}
