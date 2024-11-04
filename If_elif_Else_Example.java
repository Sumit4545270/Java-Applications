
import java.util.Scanner;

public class If_elif_Else_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter Your First Number: ");
				int a = sc.nextInt();
				
				System.out.println("Enter Your Second Number: ");
				int b = sc.nextInt();
				
				if(a < b) {
					System.out.println(a+" Is Lesser Than "+b);
				} else if(a > b) {
						System.out.println(a+" Is Greater Than "+b);
				} else {
					  System.out.println(a+" Is Equal To "+b);
		}
	}
}