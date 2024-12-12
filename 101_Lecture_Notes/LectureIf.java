/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Youve joined an Alien Exchange Program");
        System.out.println("Pick an Alien to take in");
        System.out.println("1. Joe a fat bellied Alien who loves eating pizza");
        System.out.println("2. Bob,a blue alien who loves trees");
        System.out.println("3. Barney, a purple tailed alien who fits in the palm of your hand");
        
        int answer1 = sc.nextInt();
        if(answer1 == 1){
            System.out.println("You have selected: Joe; Nice pick!!");
        }
        else if(answer1 == 2){
            System.out.println("You have selected: Bob; Nice pick!!");
        }
        else if(answer1 == 3){
            System.out.println("You have selected: Barney; Nice pick!!");
        }
        else{
            System.out.println("You get Jerry.");
        }
        
        if(answer1 == 1){
            System.out.print("Before you embark on your first journey with Joe, ");
            System.out.println("you discover that he ate all of your food");
            System.out.println("You have three choices: ");
            System.out.println("1. eat Bob.");
            System.out.println("2. Doordash more food");
            System.out.println("3. Scold Bob");
            
            int answer2 = sc.nextInt();
            if(answer2 == 1){
                System.out.println("You have eaten Bob and the flavors were too much for your brain to handle");
                System.out.println("YOU DIED");
            }
            else if(answer2 == 2){
                System.out.println("Bob catches wind that you're doordashing food");
                System.out.println("Bob overwhelms you and steals your phone");
                System.out.println("Bob sits on you and oders EVERYTHING");
                System.out.println("You are now in crippling debt and theres a violent riot outside your door from the traffic your order caused");
                System.out.println("");
                System.out.println("YOU DIED");
            }
            else if(answer2 == 3){
                System.out.println("You've hurt Bobs feeling in scolding him");
                System.out.println("Bob is no self conscience about his body");
            }
            else{
                System.out.print("Please select 1, 2 , or 3");
            }
        }
	}
}