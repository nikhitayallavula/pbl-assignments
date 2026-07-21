

public class CountEvenOrOdd{

    public static void countEvenOdd(int n1,int n2,int n3,int n4,int n5){
        int evenCount=0;
        int oddCount=0;

        if(n1%2==0){
            evenCount++;
        }else{
            oddCount++;
        }

        if(n2%2==0){
            evenCount++;
        }else{
            oddCount++;
        }

        if(n3%2==0){
            evenCount++;
        }else{
            oddCount++;
        }

        if(n4%2==0){
            evenCount++;
        }else{
            oddCount++;
        }

        if(n5%2==0){
            evenCount++;
        }else{
            oddCount++;
        }

        System.out.println("Even numbers="+evenCount);
        System.out.println("Odd numbers="+oddCount);
    }

    public static void main(String[]args){

        int n1=10;
        int n2=15;
        int n3=20;
        int n4=25;
        int n5=30;

        countEvenOdd(n1,n2,n3,n4,n5);
    }
}