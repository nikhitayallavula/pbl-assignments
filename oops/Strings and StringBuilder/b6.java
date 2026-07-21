import java.util.Scanner;
public class b6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1=sc.next();
    String s2=sc.next();
    if(s1.length()<=s2.length()){
        String s = s1 + s2 + s1;
        System.out.println(s);
    }
    else{
        String s = s2+s1+s2;
        System.out.println(s);
    }
    sc.close();
  }  
}
