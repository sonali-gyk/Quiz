package com.exceptions;

import com.user.MainOne;

public class RepeatExamException extends RuntimeException{

	//String msg;
	
	public RepeatExamException(String msg)
	{
	super(msg);
            System.err.println(getMessage()+"\n\t\t\t");
            MainOne.mainn1();
	}
	
	
}
