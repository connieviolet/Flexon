package com.flexon.nested;
import java.lang.System;
import java.util.Scanner;

public class Nested {
	static int F;
	public static void main(String[] args) {
		System.out.println("Welcome to the Star Pyramid.");
		boolean valid = false;
		do {
			System.out.println("Please enter how many floors you want.");
			Scanner keyboard = new Scanner(System.in);
			if(keyboard.hasNextInt()) {
			    F = keyboard.nextInt();
			    valid = true;
			} else {
				System.out.println("Your input is not an integer.");
			}
		} while (!valid);
		for (int i = 1; i <= F; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*"); 
			}
			System.out.println();
		} 
	}
}
