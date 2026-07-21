

public class MostFrequentDigit {
    public static void main(String[] args) {

        int num=122333;

        int count[]=new int[10];

        while(num>0) {

            int digit=num%10;

            count[digit]++;

            num=num/10;
        }

        int max=0;
        int result=0;

        for(int i=0;i<10;i++) {

            if(count[i]>max) {
                max=count[i];
                result=i;
            }
        }

        System.out.println(result);
    }
}