package com.sk.Github1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubDemo11Application {

	public static void main(String[] args) {
		SpringApplication.run(GithubDemo11Application.class, args);
	}
	
	public void greetings()
	{
		System.out.println("Welcome In GitHub");
	}
	
	public void Happiness()
	{
		System.out.println("Welcome In hippiest group");
	}
	
	public void branchDemo()
	{
		System.out.println();
	}

}
