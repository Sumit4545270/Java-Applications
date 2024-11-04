import java.util.*;

public class Q1_Scanner_Circle_Operation {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
			int Radius = sc.nextInt();
			float pi = 3.14f;
			float calculation = pi*Radius*Radius;
			
			System.out.println("Radius of Circle is: "+Radius);
			System.out.println("Area of Circle: "+calculation);
		}
}