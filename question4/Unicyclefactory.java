package com.assignment.question4;

public class Unicyclefactory implements Cyclefactory {

	@Override
	public Cycle cycleType() {
		return new Unicycle();
	}

}
