//Java program to reverse a number

package demo;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 12345;
		int reversedNumber = 0;
		
		System.out.println("Original number: " +number);
		
		//Using while loop to reverse a number
		while (number != 0) {
		    int remainder = number % 10;// Get the rightmost digit of the number
		    reversedNumber = reversedNumber * 10 + remainder;// Add the digit to the reversed number
		    number = number / 10;// Remove the rightmost digit from the number
		}
		 
		 
		 System.out.println("Reversed number: " +reversedNumber);
		 
	}
	

}
