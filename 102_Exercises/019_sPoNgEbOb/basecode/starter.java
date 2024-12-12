/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("EntEr yOuR meSsAgE: ");
		String x = sc.nextLine();
		
		String result = spongeCase(x);
		System.out.println(result);

		public static String spongeCase(String x){
				
		for(int i = 0; i < x.length(); i++){
			if(i % 2 == 0){
			System.out.print(x.substring(i, i+1).toUpperCase());
			}
			else{
			System.out.print(x.substring(i, i+1).toLowerCase());
				}
			}
		}
		return x
	}
}
