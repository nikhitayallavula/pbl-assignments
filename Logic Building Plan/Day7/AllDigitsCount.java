
public class AllDigitsCount{

    public static int countDigits(int number){

        number=Math.abs(number);

        if(number==0){
            return 1;
        }

        int count=0;

        while(number>0){
            count++;
            number=number/10;
        }

        return count;
    }

    public static void main(String[]args){

        int number=123456;

        System.out.println("Number of digits="+countDigits(number));
    }
}