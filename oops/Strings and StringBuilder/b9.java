import java.util.Scanner;

public class b9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        String result = "";

        int min = Math.min(a.length(), b.length());

        for (int i = 0; i < min; i++) {
            result = result + a.charAt(i) + b.charAt(i);
        }

        if (a.length() > b.length()) {
            result = result + a.substring(min);
        } else if (b.length() > a.length()) {
            result = result + b.substring(min);
        }

        System.out.println(result);

        sc.close();
    }
}