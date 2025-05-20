package lld.solid_principle.lsp.violated;

import java.util.ArrayList;
import java.util.List;
import lld.solid_principle.exception.WithdrawalNotAllowedException;

public class Main {
    public static void main(String[] args) throws WithdrawalNotAllowedException {
        Account savingAccount = new SavingAccount();
        Account currAccount = new CurrentAccount();
        Account fixedTermAccount = new FixedTermAccount();
        List<Account> accountList = new ArrayList<>();
        accountList.add(savingAccount);
        accountList.add(currAccount);
        accountList.add(fixedTermAccount);

        BankClient c1 = new BankClient(accountList);
        c1.processTransaction();
        c1.processTransaction2();
    }
}
