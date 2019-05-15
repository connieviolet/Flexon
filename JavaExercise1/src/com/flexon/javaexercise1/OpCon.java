package com.flexon.javaexercise1;

public class OpCon {
	public static void main(String[] args) {
		double A = 20;
		double B = 80;
		double C = (A + B) * 25;
		System.out.println(C);
		double R = C % 40;
		if(R <= 20)
			System.out.println("Total was over the limit");
	}
}
