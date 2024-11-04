import java.util.Scanner;

public class Q11_Vote_Example {
	
	public static void vote(int age) {
		if(age>18) {
			System.out.println(age+" is Eligible for/To Vote.");
		} else {
			System.out.println(age+" is Not Eligible for/To Vote.");			
		}
	}
	
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Your Age Number: ");
			int age = sc.nextInt();
			
			vote(age);
	}
}
