

public class NthFibonacci{

    public static int nthFibonacci(int n){

        if(n<=0){
            return-1;
        }

        if(n==1){
            return 0;
        }

        if(n==2){
            return 1;
        }

        int first=0;
        int second=1;
        int next=0;

        for(int i=3;i<=n;i++){
            next=first+second;
            first=second;
            second=next;
        }

        return next;
    }

    public static void main(String[]args){

        int n=7;

        System.out.println("The "+n+"th Fibonacci number="+nthFibonacci(n));
    }
}