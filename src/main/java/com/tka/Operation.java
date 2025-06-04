package com.tka;

import java.util.Scanner;

public class Operation {

	static Scanner scanner = new Scanner(System.in);

	public static void pallindrome() {

		String name = scanner.nextLine();

		String str = "madam"; // Example string
		String reversedStr = new StringBuilder(str).reverse().toString();
		if (str.equals(reversedStr)) {
			System.out.println(str + " is a palindrome.");
		} else {
			System.out.println(str + " is not a palindrome.");
		}

		System.out.println("-------------------------------------------------");

	}

	public static void factorial() {

	}

	public static void prime() {

	}

	public static void fibonacci() {

	}

	public static void armstrong() {

	}

	public static void perfect() {

	}

	public static void sumOfDigits() {
		 System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        int sum = 0;

	        while (number != 0) {
	            int digit = number % 10;
	            sum += digit;
	            number /= 10;
	        }

	        System.out.println("Sum of digits: " + sum);
	        
	        System.out.println("----------------------------");

	}

	public static void reverseString() {

	}

	public static void reverseNumber() {

	}

	public static void swapNumbers() {

	}

	public static void swapStrings() {

	}

	public static void countVowels() {

	}

	public static void countConsonants() {

	}

	public static void countWords() {

	}

	public static void countCharacters() {

	}

}
