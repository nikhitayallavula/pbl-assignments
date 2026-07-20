import java.util.*;

public class StringOperations {

    public static ArrayList<String> performOperations(String s1, String s2) {

        ArrayList<String> list = new ArrayList<>();

        // 1. Replace alternate characters of S1 with S2
        StringBuilder op1 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0)
                op1.append(s2);
            else
                op1.append(s1.charAt(i));
        }
        list.add(op1.toString());

        // 2. Replace last occurrence of S2 with reverse(S2)
        int first = s1.indexOf(s2);
        int last = s1.lastIndexOf(s2);

        if (first != last) {
            String rev = new StringBuilder(s2).reverse().toString();
            String op2 = s1.substring(0, last) + rev + s1.substring(last + s2.length());
            list.add(op2);
        } else {
            list.add(s1 + s2);
        }

        // 3. Delete first occurrence of S2
        if (first != last) {
            String op3 = s1.substring(0, first) + s1.substring(first + s2.length());
            list.add(op3);
        } else {
            list.add(s1);
        }

        // 4. Divide S2 into two halves
        int mid = (s2.length() + 1) / 2;
        String firstHalf = s2.substring(0, mid);
        String secondHalf = s2.substring(mid);
        list.add(firstHalf + s1 + secondHalf);

        // 5. Replace characters of S1 present in S2 with '*'
        StringBuilder op5 = new StringBuilder();
        for (char ch : s1.toCharArray()) {
            if (s2.indexOf(ch) != -1)
                op5.append("*");
            else
                op5.append(ch);
        }
        list.add(op5.toString());

        return list;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter S1: ");
        String s1 = sc.nextLine();

        System.out.print("Enter S2: ");
        String s2 = sc.nextLine();

        ArrayList<String> result = performOperations(s1, s2);

        System.out.println("\nOutput:");
        for (String s : result) {
            System.out.println(s);
        }

        sc.close();
    }
}