import java.util.Scanner;

public class For_Example {
	
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Number: ");
			int n = sc.nextInt();
			int sum;
			
			for(int i = 1; i < 11 ; i++) {
				
				sum = (n*i);
				System.out.println(sum);
				
			}
		
		
	}

}