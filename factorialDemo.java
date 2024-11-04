package InterviewPrepration;
import java.util.Scanner;

public class factorialDemo {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Value for Factorial: ");	
			int num = sc.nextInt(); 
			
			int result = factorial(num);
			int factorial = 1;
			
			System.out.println("Factorial of "+num+" is "+result +" proved by factorial Method" );
				
//			for(int i = 1; i <= num; i++) {
//				factorial = factorial * i;
//			}
//			System.out.println(factorial+" Is a Factorial Proved by For Loop");
			
			
			while(num > 0) {
				factorial = factorial * num;
				num--;
			}
			System.out.println(factorial+" is a factorial proved by while loop");
		}
	}	
	public static int factorial(int num){
		if(num == 0) {
			return 1;
		}
		else {
			return num * factorial(num - 1);
		}
	}	
}