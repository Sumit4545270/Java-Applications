package ListDemo;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        // Creating a LinkedList of String type
        LinkedList<String> cities = new LinkedList<>();

        // Adding elements to the LinkedList
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");

        // Adding elements at the beginning and end
        cities.addFirst("San Francisco");
        cities.addLast("Miami");

        // Accessing elements using an index
        System.out.println("Second city: " + cities.get(1)); // Output: New York

        // Iterating over the LinkedList
        System.out.println("All cities:");
        for (String city : cities) {
            System.out.println(city);
        }

        // Removing the first and last elements
        cities.removeFirst();
        cities.removeLast();
        System.out.println("After removing first and last cities: " + cities);

        // Checking the size of the LinkedList
        System.out.println("Number of cities: " + cities.size());
    }
}