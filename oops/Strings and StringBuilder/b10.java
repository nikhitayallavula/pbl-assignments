import java.util.Scanner;

public class b10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int n = sc.nextInt();

        String last = str.substring(str.length() - n);

        for (int i = 0; i < 3; i++) {
            System.out.print(last);
        }

        sc.close();
    }
}