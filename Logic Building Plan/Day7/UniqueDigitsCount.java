

public class UniqueDigitsCount{

    public static int countUniqueDigits(int number){

        number=Math.abs(number);

        boolean[]visited=new boolean[10];
        int count=0;

        if(number==0){
            return 1;
        }

        while(number>0){
            int digit=number%10;

            if(!visited[digit]){
                visited[digit]=true;
                count++;
            }

            number=number/10;
        }

        return count;
    }

    public static void main(String[]args){

        int number=12234551;

        System.out.println("Unique digits count="+countUniqueDigits(number));
    }
}