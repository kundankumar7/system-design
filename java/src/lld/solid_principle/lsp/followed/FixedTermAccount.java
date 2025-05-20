package lld.solid_principle.lsp.followed;

public class FixedTermAccount extends DepositOnlyAccount {
    double balance;

    public FixedTermAccount() {
        this.balance = 0;
    }

    @Override
    void deposit(double amount) {
        this.balance += amount;
        System.out.println(
                "Deposited " + amount + " in Fixed Term Account. New balance : " + balance
        );
    }
}
