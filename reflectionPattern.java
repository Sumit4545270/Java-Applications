package PatternPrinting;

public class reflectionPattern {
	public static void main(String[] args) {
		
		int n = 4;
		int Space = 2*(n - 1);
		for (int i = 1; i <= n; i++) {
            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            
            //Printing Space
            for(int x = 1; x <= Space; x++) {
            	System.out.print("*");
            }
            
            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Move to the next line after each row
            Space = Space - 2;
            System.out.println();
        }		
	}
}
