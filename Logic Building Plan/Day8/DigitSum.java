

public class DigitSum{

    public static int digitSum(int number){

        number=Math.abs(number);
        int sum=0;

        while(number>0){
            sum=sum+number%10;
            number=number/10;
        }

        return sum;
    }

    public static void main(String[]args){

        int number=12345;

        System.out.println("Sum of digits="+digitSum(number));
    }
}