
import java.util.Scanner;
public class b1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        StringBuffer sb = new StringBuffer(s);
        String rev = sb.reverse().toString();
        if(s.equals(rev)){
            System.out.println("Given String is Palindrome");
        }
        else{
            System.out.println("Given String is not a Palindrome");
        }
        sc.close();
    }
}