import java.util.Scanner;
public class Q16_Array_min_max_Example {
	public static void main(String args[]) {
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print("Enter the Size of Array: ");
	      int size = sc.nextInt();
	      int numbers[] = new int[size];
	 
	      //input
	      for(int i=0; i<size; i++) {
	    	  System.out.print("Enter Array Elements of Index: "+i+": ");
	          numbers[i] = sc.nextInt();
	      }
	 
	      int max = Integer.MIN_VALUE;
	      int min = Integer.MAX_VALUE;
	     
	       for(int i=0; i<numbers.length; i++) {
	           if(numbers[i] < min) {
	               min = numbers[i];
	           }
	           if(numbers[i] > max) {
	               max = numbers[i];
	           }
	       }
	       
	       System.out.println("Minimum number is : " + min);		      
	       System.out.println("Maximum number is : " + max);
	       
	   }
	}			