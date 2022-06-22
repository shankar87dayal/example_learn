package com.example.learn.loose;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("studentService")
public class StudentService {

	@Autowired
	@Qualifier("help1")
	private Helper helper;

	public Helper getHelper() {
		return helper;
	}

	public void setHelper(Helper helper) {
		this.helper = helper;
	}
	
	
}
