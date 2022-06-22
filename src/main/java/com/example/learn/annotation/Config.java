package com.example.learn.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean(name = "student")
	public Student getStudent()
	{
		Student student = new Student();
		student.setId(1);
		student.setName("Ayan");
		student.setAddress("chandmari road patna");
		return student;
	}
	
	@Bean(name= "person")
	public Person person()
	{
		Person person = new Person();
		person.setName("Ravi ranjan");
		person.setCity("patna");
		return person;
	}
	
	
}
