

public class CountEvenNumbers{

    public static int countEven(int n1,int n2,int n3,int n4,int n5){
        int count=0;

        if(n1%2==0){
            count++;
        }

        if(n2%2==0){
            count++;
        }

        if(n3%2==0){
            count++;
        }

        if(n4%2==0){
            count++;
        }

        if(n5%2==0){
            count++;
        }

        return count;
    }

    public static void main(String[]args){

        int n1=10;
        int n2=15;
        int n3=20;
        int n4=25;
        int n5=30;

        System.out.println("Number of even numbers="+countEven(n1,n2,n3,n4,n5));
    }
}