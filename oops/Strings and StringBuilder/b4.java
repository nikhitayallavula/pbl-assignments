import java.util.Scanner;
public class b4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.length()%2==0){
            int n = s.length()/2;
            String s1 = s.substring(0,n);
            System.out.println(s1);
        }
        else{
            System.out.println("null");
        }
        sc.close();
    }
}
