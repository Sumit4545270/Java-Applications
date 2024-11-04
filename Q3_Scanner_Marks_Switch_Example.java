import java.util.Scanner;

public class Q3_Scanner_Marks_Switch_Example {
	
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 0/1 Number: ");
			int a = sc.nextInt();
			
			switch(a) {
			case 0: 
				break;
				
			case 1: System.out.println("Enter Your Marks: ");
					float marks = sc.nextFloat();
				
				if(marks >= 90) {
					System.out.println(marks+" is Excellent.");							
				} else if(marks >= 75 ) {
					System.out.println(marks+" is Nice.");
				} else if(marks >= 60) {
					System.out.println(marks+" is Good.");
				} else {
					System.out.println(marks+" Better luck...! Next Time...!");
				}
			}
	}
}