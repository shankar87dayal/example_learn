package com.example.learn.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.example.learn.annotation"})
public class Config2 {

	@Bean(name = "teacher")
	public Teacher getTeacher()
	{
		Teacher teacher=new Teacher();
		teacher.setId(1);
		teacher.setName("Shankar Dayal");
		
		return teacher;
	}
}
