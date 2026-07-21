

public class Return_SecondLastDigit{

    public static int getSecondLastDigit(int number){
        number=Math.abs(number);

        if(number<10){
            return-1;
        }

        return(number/10)%10;
    }

    public static void main(String[]args){

        int num1=197;
        int num2=-197;
        int num3=5;

        System.out.println("Second last digit of "+num1+" is "+getSecondLastDigit(num1));
        System.out.println("Second last digit of "+num2+" is "+getSecondLastDigit(num2));
        System.out.println("Second last digit of "+num3+" is "+getSecondLastDigit(num3));
    }
}