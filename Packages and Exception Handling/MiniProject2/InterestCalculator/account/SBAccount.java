package account;

public class SBAccount extends Account {

    private String accountType;

    public SBAccount(double amount, String accountType) {
        this.amount = amount;
        this.accountType = accountType;
    }

    @Override
    public double calculateInterest() {

        if(accountType.equalsIgnoreCase("Normal")) {
            interestRate = 4;
        }
        else if(accountType.equalsIgnoreCase("NRI")) {
            interestRate = 6;
        }

        return (amount * interestRate) / 100;
    }
}