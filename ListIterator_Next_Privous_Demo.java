package ListDemo;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIterator_Next_Privous_Demo {
	public static void main(String[] args) {
		
		LinkedList<String> fruit = new LinkedList<>();
		
		fruit.add("Orange");
		fruit.add("Apple");
		fruit.add("Banana");
		fruit.add("Mango");
		
		ListIterator<String> listIterator1 = fruit.listIterator();
		
		//has Next Condition
		System.out.println("Iteration Using ListIterator Next: ");
		while(listIterator1.hasNext()) {
			String fruits1 = listIterator1.next();
			System.out.println(fruits1);
		}
		
		//has Previous Condition
		System.out.println("Iteration Using ListIterator Privious: ");
		while(listIterator1.hasPrevious()) {
			String fruits2 = listIterator1.previous();
			System.out.println(fruits2);
		}
	}
}