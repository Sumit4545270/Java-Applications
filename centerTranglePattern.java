package PatternPrinting;

public class centerTranglePattern {
	public static void main(String[] args) {
        
		// Outer loop to handle the number of rows
        for (int i = 1; i <= 5; i++) {
            
        	
        	// Inner loop for spaces
            for (int j = i; j < 5; j++) {
                System.out.print(" "); // Printing space
            }
            
            // Inner loop for asterisk
            for (int k = 1; k <= i; k++) {
                System.out.print("* "); // Printing asterisk
            }
            
            // Moving to the next line after each row
            System.out.println();
            
        }
        
        for (int i = 5; i >= 1; i--) {
            
            // Inner loop for spaces (to maintain alignment)
            for (int j = 5; j > i; j--) {
                System.out.print(" "); // Printing space
            }
            
            // Inner loop for asterisks
            for (int k = 1; k <= 2*i-1; k++) {
                System.out.print("*"); // Printing asterisk
            }
            
            // Moving to the next line after each row
            System.out.println();
        }
    }
}
