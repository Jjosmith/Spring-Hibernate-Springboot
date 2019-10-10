package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	private List<String> data;
	private String file_name = "C://Users//cs026js//eclipse-workspace//spring-hibernate-springboot//spring-demo-annotations//src//fortune-data.txt";
	
	private Random myRandom = new Random();

	public FileFortuneService() {
		System.out.println("Inside the default constructor");
	}
	
	@PostConstruct
	public void loadFile() {
		File file = new File(file_name);
		
		data = new ArrayList<String>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {

			String line;

			while ((line = br.readLine()) != null) {
				data.add(line);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String getFortune() {
		//pick a random string from array
		int index = myRandom.nextInt(data.size());
		
		String theFortune = data.get(index);
		
		return theFortune;
	}

}
