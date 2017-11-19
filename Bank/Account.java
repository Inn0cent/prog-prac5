
/**
 * Write a description of class Account here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList;

public class Account
{
    
    private Person owner;
    private int accountNumber;
    private ArrayList<Transaction> transactions;
    
    public Account(Person newOwner, int newAccountNumber)
    {
        owner = newOwner;
        accountNumber = newAccountNumber;
        transactions = new ArrayList<Transaction>();
    }
    
    public void newTransaction(int amount, String typeOfTransaction){
        transactions.add(new Transaction(amount, typeOfTransaction));
    }
    
    public int getAccountNumber(){
        return accountNumber;
    }
    
    public void printDetails(){
        System.out.println("Surname: " + owner.getSurname());
        System.out.println("Firstname: " + owner.getFirstname());
        System.out.println("Job: " + owner.getJob());
        System.out.println("This person has made: " + transactions.size() + " transactions");
    }
    
    public void printTransactions(){
        for (Transaction trans : transactions){
            System.out.println("£" + trans.getAmount() + " was transferred at " + trans.getTime() + " on " + trans.getDate() +".");
            System.out.println("It was a " + trans.getType() + " transaction.");
            System.out.println();
        }
    }
}
