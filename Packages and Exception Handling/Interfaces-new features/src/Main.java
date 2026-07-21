public class Main {

    public static void main(String[] args) {

        // Hands-on 1
        Car car = new Car();
        car.message();

        System.out.println();

        // Hands-on 2
        Test t = (a, b, c) -> a + b + c;

        int result = t.myFunction(10, 20, 30);

        System.out.println("Sum = " + result);
    }
}