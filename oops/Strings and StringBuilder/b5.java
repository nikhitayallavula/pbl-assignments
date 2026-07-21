import java.util.Scanner;
public class b5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        int n=s.length()-1;
        String s1 = s.substring(1,n);
        System.out.println(s1);
        sc.close();

    }
}
