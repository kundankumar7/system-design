package lld.solid_principle.lsp.followed;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        WithdrawableAccount savingAccount = new SavingAccount();
        WithdrawableAccount currAccount = new CurrentAccount();
        DepositOnlyAccount fixedTermAccount = new FixedTermAccount();
        List<WithdrawableAccount> withdrawableAccounts = new ArrayList<>();
        List<DepositOnlyAccount> depositOnlyAccounts = new ArrayList<>();
        withdrawableAccounts.add(savingAccount);
        withdrawableAccounts.add(currAccount);
        depositOnlyAccounts.add(fixedTermAccount);

        BankClient client = new BankClient(withdrawableAccounts, depositOnlyAccounts);
        client.processTransaction();
    }
}
