package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {
	
	private Random randomSelector = new Random();
	private String[] randomFortune = {
		"Have a good Monday",
		"Always better days to come",
		"There is a light at the end of the tunnel"
	};
		
	@Override
	public String getFortune() {
		int randomNumber = randomSelector.nextInt(randomFortune.length);
		
		String fortune = randomFortune[randomNumber];
		
		return fortune;
	}

}
