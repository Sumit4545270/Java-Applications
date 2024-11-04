package SetDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class Book{
	int book_id;
	String title, author, publisher;
	int quantity;
	
	public Book(int book_id, String title,String author, String publisher, int quantity) {
		this.book_id = book_id;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	
	public String toString() {
		return book_id+"--->"+title+"--->"+author+"--->"+publisher+"--->"+quantity;
	}
	
	public boolean equals(Object O) {
		return this.book_id == ((Book)O).book_id;
	}
	
	public int hashCode() {
		return book_id;
	}
	
}
public class SetLibraryDemo {
	public static void main(String[] args) {
		HashSet<Book> book_set = new HashSet<Book>();
		
		Book b1 = new Book(111, "Python", "Biden", "Nirali", 25);
		Book b2 = new Book(112, "Java", "Joe", "Bitly", 26);
		Book b3 = new Book(113, "DSA", "Sam", "Prakashan", 27);
		System.out.println("Adding Elements: ");
		book_set.add(b1);
		book_set.add(b2);
		book_set.add(b3);
		
		for(Book i: book_set) {
			System.out.println(i);
		}
		
		Book b4 = new Book(114, "HTML", "Ram", "W3School", 28);
		book_set.add(b4);
		book_set.add(b3);
		
		System.out.println("After Adding Elements the Duplicates Values are Eliminated: ");
		Iterator<Book> iterator = book_set.iterator();
		while (iterator.hasNext()) {
			Book book = iterator.next();
			System.out.println(book);
		}
		
		System.out.println("HashSet Values: ");
		HashSet<Integer> integers1 = new HashSet<>();
		
		integers1.add(10);
		integers1.add(20);
		integers1.add(30);
		integers1.add(40);
		integers1.add(50);
		
		System.out.println(integers1);	
		
		System.out.println("LinkedHashSet Values: ");
		LinkedHashSet<Integer> integers2 = new LinkedHashSet<>();
		
		integers2.add(10);
		integers2.add(20);
		integers2.add(30);
		integers2.add(40);
		integers2.add(50);
		
		System.out.println(integers2);	
		
		System.out.println("TreeSet Values: ");
		TreeSet<Integer> integers3 = new TreeSet<>();
		
		integers3.add(10);
		integers3.add(20);
		integers3.add(30);
		integers3.add(40);
		integers3.add(50);
		
		System.out.println(integers3);	
	}	
}