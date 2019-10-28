package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PracticeSportConfig {
		
	// define bean for our good fortune service
	@Bean
	public FortuneService goodFortuneService() {
		return new GoodFortuneService();
	}
	
	// define bean for our OW coach AND inject dependency
	@Bean
	public Coach OWCoach() {
		OWCoach myOWCoach = new OWCoach(goodFortuneService());
		
		return myOWCoach;
	}
	
}








