/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is your base number? ");
		int base = sc.nextInt();
		System.out.print("What is your exponent number? ");
		int ex = sc.nextInt();
		
		int result = power(base, ex);
		System.out.println(base + " raised to the power of " + ex + " is " + result);
	}
	
	private static int power(int base, int ex){
		int result = 1;
		
		if (ex < 0 ) {
			return 0;
		} for (int i = 0; i < ex; i++) {
			result *= base;
		}
		return result; 
	}
}
