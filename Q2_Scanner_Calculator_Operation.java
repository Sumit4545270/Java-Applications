import java.util.Scanner;

public class Q2_Scanner_Calculator_Operation {

	public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Your First Number: ");
			int a = sc.nextInt();
			
			System.out.print("Enter Your Second Number: ");
			int b = sc.nextInt();
							
						
			int sum1, mul;
			float div, mod;
					
				 
			sum1 = a + b;
			mul = a * b;
			div = a / b;
			mod = a % b;
			
			
			System.out.println("                                                              ");
			System.out.println("                                                              ");
				
				
			System.out.println("Addition of "+a+" And "+b+" Number is: "+sum1);
			System.out.println("Multiplication of "+a+" And "+b+" Number is: "+mul);
			System.out.println("Division of "+a+" And "+b+" Number is: "+div);
			System.out.println("Modulos of "+a+" And "+b+" Number is: "+mod);
		}
}