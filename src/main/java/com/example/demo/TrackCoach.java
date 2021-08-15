package com.example.demo;

import com.example.demo.Coach;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService theFortuneService) {
		// TODO Auto-generated constructor stub
		fortuneService=theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "hello ae";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it "+fortuneService.getFortune();
	}

	public void helloBanNho() {
		System.out.println("Trackcoach: hello ban nho");
	}
	public void macIaQua() {
		System.out.println("Trackcoach: mac ia qua");
	}
	
}
