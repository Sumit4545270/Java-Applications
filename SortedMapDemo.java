package MapDemo;

import java.util.SortedMap;
import java.util.TreeMap;

class Student1 implements Comparable<Student1> {
	
	int rollNo;
	String name;
	
	Student1(int rollNo, String name){
		this.rollNo = rollNo;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return rollNo + " ---> " + name;
	}
	
	// Correctly overriding the compareTo method
	@Override
	public int compareTo(Student1 other) {
		// Compare based on name
		return this.name.compareTo(other.name);
	}
}

public class SortedMapDemo {
	public static void main(String[] args) {
		
		// TreeMap with Student as key
		SortedMap<Student1, Integer> ampMap = new TreeMap<>();
		Student1 s1 = new Student1(65, "Sojal");
		Student1 s2 = new Student1(66, "Sumit");
		Student1 s3 = new Student1(67, "Sunny");
		
		ampMap.put(s3, 65);
		ampMap.put(s2, 66);
		ampMap.put(s1, 67);
		
		System.out.println("All Entries: " + ampMap);		
		System.out.println("Tail Elements: " + ampMap.tailMap(s2));
		System.out.println("Head Elements: " + ampMap.headMap(s2));
		System.out.println("FirstKey Element: " + ampMap.firstKey());
		System.out.println("LastKey Elements: " + ampMap.lastKey());
		System.out.println("  ");
		System.out.println("  ");
		
		// Another TreeMap with String as key
		SortedMap<String, Integer> sm = new TreeMap<>();
		
		sm.put("Sumit",111);
		sm.put("Sunny", 112);
		sm.put("Sojal", 113);
		
		System.out.println("All Entries: " + sm);
		System.out.println("Tail Elements: " + sm.tailMap("Sumit"));
		System.out.println("Head Elements: " + sm.headMap("Sumit"));
		System.out.println("FirstKey Element: " + sm.firstKey());
		System.out.println("LastKey Elements: " + sm.lastKey());
	}
}
