
public class NonRepeatedDigitsCount{

    public static int countNonRepeatedDigits(int number){

        number=Math.abs(number);

        int[]frequency=new int[10];

        if(number==0){
            return 1;
        }

        while(number>0){
            int digit=number%10;
            frequency[digit]++;
            number=number/10;
        }

        int count=0;

        for(int i=0;i<10;i++){
            if(frequency[i]==1){
                count++;
            }
        }

        return count;
    }

    public static void main(String[]args){

        int number=12234551;

        System.out.println("Non repeated digits count="+countNonRepeatedDigits(number));
    }
}