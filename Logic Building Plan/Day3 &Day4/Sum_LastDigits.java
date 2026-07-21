

public class Sum_LastDigits{

    public static int addLastDigits(int input1,int input2){
        int lastDigit1=Math.abs(input1%10);
        int lastDigit2=Math.abs(input2%10);

        return lastDigit1+lastDigit2;
    }

    public static void main(String[]args){

        int num1=267;
        int num2=154;
        int num3=-267;
        int num4=-154;

        System.out.println("Sum of last digits of "+num1+" and "+num2+" is "+addLastDigits(num1,num2));
        System.out.println("Sum of last digits of "+num1+" and "+num4+" is "+addLastDigits(num1,num4));
        System.out.println("Sum of last digits of "+num3+" and "+num2+" is "+addLastDigits(num3,num2));
        System.out.println("Sum of last digits of "+num3+" and "+num4+" is "+addLastDigits(num3,num4));
    }
}