package PatternPrinting;

import java.util.Scanner;

public class BinaryPattern {
	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			
			System.out.println("Enter Number of Rows: ");
			int no = scanner.nextInt();
			
			for(int i = 1; i <= no; i++) {
				
				int Start = (i % 2 == 0) ? 0 : 1;
				
				for(int j = 1; j <= i; j++) {
					System.out.print(Start+" ");
					Start = (Start == 0) ? 1 : 0;
				}
				System.out.println();
			}
		}
	}
}
