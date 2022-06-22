package com.example.learn.loose;

import org.springframework.stereotype.Component;

@Component("help1")
public class HelperImpl1 implements Helper{

	public void help() 
		{
			System.out.println("This is helping class 1.....");
			System.out.println("wow this is amazing .... ");
		}
	}


