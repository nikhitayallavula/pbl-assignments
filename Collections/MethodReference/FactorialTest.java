package Collections.MethodReference;

public class FactorialTest {

    public static void main(String[] args){

        Factorial f=new Factorial();

        FactorialInterface fi=f::factorial;

        System.out.println("Factorial = "+fi.calculate(5));
    }
}