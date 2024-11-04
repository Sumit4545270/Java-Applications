import java.util.Scanner;

public class Even_Odd_Example {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			System.out.print("Enter Your Number: ");
			int n = sc.nextInt();
			
			while(n <= 101){
				if(n % 2 == 0) {			
					System.out.println(n+" is Even Number");
				} else {
					System.out.println(n+" is Odd Number");
				}
				n++;			
			
		}
		
	}

}