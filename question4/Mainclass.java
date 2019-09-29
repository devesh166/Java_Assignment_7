package com.assignment.question4;

public class Mainclass {
	public static void rideCycle(Cyclefactory factory) {
		Cycle cycle =factory.cycleType();
		cycle.ride();
	}

	public static void main(String[] args) {
		rideCycle(new Unicyclefactory());
		rideCycle(new Bicyclefactory());
		rideCycle(new Tricyclefactory());

	}

}
