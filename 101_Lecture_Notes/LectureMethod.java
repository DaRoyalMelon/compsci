/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        // Your Code Goes here!
        while(true){
            printAnimal();
        }
        
        greeting("spike");
        greeting("")
        
        double num = raise (200000, 5);
        System.out.println(num);
	}
	
	public static void printAnimal(){
	    System.out.println("       _.---._    /\\");
	    System.out.println("    ./'       \"--`\\//");
	    System.out.println("  ./              o \\          .-----.");
	    System.out.println(" /./\\  )______   \\__ \\        ( help! )");
	    System.out.println("./  / /\\ \\   | \\ \\  \\ \\       /`-----'");
	    System.out.println("   / /  \\ \\  | |\\ \\  \7--- ooo ooo ooo ooo ooo ooo");
	}
	
	public static void greeting(String name){
	    System.out.print("kys. " + name)
}

    public static double raise(double salary, int percent){
        double amount = salary + (salary * percent/100.0));
        return amount;
        
    }