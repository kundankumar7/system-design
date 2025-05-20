package lld.solid_principle.lsp.violated;

import lld.solid_principle.exception.WithdrawalNotAllowedException;

public class FixedTermAccount extends Account {

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

    // Violates LSP
    @Override
    void withdraw(double amount) throws WithdrawalNotAllowedException {
        throw new WithdrawalNotAllowedException("Withdrawals is not allowed for Fixed Term account...");
    }
}
