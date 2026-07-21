

public class Factorial{

    public static int factorial(int number){

        if(number<0){
            return-1;
        }

        int fact=1;

        for(int i=1;i<=number;i++){
            fact=fact*i;
        }

        return fact;
    }

    public static void main(String[]args){

        int number=5;

        System.out.println("Factorial of "+number+"="+factorial(number));
    }
}