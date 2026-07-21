

public class Return_LastDigit {

    public static int getLastDigit(int number) {
        return Math.abs(number % 10);
    }

    public static void main(String[] args) {

        int num1=197;
        int num2=-197;

        System.out.println("Last digit of " + num1 + " is " + getLastDigit(num1));
        System.out.println("Last digit of " + num2 + " is " + getLastDigit(num2));
    }
}