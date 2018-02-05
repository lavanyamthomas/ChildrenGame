/**
 * 
 */
package com.afl.common;

import java.util.Scanner;

/**
 * @author lavanya
 *
 */
public class GameHelper {

	public static final int MIN_COUNT_OUT = 1;
	public static final int MIN_PLAYERS = 1;
	
	/**
	 * 
	 */
	public GameHelper() {
		// TODO Auto-generated constructor stub
	}
	
	   // Read the input aruments from the user
		public static int getUserInput(String message) {
			System.out.println("Enter "+ message);
	        Scanner input = new Scanner(System.in);
	        return input.nextInt();
		}

}
