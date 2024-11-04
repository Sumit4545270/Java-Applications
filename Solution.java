package SetDemo;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Convert both strings to lowercase to make the comparison case-insensitive
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        // If the lengths are different, they cannot be anagrams
        if (a.length() != b.length()) {
            return false;
        }
        
        // Convert strings to character arrays
        char[] arrayA = a.toCharArray();
        char[] arrayB = b.toCharArray();
        
        // Sort the character arrays
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        
        // Compare the sorted arrays
        return Arrays.equals(arrayA, arrayB);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
