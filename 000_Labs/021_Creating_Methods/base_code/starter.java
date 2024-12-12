/*
 *	Author: Justin Rodriguez 
 *  Date: 10/8/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		String[] sentences = sentence();
		String combinedSentence = cat(sentences[0], sentences[1]);
		print(sentences[0], combinedSentence);
	}
	
	private static String[] sentence() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Wrtie a sentence! ");
		String 9 = sc.nextLine();
		System.out.println("Wrtie a sentence! ");
		String secondS = sc.nextLine();
		
		return new String[]{firstS, secondS};
	}
	
	private static String cat(String firstS, String secondS) {
		 return firstS + " " + secondS;
	}
	
	private static void print(String firstS, String thirdS) {
		System.out.println("This is using methods!");
		System.out.println(firstS);
		System.out.println(thirdS);
	}
}
