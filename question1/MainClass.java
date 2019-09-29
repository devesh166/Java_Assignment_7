package com.assignment.question1;

public class MainClass {

	public static void main(String[] args) {
		Rodent rod[] = new Rodent[3] ;
		rod[0]=new Mouse();
		rod[1]= new Gerbil();
		rod[2]= new Hamster();
		
		rod[0].eat();
		rod[0].lifeSpan();
		rod[0].sleep();

		rod[1].eat();
		rod[1].lifeSpan();
		rod[1].sleep();

		rod[2].eat();
		rod[2].lifeSpan();
		rod[2].sleep();
	}

}
