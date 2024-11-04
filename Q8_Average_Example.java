import java.util.Scanner;

public class Q8_Average_Example {
	
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter Your 1st Number: ");
			int a = sc.nextInt();
			
			System.out.print("Enter Your 2nd Number: ");
			int b = sc.nextInt();
			
			System.out.print("Enter Your 3rd Number: ");
			int c = sc.nextInt();
			
			Average(a, b, c);
		}
	
	public static void Average(int a, int b, int c) {
		
		int sum = a + b + c;
		int div = sum / 3;
		
		System.out.println(div+" is your Average");
		
	}
}
