package com.example.learn.annotation;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("samosa")
//@Lazy
public class Samosa {

	boolean withchatni=false;

	
	public Samosa() {
		System.out.println("it is defoult constructor....");
	}


	@Override
	public String toString() {
		return "Samosa [withchatni=" + withchatni + "]";
	}
	
	
}
