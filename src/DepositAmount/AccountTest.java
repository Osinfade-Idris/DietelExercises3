package DepositAmount;// DepositAmount.AccountTest.Java
// Inputting and Outputting float numbers with DepositAmount.Account Objects
import DepositAmount.Account;

import java.util.Scanner;

public class AccountTest
{
    public static void main(String[] args)
    {
        Account account1 = new Account("Osinfade Idris", 50.00);
        Account account2 = new Account("Drizzle Biodun", -7.53);

        // Display initial balance of each object)
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());

        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());


        // create a scanner to obtain input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n:", depositAmount);
        account1.deposit(depositAmount); //add to account1's balance'


        // Display balance of each object
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());

        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());

        System.out.print("Enter Deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account2 balance%n%n:", depositAmount);
        account2.deposit(depositAmount); //add to account1's balance'

        // Display new balance of each object)
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());

        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());
    }
}
