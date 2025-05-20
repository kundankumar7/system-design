package lld.solid_principle.lsp.violated;

import java.util.List;
import lld.solid_principle.exception.WithdrawalNotAllowedException;

public class BankClient {
    @SuppressWarnings("unused")
    List<Account> accounts;

    public BankClient(List<Account> accounts) {
        this.accounts = accounts;
    }

    @SuppressWarnings("unused")
    void processTransaction(){
        for(Account acc : accounts){
            acc.deposit(1000);

            try{
                acc.withdraw(500);
            } catch (WithdrawalNotAllowedException e){
                System.out.println("Operation failed: " + e.getMessage());
            }
        }
    }

    @SuppressWarnings("unused")
    void processTransaction2(){
        for(Account acc : accounts){
            acc.deposit(1000);

            // Checking account type explicitly
            if(acc instanceof FixedTermAccount){
                System.out.println("Skipping withdrawal for Fixed Term account...");
            }
            else{
                try{
                    acc.withdraw(500);
                } catch (WithdrawalNotAllowedException e){
                    System.out.println("Operation failed: " + e.getMessage());
                }
            }
        }
    }
}
