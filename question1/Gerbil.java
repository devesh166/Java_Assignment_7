package com.assignment.question1;

public class Gerbil extends Rodent{
	Gerbil(){
		System.out.println("This is gerbil");
	}
	@Override
	public void lifeSpan() {
		System.out.println("gerbil lives for 7 years");
		
	}
	
	public void eat() {
		System.out.println("gerbil is eating");
	}
	public void sleep() {
		System.out.println("gerbil is sleeping");
	}
}
