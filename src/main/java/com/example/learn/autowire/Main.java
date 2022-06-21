package com.example.learn.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(" Application started...........");
		
		 ApplicationContext context=new ClassPathXmlApplicationContext("com/example/learn/autowire/config.xml");
		 
		 EmployeeService bean = context.getBean("employeeService" ,EmployeeService.class);
		 
		 System.out.println(bean.getEmployee());
		 System.out.println(bean.getAddress());

	}

}
