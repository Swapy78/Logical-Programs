//Java program to find given number is a prime number or not

package demo;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();

	        boolean isPrime = true;// Initializing a boolean variable isPrime to true

	        if (number <= 1) {// If the input number is less than or equal to 1, it is not a prime number
	            isPrime = false;// Set isPrime to false
	        } else {
	    // If the input number is greater than 1, check if it is divisible by any number from 2 to its square root
	            for (int i = 2; i <= Math.sqrt(number); i++) {
	    // If the number is divisible by any number between 2 and its square root, it is not a prime number
	                if (number % i == 0) {// Set isPrime to false
	                    isPrime = false;
	                    break;// Exit the loop as soon as we find a factor
	                }
	            }
	        }

	        if (isPrime) {// If isPrime is still true, then the number is a prime number
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }
	        sc.close();
	    }
	
	}


