

public class NumberOfPrimesInRange{

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

    public static int countPrimes(int start,int end){

        int count=0;

        for(int i=start;i<=end;i++){
            if(isPrime(i)){
                count++;
            }
        }

        return count;
    }

    public static void main(String[]args){

        int start=1;
        int end=20;

        System.out.println("Number of prime numbers="+countPrimes(start,end));
    }
}