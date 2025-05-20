package lld.solid_principle.lsp.violated;

import lld.solid_principle.exception.WithdrawalNotAllowedException;

public abstract class Account {

    @SuppressWarnings("unused")
    void deposit(double amount) {
    }

    @SuppressWarnings("unused")
    void withdraw(double amount) throws WithdrawalNotAllowedException {
    }
}
