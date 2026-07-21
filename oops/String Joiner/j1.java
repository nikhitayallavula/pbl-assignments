
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

public class j1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();

        ArrayList<String> list = new ArrayList<>();

        System.out.println("Enter Names:");

        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }

        StringJoiner sj = new StringJoiner(",", "{", "}");

        for (String name : list) {
            sj.add(name);
        }

        System.out.println(sj);

        sc.close();
    }
}