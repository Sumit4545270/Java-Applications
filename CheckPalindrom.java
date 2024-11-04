package InterviewPrepration;

import java.util.Scanner;

public class CheckPalindrom {
	
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter String: ");
			String str = sc.nextLine();
			
			boolean IsPallindrome = CheckPalindrom_or_not(str);
			System.out.println("Is the String is Pallindrome: "+IsPallindrome);
		}		
	}	
	
	private static boolean CheckPalindrom_or_not(String str) {
		int i = 0, j = str.length() - 1;
		
		while(i < j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	
	}
}
