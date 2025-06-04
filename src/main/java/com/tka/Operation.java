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

	}

	public static void countCharacters() {

	}

}
