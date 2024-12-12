/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers to create a range for your random number");
		System.out.println("Please enter an integer: 10");
		int a = sc.nextInt();
		System.out.println("Please enter another integer (bigger than the first) ");
		int b = sc.nextInt();
		
		System.out.println("Your range is 10 to " + b );
		System.out.println("Here are 5 numbers generated in that range");
		System.out.print((int)(Math.random() * b - a + b) + " " );
		System.out.print((int)(Math.random() * b - a + b) + " " );
		System.out.print((int)(Math.random() * b - a + b) + " " );
		System.out.print((int)(Math.random() * b - a + b) + " " );
		System.out.print((int)(Math.random() * b - a + b) + " " );
	}
}
