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
		

		System.out.print("Enter a number: ");
        int num = scanner.nextInt(); // Read integer input

        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            // Check from 2 to num-1
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        
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
