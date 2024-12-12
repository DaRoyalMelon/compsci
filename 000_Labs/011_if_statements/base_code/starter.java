/*
 *	Author: Justin Rodriguez 
 *  Date: 9/24/24
 // added extra steps with Math.random() 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
	int min = 1;
	int max = 5;
	
	int x = (int)(Math.random() * (max - min)) + min;
	int y = (int)(Math.random() * (max - min)) + min;
	
	
	System.out.println("The first variable is " + x);
	System.out.println("The second variable is " + y);
	
		if(x == y){
			System.out.println("The variables are the same");
		}
		else{
			System.out.println("The variables are different");
		}
	}
}
