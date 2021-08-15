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
	
//		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
//		Coach theCoach=context.getBean("myCoach",Coach.class);
//		System.out.println(theCoach.getDailyFortune());
//		context.close();
//		System.out.println("------------------------");
//		CricketCoach theCoach=context.getBean("myCricketCoach",CricketCoach.class);
//		System.out.println(theCoach.getDailyFortune());
//		System.out.println(theCoach.getDailyWorkout());
//		System.out.println(theCoach.getFortuneService());
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		Coach theCoach=context.getBean("myCoach",Coach.class);
		Coach alphaCoach=context.getBean("myCoach",Coach.class);
		boolean result=(theCoach==alphaCoach);
		System.out.println(result);
		System.out.println(theCoach);
		System.out.println(alphaCoach);
		context.close();
	}

}
