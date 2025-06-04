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

	public static void countVowels() {

	}

	public static void countConsonants() {

	}

	public static void countWords() {

	}

	public static void countCharacters() {

	}

}
