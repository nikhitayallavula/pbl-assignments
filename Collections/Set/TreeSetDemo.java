import java.util.*;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<String> set = new TreeSet<>();

        set.add("Java");
        set.add("Python");
        set.add("C");
        set.add("HTML");
        set.add("JavaScript");

        // a) Reverse the elements
        System.out.println("Reverse Order:");
        Iterator<String> rev = set.descendingIterator();

        while (rev.hasNext()) {
            System.out.println(rev.next());
        }

        // b) Iterate using Iterator
        System.out.println("\nNormal Order:");
        Iterator<String> itr = set.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // c) Check if element exists
        System.out.println("\nContains Java : " + set.contains("Java"));
        System.out.println("Contains C++ : " + set.contains("C++"));
    }
}