package com.assignment.question3;

public class Mainclass {
	static void method1(Interface1 i) {
	};
	static void method2(Interface2 i) {
	};
	static void method3(Interface3 i) {
	};
	static void method4(Newinterface i) {
	};

	public static void main(String[] args) {
		DerivedClass s = new DerivedClass();
		method1(s);
		method2(s);
		method3(s);
		method4(s);
//      Although we can’t create instance(interface can’t be instantiated) of interface
//		but we can make reference of it that refers to the Object of its implementing class. 
	}
}
