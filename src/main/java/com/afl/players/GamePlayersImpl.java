/**
 * 
 */
package com.afl.players;

import java.util.ArrayList;
import java.util.List;

import com.afl.common.GameHelper;
import com.afl.common.Gamevalidations;

/**
 * @author lavanya
 *
 */
public class GamePlayersImpl implements GamePlayers {

	/**
	 * 
	 */
	public GamePlayersImpl() {
		// TODO Auto-generated constructor stub
	}

	/* Populate  and validate players in array list
	 * @Param numPlayers : user input value
	 * return players(java.util.List) 
	*/
	public List players() {
		
		String message = "children numbers";
		int numPlayers = new Gamevalidations().intputDataValidations(GameHelper.getUserInput(message),GameHelper.MIN_PLAYERS,message);
		return getPlayers(numPlayers);
	}
	
	/* Populate players in array list
	 * @Param numPlayers : user input value
	 * return players(java.util.List) 
	*/
	private List<Integer> getPlayers(int numPlayers) {
		
        List <Integer> players = new ArrayList<Integer>();
        for (int i = 0; i <numPlayers ; i++) {
        	players.add(i + 1);
        }
		return players;
	}

}
