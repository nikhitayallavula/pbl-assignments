
import java.util.Scanner;

public class IsOddFunction{

    static int isOdd(int n){
        if(n%2!=0){
            return 2;
        }else{
            return 1;
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n=sc.nextInt();

        int result=isOdd(n);

        if(result==2){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }

        sc.close();
    }
}