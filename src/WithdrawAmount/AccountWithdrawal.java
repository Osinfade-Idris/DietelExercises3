package WithdrawAmount;

import java.util.Scanner;
public class AccountWithdrawal {
    public static void main(String[] args)
    {
        Account account1 = new Account("Osinfade Idris", 50.00);
        Account account2 = new Account("Drizzle Biodun", 73.53);

        // Display initial balance of each object)
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());

        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

        // create a scanner to obtain input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Withdrawal amount for account1: ");
        double withdrawalAmount = input.nextDouble();
        System.out.printf("%nremoving %.2f from account1 balance%n%n:", withdrawalAmount);
        account1.withdraw(withdrawalAmount); //add to account1's balance'

        // Display balance of each object
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());

        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());

        System.out.print("Enter Withdrawal amount for account2: ");
        withdrawalAmount = input.nextDouble();
        System.out.printf("%nremoving %.2f from account2 balance%n%n:", withdrawalAmount);
        account2.withdraw(withdrawalAmount); //add to account1's balance'

        // Display new balance of each object)
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());

        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());
    }
}
