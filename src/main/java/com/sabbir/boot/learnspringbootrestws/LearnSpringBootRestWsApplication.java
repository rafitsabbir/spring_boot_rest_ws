package com.sabbir.boot.learnspringbootrestws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sabbir.boot.learnspringbootrestws.game.GameRunner;
import com.sabbir.boot.learnspringbootrestws.game.MarioGame;

@SpringBootApplication
public class LearnSpringBootRestWsApplication {

	public static void main(String[] args) {
		// SpringApplication.run(LearnSpringBootRestWsApplication.class, args);
		MarioGame mario = new MarioGame();
		GameRunner runner = new GameRunner(mario);
		runner.run();

	}

}
