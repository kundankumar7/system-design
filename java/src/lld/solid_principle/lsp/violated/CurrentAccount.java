package lld.solid_principle.lsp.violated;

public class CurrentAccount extends Account {

    double balance;

    public CurrentAccount() {
        this.balance = 0;
    }

    @Override
    void deposit(double amount) {
        this.balance += amount;
        System.out.println(
                "Deposited " + amount + " in Current Account. New balance : " + balance
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
                "Withdrawn " + amount + " from Current Account. New balance : " + balance
        );
    }
}
