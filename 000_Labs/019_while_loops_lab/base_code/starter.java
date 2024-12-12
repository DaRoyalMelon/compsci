/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Please give a mane: ");
		String n = sc.nextLine();
		System.out.println("How many times do you want this name repeated? ");
		int r = sc.nextInt();
	
		int count = 0; 
		while(count < r){
		System.out.println(n);
		
		count = count + 1;
		}
	}
}
