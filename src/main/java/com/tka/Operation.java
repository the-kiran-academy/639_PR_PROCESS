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

	}

	public static void reverseString() {

	}

	public static void reverseNumber() {

	}

	public static void swapNumbers() {

		// Input from user
		System.out.print("Enter first number (a): ");
		int a = scanner.nextInt();

		System.out.print("Enter second number (b): ");
		int b = scanner.nextInt();

		System.out.println("\nBefore Swapping:");
		System.out.println("a = " + a + ", b = " + b);

		// Swap using temp variable
		int temp = a;
		a = b;
		b = temp;

		System.out.println("\nAfter Swapping:");
		System.out.println("a = " + a + ", b = " + b);

		scanner.close();
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
