package SetDemo;

import java.util.LinkedHashSet;
import java.util.Set;

public class ListHashSetDemo {
	public static void main(String[] args) {
		Set<String> linkedhashSet = new LinkedHashSet<>();
		
		linkedhashSet.add("Mango");
		linkedhashSet.add("Banana");
		linkedhashSet.add("Apple");
		linkedhashSet.add("Orange");
		linkedhashSet.add("Apple");
		
		System.out.println(linkedhashSet);		
	}
}
