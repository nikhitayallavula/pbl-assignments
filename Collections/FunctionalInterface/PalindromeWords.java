package Collections.FunctionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PalindromeWords {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("madam");
        words.add("java");
        words.add("level");
        words.add("hello");
        words.add("radar");
        words.add("world");
        words.add("malayalam");
        words.add("racecar");
        words.add("apple");
        words.add("noon");

        Predicate<String> p = str ->
                str.equals(new StringBuilder(str).reverse().toString());

        System.out.println("Palindrome Words");

        for(String s:words){
            if(p.test(s))
                System.out.println(s);
        }
    }
}