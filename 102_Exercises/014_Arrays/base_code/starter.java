/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	int [] three = new int[1001];
	int i = 0;
	int x = 3;
		while (i < three.length){
		three[i] = x;
		System.out.print(three[i] + ", ");
		x += 3;
		i++;
	}
	i = 0;
	
	int[] k = new int[1001];
	int y = 1000;
		while (i < k.length){
		k[i] = y;
		System.out.print(k[i] + ", ");
		y--;
		i++;
		}
	}
}
