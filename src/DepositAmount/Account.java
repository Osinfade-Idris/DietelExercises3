package DepositAmount;////fig 3.1 DepositAmount.Account.Java
/// DepositAmount.Account class with a double instance variable balance and a constructor
// and deposit method that perform validation

public class Account
{
    private String name; // instance variable
    private double balance; // instance variable

    /// account constructors that receives 2 parameters
    public Account (String name, double balance)
    {
        this.name = name; /// assign name to instance variable name

        // validate that the balance is greater than 0.0; if not
        // instance variable keeps its default initial value of 0.0
        if (balance > 0.0) // if the balance is valid
            this.balance = balance; // assign it to instance variable
    }

    //method that deposits (adds) only a valid amount to the balance
    public void deposit(double depositAmount)
    {
        if (depositAmount > 0.0) // if the deposit amount is valid
            balance = balance + depositAmount; //add it to the balance
    }

    //method to return the balance
    public double getBalance()
    {
        return balance;
    }

    // method that sets the name
    public void setName(String name)
    {
        this.name = name;
    }

    // method that returns the name

    public String getName()
    {
        return name; //give the value of the name back to caller
    }
}