package SetDemo;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		Set<String> treeSetStrings = new TreeSet<>();
		
		treeSetStrings.add("Mango");
		treeSetStrings.add("Banana");
		treeSetStrings.add("Apple");
		treeSetStrings.add("Orange");
		treeSetStrings.add("Banana");
		
		System.out.println(treeSetStrings);
		
	}
}
