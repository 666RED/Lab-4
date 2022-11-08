package com.hongchen.question2;

import java.util.Scanner;

public class CalculateAreaOfTriangle {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double[] x = new double[3];
		double[] y = new double[3];
		
		for(int i = 0; i < 3; i++) {
			System.out.print("Enter x" + (i + 1) + "\t:");
			x[i] = scanner.nextDouble();
			System.out.print("Enter y" + (i + 1) + "\t:");
			y[i] = scanner.nextDouble();
		}
		
		double side1 = Math.sqrt(Math.pow((x[1] - x[2]),2) + Math.pow((y[1] - y[2]),2));
		double side2 = Math.sqrt(Math.pow((x[2] - x[0]),2) + Math.pow((y[2] - y[0]),2));
		double side3 = Math.sqrt(Math.pow((x[1] - x[0]),2) + Math.pow((y[1] - y[0]),2));
		
		double s = (side1 + side2 +side3) / 2;
		
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		
		System.out.println("The area of the triangle is " + String.format("%.2f", area));
	}

}
