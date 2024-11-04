package SetDemo;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<>();
		
		hashSet.add("Mango");
		hashSet.add("Banana");
		hashSet.add("Apple");
		hashSet.add("Orange");
		hashSet.add("Banana");
		
		System.out.println(hashSet);
		
	}
}
