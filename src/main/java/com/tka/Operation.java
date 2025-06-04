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

	public static void perfect(){
		 System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        int sum = 0;
	        // Calculate sum of proper divisors
	        for (int i=1;i<=number/2;i++){
	            if (number % i == 0) {
	                sum += i;
	            }
	        }
	        // Check if the number is perfect
	        if(sum==number){
	            System.out.println(number + " is a Perfect Number.");
	        } else{
	            System.out.println(number + " is not a Perfect Number.");
	        }
	        System.out.println("-------------------------------------------------");
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
