import java.util.Scanner;

public class Q9_Sum_Of_Odd_Example {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter Your 1st Number: ");
			int n = sc.nextInt();			
			
			Odd(n);
	}
	public static void Odd(int n) {		
		
		int Sum = 0;		
		
		for (int i = 1; i <= n; i++) {			
			if (i%2==1) {
				System.out.println("Odd Number: "+i);
				Sum = Sum + i;
			}					
		}
		
		System.out.print("Sum of Odd Numbers is: "+Sum);		
	}
}
