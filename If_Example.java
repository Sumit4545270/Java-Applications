import java.util.Scanner;

public class If_Example {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Your First Number: ");
			int a = sc.nextInt();
			
			System.out.println("Enter Your Second Number: ");
			int b = sc.nextInt();
			
			if(a==b) {
				
				System.out.println(a+" Is Equal To "+b);
				
			}
		}
}