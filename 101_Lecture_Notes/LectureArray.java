/* 
    Lecture note example - Arrays
*/

class LectureArray{
    public static void main(String args[]) {
        
        int[] arr = new int[8];
        int[] argg = {5, 8, 7, 8, 4, 2, 9, 1};
        
        for(int i = 1; i < argg.length; i=i+2){
            System.out.print(argg[i]);
        }
        int x = 8;
        for(int i = o; i < argg.length; i++){
            System.out.print(i);
        }
	}
	for(int i = 0; i < argg.length-1; i++){
	    if(argg[i] == argg[i+1])
	    System.out.println("Consect at " + i + " and " + (i+1)); 
	}
}