package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		
		SpringApplication.run(Demo2Application.class, args);
//		Coach theCoach=new TrackCoach();
//		System.out.println(theCoach.getDailyWorkout());
	
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach=context.getBean("myCoach",Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		context.close();
	}

}
