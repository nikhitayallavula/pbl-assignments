package Collections.MethodReference;

public class DigitCountTest {

    public static void main(String[] args){

        DigitCountInterface dc=DigitCount::digitCount;

        System.out.println("Digits = "+dc.count(12345));
    }
}