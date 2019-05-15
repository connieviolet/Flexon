package com.flexon.javaexercise2;
import java.lang.System;
import java.util.Scanner;

public class SwitchExercise {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to Fruit Basket. Please input A or B or C or D or E.");
		String I = keyboard.next();
		System.out.println("Your input was: " + I);
		String O;
		switch (I) { 
        case "A": 
            O = "Apple."; 
            break; 
        case "B": 
            O = "Banana."; 
            break; 
        case "C": 
            O = "Cherries."; 
            break; 
        case "D": 
            O = "Dragon Fruit."; 
            break; 
        case "E": 
            O = "Elderberry."; 
            break; 
        default: 
            O = "Not in fruit basket."; 
            break; 
        } 
        System.out.println(O); 
	}
}
