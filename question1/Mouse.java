package com.assignment.question1;

public class Mouse extends Rodent {
	Mouse(){
		System.out.println("This is mouse");
	}
	@Override
	public void lifeSpan() {
		System.out.println("Mouse lives for 5 years");
		
	}
	
	public void eat() {
		System.out.println("Mouse is eating");
	}
	public void sleep() {
		System.out.println("Mouse is sleeping");
	}
	
}
