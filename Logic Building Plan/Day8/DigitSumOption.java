

public class DigitSumOption{

    public static int digitSumOption(int number,char option){

        number=Math.abs(number);
        int sum=0;

        while(number>0){
            int digit=number%10;

            if(option=='E'||option=='e'){
                if(digit%2==0){
                    sum=sum+digit;
                }
            }else if(option=='O'||option=='o'){
                if(digit%2!=0){
                    sum=sum+digit;
                }
            }

            number=number/10;
        }

        return sum;
    }

    public static void main(String[]args){

        int number=123456;
        char option='E';

        System.out.println("Sum of selected digits="+digitSumOption(number,option));

        option='O';
        System.out.println("Sum of selected digits="+digitSumOption(number,option));
    }
}