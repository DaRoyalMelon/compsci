/* 
    Lecture note example - Input and Scanner
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Tell me your name");
        String name = sc.nextLine();
        System.out.println("Thats your name?? " + name + "?? Go and get that legally changed.");
        
        System.out.println("Im forced to keep talking to you, tell me the day you were born on.");
        int day = sc.nextInt();
        sc.nextLine();
        System.out.println("Now tell me how much money is in your bank account");
        double money = sc.nextDouble();
        sc.nextLine();
        System.out.println("Hahaa, did you know those two numbers equal " + (day + money) + " Now give me all your money");
        
        System.out.println("Now tell me one more thing, whats your favorite food?");
        String food = sc.nextLine();
        System.out.println("Really??? " + food + "?? You disgust me, execution of user in 5 seconds, goodbye.");
        sc.nextLine();
    }
}