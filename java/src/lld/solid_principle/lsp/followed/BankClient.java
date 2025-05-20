package lld.solid_principle.lsp.followed;

import java.util.List;

public class BankClient {

    @SuppressWarnings("unused")
    List<WithdrawableAccount> withdrawableAccounts;
    @SuppressWarnings("unused")
    List<DepositOnlyAccount> depositOnlyAccounts;

    public BankClient(List<WithdrawableAccount> withdrawableAccounts, List<DepositOnlyAccount> depositOnlyAccounts) {
        this.withdrawableAccounts = withdrawableAccounts;
        this.depositOnlyAccounts = depositOnlyAccounts;
    }

    @SuppressWarnings("unused")
    void processTransaction() {
        for (WithdrawableAccount withdrawableAccount : withdrawableAccounts) {
            withdrawableAccount.deposit(1000);

            try {
                withdrawableAccount.withdraw(500);
            } catch (Exception e) {
                System.out.println("Operation failed: " + e.getMessage());
            }
        }

        for (DepositOnlyAccount depositOnlyAccount : depositOnlyAccounts) {
            
            try {
                depositOnlyAccount.deposit(1000);
            } catch (Exception e) {
                System.out.println("Operation failed: " + e.getMessage());
            }
        }
    }
}
