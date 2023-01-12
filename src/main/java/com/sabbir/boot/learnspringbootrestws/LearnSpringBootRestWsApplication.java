package com.sabbir.boot.learnspringbootrestws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sabbir.boot.learnspringbootrestws.controller.MyController;
import com.sabbir.boot.learnspringbootrestws.game.GameRunner;

@SpringBootApplication
public class LearnSpringBootRestWsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringBootRestWsApplication.class, args);
		// MarioGame game = new MarioGame();
		// SuperContraGame game = new SuperContraGame();
		/*
		 * GameConsole game = new SuperContraGame(); GameRunner runner = new
		 * GameRunner(game);
		 */
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();

		MyController controller = context.getBean(MyController.class);
		System.out.println(controller.returnValue());

	}

}
