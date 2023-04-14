//Java program to find elapsed time between start and stop of stopwatch

package demo;

import java.util.Scanner;

public class StopWatch {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Telling the user to start the stopwatch
        System.out.println("Press Enter to start the stopwatch");
        sc.nextLine();
        // Saving the start time,System.currentTimeMillis() is a method provided by JRE to get current time
        // Used long because long has larger raner range than int,double to store value in milliseconds
        long startTime = System.currentTimeMillis();
        
        //Telling the user to stop the stopwatch
        System.out.println("Press Enter again to stop the stopwatch");
        sc.nextLine();
        // Saving the stop time
        long endTime = System.currentTimeMillis();
        
        // Calculating the elapsed time in milliseconds
        long elapsedTime = endTime - startTime;
        System.out.println("Elapsed time :" +elapsedTime+ " milliseconds" );
    
        sc.close();
	}
	
}
