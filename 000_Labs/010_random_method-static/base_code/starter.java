/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	int x = (int)(Math.random() * 10);
	System.out.println("A number between 0 - 9 is: " + x );
	int y = (int)(Math.random() * 101);	
	System.out.println("A number between 0 - 100 is: " + y);
	
	double min = 2.5;
	double max = 3.5;
	double random = min + (Math.random() * (max - min)); 
	System.out.println("A number between 2.5 and 3.5 is " + random );
	
	double min1 = 14;
	double max1 = 589;
	double random1 = min + (Math.random() * (max1 - min1));
	System.out.println("A double between 14 and 589 is " + random1);
	}
}
