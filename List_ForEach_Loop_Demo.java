package ListDemo;

import java.util.ArrayList;
import java.util.LinkedList;

public class List_ForEach_Loop_Demo {
	public static void main(String[] args) {
		
		//ArrayList Example with For-Each Loop...!
		ArrayList<String> arrayList = new ArrayList<>();
		
		arrayList.add("Mango");
		arrayList.add("Banana");
		arrayList.add("Apple");
		arrayList.add("Orange");
		
		System.out.println("Array Elements: ");
		for(String i: arrayList) {
			System.out.println(i);
		}
		
		//LinkedList Example with For-Each Loop...!
		LinkedList<String> LinkedList = new LinkedList<>();
		
		LinkedList.add("Orange");
		LinkedList.add("Apple");
		LinkedList.add("Banana");
		LinkedList.add("Mango");
		
		System.out.println("Linked List Element: ");
		for(String j: LinkedList) {
			System.out.println(j);
		}
	}
}
