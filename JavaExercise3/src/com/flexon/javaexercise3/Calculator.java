package com.flexon.javaexercise3;
import java.lang.System;
import java.util.Scanner;

public class Calculator {
	static int A;
	static int B;
	static int R;
	public static void main(String[] args) {
		System.out.println("Welcome to Calculator.");
		boolean validA = false;
		do {
			System.out.println("Please enter your first integer.");
			Scanner keyboard = new Scanner(System.in);
			if(keyboard.hasNextInt()) {
			    A = keyboard.nextInt();
			    validA = true;
			} else {
				System.out.println("Your input is not an integer.");
			}
		} while (!validA);
		boolean validB = false;
		do {
			System.out.println("Please enter your second integer.");
			Scanner keyboard = new Scanner(System.in);
			if(keyboard.hasNextInt()) {
			    B = keyboard.nextInt();
			    validB = true;
			} else {
				System.out.println("Your input is not an integer.");
			}
		} while (!validB);
		boolean validOp = false;
		do {
			System.out.println("Please enter which operation you want to perform.");
			System.out.println("Only enter + or - or * or /");
			Scanner keyboard = new Scanner(System.in);
			String O = keyboard.next();
			switch (O) { 
	        case "+": 
	            R = A + B;
	            System.out.print(A);
	            System.out.print(" + ");
	            System.out.print(B);
	            System.out.print(" = ");
	            System.out.print(R);
	            validOp = true;
	            break; 
	        case "-": 
	        	R = A - B;
	            System.out.print(A);
	            System.out.print(" - ");
	            System.out.print(B);
	            System.out.print(" = ");
	            System.out.print(R); 
	            validOp = true;
	            break; 
	        case "*": 
	        	R = A * B;
	            System.out.print(A);
	            System.out.print(" * ");
	            System.out.print(B);
	            System.out.print(" = ");
	            System.out.print(R); 
	            validOp = true;
	            break; 
	        case "/": 
	        	R = A / B;
	            System.out.print(A);
	            System.out.print(" / ");
	            System.out.print(B);
	            System.out.print(" = ");
	            System.out.print(R); 
	            validOp = true;
	            break; 
	        default: 
	        	System.out.println("Your input is not valid.");
	        	break; 
	        } 
		} while (!validOp);
	}
}
