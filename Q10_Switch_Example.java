import java.util.Scanner;

public class Q10_Switch_Example {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Your Choosed Number: ");
			int color = sc.nextInt();
			
			switch(color) {
			
				case 1: System.out.println("Choosed Color is: Saffron ");
				break;
				
				case 2: System.out.println("Choosed Color is: Red");
				break;
				
				case 3: System.out.println("Choosed Color is: Yellow");
				break;
				
				case 4: System.out.println("Choosed Color is: Green");
				break;
				
				case 5: System.out.println("Choosed Color is: White");
				break;
				
				case 6: System.out.println("Choosed Color is: Black");
				break;
				
				case 7: System.out.println("Choosed Color is: Orange");
				break;
				
				case 8: System.out.println("Choosed Color is: Pink");
				break;
				
				case 9: System.out.println("Choosed Color is: Blue");
				break;
			
			}
		
	}
}