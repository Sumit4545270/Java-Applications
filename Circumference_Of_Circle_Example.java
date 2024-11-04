import java.util.Scanner;

public class Circumference_Of_Circle_Example {
	
	public static void Circumference(int radius){
		
		float Circumferenc;
		Circumferenc = (float) (2 * 3.14 * radius);
		System.out.println("Circumference is: "+Circumferenc);
	
	}
	
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
		
			System.out.print("Enter Your Radius Number: ");
			int radius = sc.nextInt();
			
			Circumference(radius);
		
	
	}
}
