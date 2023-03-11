package com.aurionpro.model;

public class InvalidAgeException extends Exception{ //Runtime or just Exception {
	private String msg;

	public InvalidAgeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public InvalidAgeException(String message) {
		super(message);
		this.msg=message;
	}
@Override
public String getMessage() {
	return this.getClass()+" "+msg;
}



@Override
public String toString() {
	return "InvalidAgeException [msg=" + msg + "]";
}

//	public InvalidAgeException(String message) {
//		super(message);
//		
//	}
	
}
