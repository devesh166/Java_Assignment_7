package com.assignment.question4;

public class Bicyclefactory implements Cyclefactory {

	@Override
	public Cycle cycleType() {
		return new Bicycle();
	}
}
