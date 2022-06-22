package com.example.learn.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("studentService")
public class StudentService {
	
	@Autowired
	private Student student;
	
	
	
	public StudentService(Student student) {
	System.out.println("Autowiring using constructor...");
		this.student = student;
	}
	public Student getStudent() {
		return student;
	}
	
	public void setStudent(Student student) {
		System.out.println("Autowiring using settet injection....");
		this.student = student;
	}
	
	

}
