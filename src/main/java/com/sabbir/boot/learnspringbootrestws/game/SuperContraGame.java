package com.sabbir.boot.learnspringbootrestws.game;

public class SuperContraGame implements GameConsole {

	public void up() {
		System.out.println("SuperContraGame jump");
	}

	public void down() {
		System.out.println("SuperContraGame down into a hole");
	}

	public void left() {
		System.out.println("SuperContraGame stop");
	}

	public void right() {
		System.out.println("SuperContraGame accelarate");
	}
}