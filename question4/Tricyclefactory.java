package com.assignment.question4;

public class Tricyclefactory implements Cyclefactory {

	@Override
	public Cycle cycleType() {
		return new Tricycle();
	}

}
