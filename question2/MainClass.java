package com.assignment.question2;

public class MainClass {

	public static void main(String[] args) {

		Tricycle t = new Tricycle();
		Unicycle u = new Unicycle();
		Bicycle b = new Bicycle();

		// upcasting
		Cycle c[] = { t, b, u };
//		c[0].balance();  The method balance() is undefined for the type Cycle

		// downcasting
		Cycle cycle = new Cycle();
		Unicycle uni = (Unicycle) cycle;
		uni.balance();
//		Exception in thread "main" java.lang.ClassCastException: Cycle cannot
//		be cast to  Unicycle
//		at com.assignment.cycle.MainClass.main(MainClass.java:18)

//		casting can't always be done in both ways
//		Above code passes compiling, but throws "java.lang.ClassCastException: "
//		during runtime,because we are trying to cast a Cycle,
//		which is not a unicycle, to a unicycle.

	}

}
