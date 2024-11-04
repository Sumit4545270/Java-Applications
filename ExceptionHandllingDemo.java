package Exception_Handler;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandllingDemo {
    
    public static void main(String[] args) throws IOException, ArithmeticException {
                
        try (Scanner scanner = new Scanner(System.in)){
        	
            // Get inputs from the user
            System.out.println("Enter First Value");
            int a = scanner.nextInt();
            
            System.out.println("Enter Second Value");
            int b = scanner.nextInt();
            
            // Perform the division
            String result = M1(a, b);
            
            // Print the result
            System.out.println(result);
            
        } catch (ArithmeticException e) {
            System.out.println("An Exception Occurred: " + e.getMessage());
        } 
        catch (InputMismatchException io) {
			System.out.println("An Exception Occurred: "+ io.getStackTrace());
		}finally {
            System.out.println("Regardless of try and catch blocks, the finally block always executes.");
        }
    }
    
    // Method to perform division and handle exceptions
    public static String M1(int a, int b) throws ArithmeticException, IOException {
        if (a <= 0) {
            throw new ArithmeticException("The first number must be greater than 0.");
        }
        if (b <= 0) {
            throw new ArithmeticException("The second number must be greater than 0.");
        }
        
        int Div = a / b;
        return "The Division is: " + Div;
    }
}