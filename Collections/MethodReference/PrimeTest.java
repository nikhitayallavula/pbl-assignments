package Collections.MethodReference;

public class PrimeTest {

    public static void main(String[] args){

        PrimeInterface pi=PrimeCheck::new;

        pi.check(17);
        pi.check(20);
    }
}