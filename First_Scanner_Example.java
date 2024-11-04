import java.util.*;
public class First_Scanner_Example {
	
	public static void main(String[] args)
	{
			try (Scanner sc = new Scanner(System.in)) {
				System.out.print("Enter Your Name: ");
				String name = sc.nextLine();
				
				System.out.print("Enter Your Number: ");
				long num = sc.nextLong(10);
				
				System.out.print("Enter Your Percentage: ");
				float per = sc.nextFloat();
				
				System.out.println("Name is: "+name);
				System.out.println("Number is: "+num);
				System.out.println("Percentage is: "+per);
			}
		
			
		
	}

}