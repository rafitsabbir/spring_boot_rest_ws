package com.sabbir.boot.learnspringbootrestws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sabbir.boot.learnspringbootrestws.game.GameRunner;
import com.sabbir.boot.learnspringbootrestws.game.MarioGame;
import com.sabbir.boot.learnspringbootrestws.game.PacManGame;
import com.sabbir.boot.learnspringbootrestws.game.SuperContraGame;

@SpringBootApplication
public class LearnSpringBootRestWsApplication {

	public static void main(String[] args) {
		// SpringApplication.run(LearnSpringBootRestWsApplication.class, args);
		//MarioGame game = new MarioGame();
		//SuperContraGame game = new SuperContraGame();
		PacManGame game = new PacManGame();
		
		GameRunner runner = new GameRunner(game);
		runner.run();

	}

}
