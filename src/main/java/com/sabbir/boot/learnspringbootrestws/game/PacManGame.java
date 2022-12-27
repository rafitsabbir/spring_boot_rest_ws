package com.sabbir.boot.learnspringbootrestws.game;

public class PacManGame implements GameConsole {

	public void up() {
		System.out.println("PacManGame jump");
	}

	public void down() {
		System.out.println("PacManGame down into a hole");
	}

	public void left() {
		System.out.println("PacManGame stop");
	}

	public void right() {
		System.out.println("PacManGame accelarate");
	}
}
