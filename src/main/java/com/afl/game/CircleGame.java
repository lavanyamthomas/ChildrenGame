/**
 * 
 */
package com.afl.game;

import java.util.List;

import com.afl.players.GamePlayers;
import com.afl.players.GamePlayersImpl;
import com.afl.remove.count.RemoveOnCount;
import com.afl.remove.count.RemoveOnCountImpl;

/**
 * @author lavanya
 *
 */
public class CircleGame implements Game {

	/**
	 * 
	 */
	public CircleGame() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see childrensGame.Game#game()
	 */
	public Integer gameRules() {
		
		GamePlayers players = new GamePlayersImpl();		
		List<Integer> numPlayers = players.players();
		
		RemoveOnCount removeCount = new RemoveOnCountImpl();
		int countout = removeCount.removeOnCountNumber();		
			
		return getWinner(numPlayers, countout);
	}
	
	
	
	private int getWinner(List <Integer> players, int countout) {
		 int count = 0;
		   int roundCount=1;
		   System.out.println("Childrens are in the game : "+players.toString());
		   while(players.size() > 1) {
				   
		   for(int i = 1;i<= players.size();i++) {
			   count++;
			   Integer player = players.get(0);
			   players.remove(player);  
			   if(!(count == countout)) {
				   players.add(player);
			   }else if (count == countout){
				   System.out.println("Child is now out and leaves the circle is " + player);
				   System.out.println("Remaining child wins the game after "+ roundCount +" around : "+players.toString());
				   count = 0;
				   roundCount++;
			   }
			   
		   }
		}
		return players.size()>0 ? players.get(0):count;
		
	}

}
