public class Main8 {

    public static void main(String[] args) {

        // Lambda for addition
        Test8 t1 = (a, b, c) -> a + b + c;

        // Lambda for multiplication
        Test8 t2 = (a, b, c) -> a * b * c;

        int x = 10;
        int y = 20;
        int z = 30;

        System.out.println("Addition = " + t1.myFunction(x, y, z));
        System.out.println("Multiplication = " + t2.myFunction(x, y, z));
    }
}