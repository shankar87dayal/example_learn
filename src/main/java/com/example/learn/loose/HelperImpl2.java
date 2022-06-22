package com.example.learn.loose;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("help2")
//@Primary
public class HelperImpl2 implements Helper{

	public void help() {
		System.out.println("This is helping class2.....");
		
	}

}
