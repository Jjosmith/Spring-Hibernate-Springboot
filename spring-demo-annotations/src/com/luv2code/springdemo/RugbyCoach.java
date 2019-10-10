package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Component;

//@Component
public class RugbyCoach implements Coach {

	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;
	
	//define a default constructor
	public RugbyCoach() {
		System.out.println(">> RugbyCoach: inside default constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice Scrums";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
