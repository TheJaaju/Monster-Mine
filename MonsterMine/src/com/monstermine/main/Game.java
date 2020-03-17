package com.monstermine.main;

import java.awt.Canvas;

public class Game extends Canvas implements Runnable {
	
	private static final long serialVersionUID = 2785672737600068142L;

	public static final int WIDTH= 1320, HEIGHT = WIDTH / 11 * 6;
	
	
	public Game() {
		new Window(WIDTH, HEIGHT, "Monster Mine", this);
	}
	
	public synchronized void start( ) {
		
	}
	
	public void run() {
		
	}
	
	public static void main(String args[]) {
		new Game();
	}	
	
}
