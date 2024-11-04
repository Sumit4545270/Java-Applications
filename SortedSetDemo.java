package SetDemo;

import java.util.TreeSet;

class Book_Demo implements Comparable<Book_Demo> {  // Implementing Comparable interface
	
	int roll_no;
	String nameString;
	
	public Book_Demo(int roll_no, String nameString) {
		this.roll_no = roll_no;
		this.nameString = nameString;
	}
	
	public String toString() {
		return roll_no + "--->" + nameString;
	}
	
// Overriding the compareTo method to compare Book objects by roll_no
	@Override
	public int compareTo(Book_Demo other) {
		return Integer.compare(this.roll_no, other.roll_no);
	}
	
// Overriding the compareTo method to compare Book objects by nameString
//	@Override
//	public int compareTo(Book_Demo other) {
//		return this.nameString.compareTo(other.nameString);  // Compare based on nameString
//	}
}

public class SortedSetDemo {
	public static void main(String[] args) {
		
		TreeSet<Book_Demo> treeSet = new TreeSet<Book_Demo>();
		
		Book_Demo B1 = new Book_Demo(111, "Java");
		Book_Demo B2 = new Book_Demo(222, "Python");
		Book_Demo B3 = new Book_Demo(333, "SQL");
		
		System.out.println("Printing Elements of a TreeSet: ");
		treeSet.add(B3); //adding
		treeSet.add(B2); //adding
		treeSet.add(B1); //adding
		System.out.println(treeSet);
		
		System.out.println(" "); //Extra Space
		System.out.println(" ");
		
		System.out.println("After Adding Values, Printing Elements of a TreeSet: ");
		Book_Demo B4 = new Book_Demo(444, "Data Structure");
		treeSet.add(B4); //adding
		treeSet.add(B3); //adding duplicate
		System.out.println(treeSet);
		
		System.out.println(" "); //Extra Space
		System.out.println(" "); //Extra Space
		
		System.out.println("Elements Printed Using HeadSet");
		TreeSet<Book_Demo> bkDemos1 = (TreeSet<Book_Demo>) treeSet.headSet(B3);
		System.out.println(bkDemos1);
		
		System.out.println(" "); //Extra Space
		System.out.println(" "); //Extra Space
		
		System.out.println("Elements Printed Using TailSet");
		TreeSet<Book_Demo> bkDemos2 = (TreeSet<Book_Demo>) treeSet.tailSet(B3);
		System.out.println(bkDemos2);
		
		System.out.println(" "); //Extra Space
		System.out.println(" "); //Extra Space
		
		System.out.println("Elements Printed Using First");
		Book_Demo itrInteger1 = treeSet.first();
		System.out.println(itrInteger1);
		
		System.out.println(" "); //Extra Space
		System.out.println(" "); //Extra Space
		
		System.out.println("Elements Printed Using Last");
		Book_Demo itrInteger2 = treeSet.last();
		System.out.println(itrInteger2);
	}
}
