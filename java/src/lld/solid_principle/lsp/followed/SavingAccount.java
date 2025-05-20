package lld.solid_principle.lsp.followed;

public class SavingAccount extends WithdrawableAccount {
    double balance;

    public SavingAccount() {
        this.balance = 0;
    }

    @Override
    void deposit(double amount) {
        this.balance += amount;
        System.out.println(
                "Deposited " + amount + " in Saving Account. New balance : " + balance
        );
    }

    @Override
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient fund!");
            return;
        }

        balance -= amount;

        System.out.println(
                "Withdrawn " + amount + " from Saving Account. New balance : " + balance
        );
    }
}
