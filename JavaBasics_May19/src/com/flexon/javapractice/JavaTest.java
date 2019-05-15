package com.flexon.javapractice;

public class JavaTest {

	public static void main(String[] args) {
		//Hello World
		System.out.println("Hello World");
		//Sum Practice
		int A = 500;
		short B = 10;
		byte C = 30;
		long R =  70000 + 15 * A + B + C;
		System.out.println(R);
		//Weight Conversion
		int P = 100;
		double Kg = P * 0.45359237;
		System.out.println(Kg);
		//Conditions
		int value = 1;
		if(value == 1)
			System.out.println("Value is equal to 1");
		else if(value == 2)
			System.out.println("Value is equal to 2");
		else if(value == 3)
			System.out.println("Value is equal to 3");
		else
			System.out.println("Value is not equal to 1, 2 or 3");
	}

}
