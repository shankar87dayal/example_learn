package com.example.learn.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
	System.out.println("progam started...........");
	
	ApplicationContext context =new AnnotationConfigApplicationContext(Config.class, Config2.class);
	
	Person bean = context.getBean("person", Person.class);
	System.out.println(bean);
	
	Student bean2 = context.getBean("student", Student.class);
	System.out.println(bean2);
	
	Teacher bean3 = context.getBean("teacher", Teacher.class);
	System.out.println(bean3);

	
	Samosa bean4 = context.getBean("samosa",Samosa.class);
	System.out.println(bean4);
	
	StudentService bean5 = context.getBean("studentService",StudentService.class);
	System.out.println(bean5.getStudent());
	}

}
