package ListDemo;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Creating an ArrayList of String type
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Accessing elements using an index
        System.out.println("First fruit: " + fruits.get(0)); // Output: Apple

        // Iterating over the ArrayList
        System.out.println("All fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Removing an element from the ArrayList
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // Checking the size of the ArrayList
        System.out.println("Number of fruits: " + fruits.size());
    }
}
