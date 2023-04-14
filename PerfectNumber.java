//Java program to find given number is a perfect number or not

package demo;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;// Initializing a variable sum to store the sum of all the factors of the input number except the number itself
     // Looping through all the numbers from 1 to the input number excluding the number itself
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {// If the number is divisible by i, then i is a factor of the number
                sum += i;// Add i to the sum of factors
            }
        }
     // If the sum of factors is equal to the input number, then the number is a perfect number
        if (sum == number) {
            System.out.println(number + " is a perfect number.");
         // If the sum of factors is not equal to the input number, then the number is not a perfect number
        } else {
            System.out.println(number + " is not a perfect number.");
        }
        
        sc.close();
    }

	}


