import java.util.Scanner;

public class Q15_Scanner_Array_Example {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Array Upto: ");
		int Size = sc.nextInt();
		
		int marks[] = new int[Size];
		
		for(int i=0;i<Size;i++){
			
			System.out.println("Enter the Element of Array: "+i);
			marks[i] = sc.nextInt();
			
		}
		
		//printing the Numbers in Array
		for(int i=0;i<Size;i++){
			
			System.out.println("Entered Element of Array Index"+i+": "+marks[i]);
			
		}
	}

}
