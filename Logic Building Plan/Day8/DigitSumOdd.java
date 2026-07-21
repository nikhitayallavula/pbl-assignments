

public class DigitSumOdd{

    public static int digitSumOdd(int number){

        number=Math.abs(number);
        int sum=0;

        while(number>0){
            int digit=number%10;

            if(digit%2!=0){
                sum=sum+digit;
            }

            number=number/10;
        }

        return sum;
    }

    public static void main(String[]args){

        int number=123456;

        System.out.println("Sum of odd digits="+digitSumOdd(number));
    }
}