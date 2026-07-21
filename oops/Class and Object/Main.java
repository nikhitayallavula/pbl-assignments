import java.util.Scanner;
class Calculator {
    public static int powerInt(int num1,int num2){
        return (int) Math.pow(num1,num2);
    }
    public static double powerDouble(double num1, double num2) {
        return Math.pow(num1, num2);
    }
}
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        double c =sc.nextDouble();
        double d=sc.nextDouble();
        System.out.println("Power = " + Calculator.powerInt(a,b));

        System.out.println("Power = " + Calculator.powerDouble(c,d));
        sc.close();
    }
}
