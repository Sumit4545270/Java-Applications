package Array;

import java.util.Scanner;

public class Search {
	public static void main(String[] args) {
		int arr[] = new int[5];
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Array...");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = i + 1;
				System.out.println("arr["+i+"] = "+arr[i]);
			}
			
			System.out.println("Enter Element to be get Searched From Array: ");
			int n = scanner.nextInt();
			System.out.println("Entered Element to be get Searched From Array is: "+n);
			
			System.out.println("Element is in Searching...");
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] == n) {
					System.out.println("Array Element is on Index: "+i+" is: "+n);				
				}
			}
		}
	}
}
