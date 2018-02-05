/**
 * 
 */
package com.afl.remove.count;

import com.afl.common.GameHelper;
import com.afl.common.Gamevalidations;

/**
 * @author lavanya
 *
 */
public class RemoveOnCountImpl implements RemoveOnCount {
	
	/**
	 * 
	 */
	public RemoveOnCountImpl() {
		
		
		// TODO Auto-generated constructor stub
	}
	
	/* Populate  and validate players in array list
	 * @Param numPlayers : user input value
	 * return players(java.util.List) 
	*/
	public int removeOnCountNumber() {
		String message = "remove count out";
		
		int countOut = new Gamevalidations().intputDataValidations(GameHelper.getUserInput(message),GameHelper.MIN_COUNT_OUT,message);
		return countOut;
	}

}
