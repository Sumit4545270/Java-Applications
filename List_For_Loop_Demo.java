package ListDemo;

import java.util.ArrayList;
import java.util.LinkedList;

public class List_For_Loop_Demo {
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
		
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Orange");
		
		System.out.println("Array Elements: ");
		for(int i = 0; i < fruits.size(); i++) {
			System.out.println(fruits.get(i));
		}
		
		LinkedList<String> fruit = new LinkedList<>();
		
		fruit.add("Orange");
		fruit.add("Apple");
		fruit.add("Banana");
		fruit.add("Mango");
		
		System.out.println("Linked List Element: ");
		for(int j = 0; j < fruit.size(); j++) {
			System.out.println(fruit.get(j));
		}
		
	}
}