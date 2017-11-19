
/**
 * Write a description of class Bank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class Bank
{
    
    private ArrayList<Account> accounts;
    
    public Bank()
    {
        accounts = new ArrayList<Account>();
    }
    
    public void newAccount(Person newOwner, int newAccountNumber){
        accounts.add(new Account(newOwner, newAccountNumber));
    }
    
    public void newTransaction(int accountNumber, int amount, String typeOfTransaction){
        for (Account find : accounts){
            if (find.getAccountNumber() == accountNumber){
                find.newTransaction(amount, typeOfTransaction);
                break;
            }
        }
    }
    
    public void printAccountDetails(int accountNumber){
        for (Account find : accounts){
            if (find.getAccountNumber() == accountNumber){
                find.printDetails();
                break;
            }
        }
    }
    
    public void printTransactionDetails(int accountNumber){
        for (Account find : accounts){
            if (find.getAccountNumber() == accountNumber){
                find.printTransactions();
                break;
            }
        }
    }
}
