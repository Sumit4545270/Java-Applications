import java.util.Scanner;

public class Q7_Function_Example {
	
	public static void Func(String nameString,int roll) {
		
		
		
		System.out.println(nameString+" is Your Name...");
		System.out.println(roll+" is Your Roll_No... ");
		return;
	}
	
	
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Your Name: ");
			String nameString = sc.nextLine();
			
			System.out.print("Enter Your Roll_No: ");
			int roll = sc.nextInt();
			
			Func(nameString,roll);
	}
}
