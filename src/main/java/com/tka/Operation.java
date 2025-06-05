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

		int n = scanner.nextInt();
		int first = 0, second = 1;

		System.out.println("Fibonacci Series up to " + n + " terms:");

		for (int i = 0; i < n; i++) {
			System.out.print(first + " ");

			int next = first + second;
			first = second;
			second = next;
		}
		System.out.println("Fibonacci Series ");
		System.out.println("--------------------------------------------------");
	}

	public static void armstrong() {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter your number : ");
		int num = in.nextInt();
		int t1 = num;
		int length = 0;
		while (t1 != 0) {

			length = length + 1;
			t1 = t1 / 10;
		}

		int t2 = num;
		int arm = 0;
		while (t2 != 0) {
			int mul = 1;
			int rem = t2 % 10;
			for (int i = 1; i <= length; i++) {
				mul = mul * rem;
			}
			arm = arm + mul;
			t2 = t2 / 10;

		}

		if (arm == num) {
			System.out.println(num + " is ArmStrong nubmer");
		} else {
			System.out.println(num + " is not ArmStrong number");
		}

	}

	public static void perfect() {
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		int sum = 0;
		// Calculate sum of proper divisors
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		// Check if the number is perfect
		if (sum == number) {
			System.out.println(number + " is a Perfect Number.");
		} else {
			System.out.println(number + " is not a Perfect Number.");
		}
		System.out.println("-------------------------------------------------");
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
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

		// Reverse the string
		String reversed = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			reversed += input.charAt(i);
		}

		// Output the reversed string
		System.out.println("Reversed string: " + reversed);

		System.out.println("-------------------------");
	}

	public static void reverseNumber() {

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		int reversed = 0;

		while (number != 0) {
			int digit = number % 10; // Get last digit
			reversed = reversed * 10 + digit; // Append digit
			number /= 10; // Remove last digit
		}

		System.out.println("Reversed number: " + reversed);

		System.out.println("------------------------------------------------------");
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

		System.out.print("Enter first string: ");
		String str1 = scanner.nextLine();

		System.out.print("Enter second string: ");
		String str2 = scanner.nextLine();

		System.out.println("\nBefore Swap:");
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);

		String temp = str1;
		str1 = str2;
		str2 = temp;

		System.out.println("\nAfter Swap:");
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);

		System.out.println("-------------------------------------------------");

		scanner.close();

	}

	public static void countConsonants() {
		System.out.print("Enter a string: ");
		String input = scanner.nextLine().toLowerCase();
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isLetter(ch) && !"aeiou".contains(String.valueOf(ch))) {
				count++;
			}
		}
		System.out.println("Number of consonants: " + count);

		System.out.println("-------------------------------------------------");

	}

	public static void countWords() {
		System.out.print("Enter a sentence to count the words: ");
		String input = scanner.nextLine().trim();

		if (input.isEmpty()) {
			System.out.println("No words found.");
		} else {
			String[] words = input.split("\\s+"); // split by one or more spaces
			System.out.println("Total number of words: " + words.length);
		}

		System.out.println("-------------------------------------------------");
	}

	public static void countCharacters() {
		// Rutuja Bhosale

	}

	public static void countVowels() {
		// Prasad Deshmukh

	}

	public static void leapYear() {
		//akankshaj29
	}

	public static void gcdLcm() {
		// shubham1640
	}

	public static void anagram() {
		// amitnaik9922
	}

	public static void findMinMaxInArray() {
		// itsAVISHKAR
	}

	public static void sortArray() {
		// Ashish-1836
	}

	public static void pangram() {
		// saurabh27k
	}

	public static void duplicateCharacters() {
		// Shahid Rodde
	}

	public static void armstrongInRange() {
		// nilesh-chavan-07
		 System.out.print("Enter a number: ");
	        int num = scanner.nextInt();
	        int originalNum = num;
	        int result = 0;
	        int digits = String.valueOf(num).length();

	        while (num != 0) {
	            int digit = num % 10;
	            result += Math.pow(digit, digits);
	            num /= 10;
	        }

	        if (result == originalNum) {
	            System.out.println(originalNum + " is an Armstrong number.");
	        } else {
	            System.out.println(originalNum + " is not an Armstrong number.");
	        }
	        System.out.println("----------------------------------------")
	}

	public static void primesInRange() {
		
	}

	public static void strongNumber() {
		// pravinjrakte
	}

	public static void sumOfN() {	
		// Pratik-Patil-7
	}

	public static void printPattern() {
		
	}

	public static void harshadNumber() {
	}

	public static void secondLargest() {
	}

	public static void compareArrays() {
	}

}
