package com.assignment.question1;

public class Hamster extends Rodent {
	Hamster(){
		System.out.println("This is Hamster");
	}
	@Override
	public void lifeSpan() {
		System.out.println("Hamster lives for 3 years");
		
	}
	
	public void eat() {
		System.out.println("Hamster is eating");
	}
	public void sleep() {
		System.out.println("Hamster is sleeping");
	}
}
