package com.afl.common;

public class Gamevalidations {

	public Gamevalidations() {
		
	}
	// Validate user input data
	public int intputDataValidations(int userInput, int numValidate, String msg){
		
		if (userInput < numValidate) {
			 System.out.println("Pleasse enter "+ msg+" more then "+numValidate);
	            return GameHelper.getUserInput(msg);
	            
	        }
		return userInput;
		
	}

}
