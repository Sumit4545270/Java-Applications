package Exception_Handler;

import java.util.Scanner;

public class Exception_Handler_getMessage {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("First Input: ");
			int a = scanner.nextInt();
			System.out.println("Second Input: ");
			int b = scanner.nextInt();
			
			int ans = a/b;
			System.out.println("Division is: "+ans);
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Exception Occurred Error Message: "+e.getMessage());
		}
	
	}

}
