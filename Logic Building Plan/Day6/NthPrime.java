

public class NthPrime{

    public static boolean isPrime(int number){

        if(number<=1){
            return false;
        }

        for(int i=2;i<=number/2;i++){
            if(number%i==0){
                return false;
            }
        }

        return true;
    }

    public static int nthPrime(int n){

        if(n<=0){
            return-1;
        }

        int count=0;
        int number=1;

        while(count<n){
            number++;

            if(isPrime(number)){
                count++;
            }
        }

        return number;
    }

    public static void main(String[]args){

        int n=10;

        System.out.println("The "+n+"th prime number="+nthPrime(n));
    }
}