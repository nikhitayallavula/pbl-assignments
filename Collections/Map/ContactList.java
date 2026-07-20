import java.util.*;

public class ContactList {

    public static void main(String[] args) {

        HashMap<String, Integer> contacts = new HashMap<>();

        contacts.put("Rahul", 123456789);
        contacts.put("Priya", 987654321);
        contacts.put("Kiran", 567890123);

        System.out.println("Contains Rahul: " +
                contacts.containsKey("Rahul"));

        System.out.println("Contains Number 987654321: " +
                contacts.containsValue(987654321));

        Iterator<Map.Entry<String, Integer>> itr =
                contacts.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<String, Integer> entry = itr.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}