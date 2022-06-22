package com.example.learn.loose;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {

	public static void main(String[] args) {
		System.out.println("program started.....");
		
		ApplicationContext context =new AnnotationConfigApplicationContext(Config.class);
		
		StudentService bean = context.getBean("studentService", StudentService.class);
		bean.getHelper().help();

	}

}
