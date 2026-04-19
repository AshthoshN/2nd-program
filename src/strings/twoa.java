package strings;

// Develop a java program for performing various string operations with different string handling functions
// including: String Creation, Length, Comparison, Searching, Substring, Modification, Whitespace,
// Concatenation, Splitting, StringBuilder, Formatting, and Email Validation using contains(), startsWith(), endsWith()

import java.util.*;

public class twoa {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = new String("World");

        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);

        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1: " + str1.charAt(1));

        String str3 = "hello";
        System.out.println("Equals: " + str1.equals(str3));
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str3));

        System.out.println("Index of 'l': " + str1.indexOf('l'));
        System.out.println("Contains 'He': " + str1.contains("He"));

        System.out.println("Substring (1 to 4): " + str1.substring(1, 4));

        String modified = str1.replace("H", "J");
        System.out.println("Modified String: " + modified);

        String str4 = "   Java Programming   ";
        System.out.println("Before trim: '" + str4 + "'");
        System.out.println("After trim: '" + str4.trim() + "'");

        String concat = str1 + " " + str2;
        System.out.println("Concatenated: " + concat);

        String sentence = "Java is fun";
        String[] words = sentence.split(" ");
        System.out.println("Split words:");
        for (String w : words) {
            System.out.println(w);
        }

        StringBuilder sb = new StringBuilder("Start");
        sb.append(" - Middle");
        sb.append(" - End");
        System.out.println("StringBuilder: " + sb);

        String formatted = String.format("Name: %s, Age: %d", "John", 20);
        System.out.println("Formatted String: " + formatted);

        String email = "example@gmail.com";

        if (email.contains("@") &&
            email.startsWith("example") &&
            email.endsWith(".com")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}