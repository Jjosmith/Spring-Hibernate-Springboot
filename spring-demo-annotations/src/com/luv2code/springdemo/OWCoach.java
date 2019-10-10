package com.luv2code.springdemo;

public class OWCoach implements Coach {

	private FortuneService fortuneService;
	
	public OWCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice in FFA";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
