package ListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class List_Iterator_Demo {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		
		arrayList.add("Mango");
		arrayList.add("Banana");
		arrayList.add("Apple");
		arrayList.add("Orange");
		
		Iterator<String> iterator1 = arrayList.iterator();
		
		System.out.println("Array Elements: ");
		while (iterator1.hasNext()) {
			String fruits1 = iterator1.next();
			System.out.println(fruits1);			
		}
		
		LinkedList<String> fruit = new LinkedList<>();
		
		fruit.add("Orange");
		fruit.add("Apple");
		fruit.add("Banana");
		fruit.add("Mango");
		
		Iterator<String> iterator2 = fruit.iterator();
		
		System.out.println("Linked List Element: ");
		while(iterator2.hasNext()) {
			String fruits2 = iterator2.next();
			System.out.println(fruits2);
		}
		
	}
}
