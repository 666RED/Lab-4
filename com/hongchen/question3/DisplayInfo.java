package com.hongchen.question3;

import java.util.Scanner;

public class DisplayInfo {

	public static void main(String[] args) {
		
		final int CURRENT_YEAR = 2022;
		
		Scanner scanner = new Scanner(System.in);
		String gender = null;
		
		System.out.print("Full Name: ");
		String fullName = scanner.nextLine();
		do {
			System.out.print("Gender(m - male / f - female): ");
			char answer = scanner.next().charAt(0);
			
			switch(answer) {
				case 'm':
					gender = "male";
					break;
				case 'M':
					gender = "male";
					break;
				case 'f':
					gender = "female";
					break;
				case 'F':
					gender = "female";
					break;
				default:
					System.out.println("Invalid input. Please enter again.\n");
			}
		}while(gender == null);
		
		System.out.print("Year of Birth: ");
		int yearOfBirth = scanner.nextInt();
		
		int age = CURRENT_YEAR - yearOfBirth;
		
		System.out.println("Hello " + fullName + ", you are a " + gender + ", you are " + age + " years old.");
	}

}
