import java.util.Scanner;
public class b3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String s1=sc.next();
         for(int i=0;i<s1.length();i++){
            String s2 = s1.substring(0,2);
            System.out.print(s2+"");
         }
         sc.close();
        }
}
