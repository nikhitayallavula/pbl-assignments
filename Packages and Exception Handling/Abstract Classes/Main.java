
abstract class GeneralBank{
    abstract double getSavingsInterestRate();
    abstract double getFixedDepositInterestRate();
}
class ICICIBank extends GeneralBank{
    @Override
    double getSavingsInterestRate(){
        return 4.0;
    }
    @Override
    double getFixedDepositInterestRate(){
        return 8.5;
    }
}
class KotMBank extends GeneralBank{
    @Override
    double getSavingsInterestRate(){
        return 6.0;
    }
    double getFixedDepositInterestRate(){
        return 9.0;
    }
}
public class Main{
    public static void main(String[] args) {
        ICICIBank i = new ICICIBank();
        System.out.println("ICICI Bank");
        System.out.println("Savings Interest Rate: " + i.getSavingsInterestRate() + "%");
        System.out.println("Fixed Deposit Interest Rate: " + i.getFixedDepositInterestRate() + "%");

        System.out.println();

        KotMBank k = new KotMBank();
         System.out.println("Kotak Mahindra Bank");
        System.out.println("Savings Interest Rate: " + k.getSavingsInterestRate() + "%");
        System.out.println("Fixed Deposit Interest Rate: " + k.getFixedDepositInterestRate() + "%");

        System.out.println();
        GeneralBank g1 = new KotMBank();
        System.out.println("GeneralBank Reference -> KotMBank");
        System.out.println("Savings Interest Rate: " + g1.getSavingsInterestRate() + "%");
        System.out.println("Fixed Deposit Interest Rate: " + g1.getFixedDepositInterestRate() + "%");

        System.out.println();

        GeneralBank g2 = new ICICIBank();
        System.out.println("GeneralBank Reference -> ICICIBank");
        System.out.println("Savings Interest Rate: " + g2.getSavingsInterestRate() + "%");
        System.out.println("Fixed Deposit Interest Rate: " + g2.getFixedDepositInterestRate() + "%");
    }
    }