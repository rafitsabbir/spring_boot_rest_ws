package com.sabbir.boot.learnspringbootrestws.game;

public class GameRunner {

	private GameConsole game;

	public GameRunner(GameConsole game) {
		this.game = game;
	}

	public void run() {
		game.up();
		game.down();
		game.left();
		game.right();

	}

}
