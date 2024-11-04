import java.util.Iterator;
import java.util.Scanner;

public class Q17_2D_Array_Example {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number of Rows: ");
		int row = scanner.nextInt();
		System.out.print("Enter Number of Column: ");
		int column = scanner.nextInt();
		
		int[][] num = new int[row][column];
		
		for(int i=0; i<column;i++) {
			for(int j=0; j<row;j++) {
				num[i][j] = scanner.nextInt();
			}			
		}
		
		for(int j=0;j<row;j++) {
			for(int i=0;i<column;i++) {
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}		
	}
}