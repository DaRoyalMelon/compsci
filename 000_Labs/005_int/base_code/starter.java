/*
 *	Author:  Justin Rodriguez
 *  Date: 8-29-24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int a = 5;
		int b = 7;
		int c = 2;
		int d = 3;
		int e = 1;
		int f = 10;
		int g = 4;

		int equation1 = 5 * 7 / 2 % 3 - 1;
		int equation2 = 10 % 3 - 4 * 7 + 2;
		int equation3 = (3 - 7 / 2 * 5) % 10;
		
		System.out.println("The result of 5 * 7 / 2 % 3 - 1 is: " + equation1);
		System.out.println("The result of 10 % 3 - 4 * 7 + 2 is: " + equation2);
		System.out.println("The result of (3 - 7 / 2 * 5) % 10 is: " + equation3);
	}
}
