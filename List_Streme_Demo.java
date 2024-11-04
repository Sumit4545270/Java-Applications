package ListDemo;

import java.util.ArrayList;
import java.util.LinkedList;

public class List_Streme_Demo {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		
		arrayList.add("Mango");
		arrayList.add("Banana");
		arrayList.add("Apple");
		arrayList.add("Orange");
		
		System.out.println("ArrayList Element: ");
		arrayList.stream().forEach(System.out::println);
		
		LinkedList<String> fruit = new LinkedList<>();
		
		fruit.add("Orange");
		fruit.add("Apple");
		fruit.add("Banana");
		fruit.add("Mango");
		
		System.out.println("LinkedList Element: ");
		fruit.stream().forEach(System.out::println);
	}
}
