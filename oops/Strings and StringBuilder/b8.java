import java.util.Scanner;
public class b8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        StringBuffer sb= new StringBuffer(s);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                sb.delete(i-1,i+2);
            }
        }
        System.out.println(sb);
        sc.close();
    }
}
