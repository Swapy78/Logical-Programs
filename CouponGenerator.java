//Java program to get random coupon numbers

package demo;

import java.util.*;

public class CouponGenerator {

    // Generate a random coupon number between 1 and 1000
    public static int generateRandomCoupon() {
        Random rand = new Random();
        return rand.nextInt(1000) + 1;
    }
    
    // Generate n distinct coupon numbers and return the total number of random numbers needed
    public static int generateDistinctCoupons(int n) {
        int[] coupons = new int[n];
        int randomNumbers = 0;  // Track the number of random numbers generated
        int count = 0;  // Track the number of distinct coupons generated so far
        while (count < n) {  // Continue generating coupons until n distinct coupons have been generated
            int coupon = generateRandomCoupon();  // Generate a random coupon number
            randomNumbers++;  // Increment the count of random numbers generated
            boolean couponExists = false;  
            // Check if the coupon number already exists in the coupons array
            for (int i = 0; i < count; i++) {
                if (coupons[i] == coupon) {  // If the coupon number exists, set couponExists to true
                    couponExists = true;
                    break;
                }
            }
            // If the coupon number doesn't exist, add it to the coupons array and increment the count of distinct coupons generated
            if (!couponExists) {
                coupons[count++] = coupon;
            }
        }
        return randomNumbers;  // Return the total number of random numbers generated
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of distinct coupon numbers: ");
        int n = sc.nextInt();
        int randomNumbersNeeded = generateDistinctCoupons(n);  // Generate n distinct coupon numbers
        System.out.println("Total random numbers needed: " + randomNumbersNeeded);
        sc.close();
    }
    
}
