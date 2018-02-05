/**
 * 
 */
package com.afl.main;

import com.afl.game.CircleGame;
import com.afl.game.Game;

/**
 * @author lavanya
 *
 */
public class ChildrenGameMain {

	/**
	 * 
	 */
	public ChildrenGameMain() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * This apps main() method 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Game game = new CircleGame();
		
		System.out.println("Winner of the game "+game.gameRules());

	}

}
