
import java.util.Arrays;

public class BubbleSort{
 public static void main(String[] args) {
     int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
     // Before sort
     System.out.println(Arrays.toString(ns));
     // Bubble sort 
     for (int i =0; i< ns.length-1; i++ ) {
    	 for (int m =0; m< ns.length-1-i; m++) {
    		 if (ns[m]<ns[m+1]) {
    			 int temp = ns[m];
    			 ns[m] = ns[m+1];
    			 ns[m+1] = temp;
    		 }
    	 }
     }

     // after sort
     System.out.println(Arrays.toString(ns));
 }
}
