package Collections.FunctionalInterface;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ReverseWords {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("Java");
        words.add("Python");
        words.add("Oracle");
        words.add("Spring");
        words.add("Hibernate");
        words.add("HTML");
        words.add("CSS");
        words.add("JavaScript");
        words.add("React");
        words.add("Angular");

        Consumer<ArrayList<String>> consumer = list -> {

            for (int i = 0; i < list.size(); i++) {
                String rev = new StringBuilder(list.get(i)).reverse().toString();
                list.set(i, rev);
            }
        };

        consumer.accept(words);

        System.out.println("Reversed Words:");
        System.out.println(words);
    }
}