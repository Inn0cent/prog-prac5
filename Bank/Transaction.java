
/**
 * Write a description of class Transaction here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Date;
public class Transaction
{
    
    private java.text.DateFormat dateFormat = new java.text.SimpleDateFormat("yyyy/MM/dd HH:mm");
    private java.text.DateFormat timeFormat = new java.text.SimpleDateFormat("HH:mm");
    private Date dateOfTransaction;
    private double moneyTransferred;
    private String typeOfTransaction;

    public Transaction(double amount, String type)
    {
        dateOfTransaction = new Date(); //Uses the current date and time for the transaciton
        moneyTransferred = amount;
        typeOfTransaction = type;
    }
    
    public String getDate(){
        return dateFormat.format(dateOfTransaction);
    }
    
    public String getTime(){
        return timeFormat.format(dateOfTransaction);
    }
    
    public double getAmount(){
        return moneyTransferred;
    }
    
    public String getType(){
        return typeOfTransaction;
    }
}
