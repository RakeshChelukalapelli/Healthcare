package com.slokam.da.hc.exception;

public class PatientException extends Exception{

	public PatientException(){
		
	}
	public PatientException(String message){
		super(message);
	}
	public PatientException(String message,Throwable t){
		super(message,t);
	}
}
