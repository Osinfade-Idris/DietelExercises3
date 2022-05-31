package InvoiceInfo;

import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {


        Invoice invoice1=new Invoice ("1", "Book", 5, 250.00);
        Invoice invoice2=new Invoice ("2", "Pen", 4, 490.00);


        // Display balance of each object
        System.out.printf("Invoice%s %s (%d) : $%.2f%n", invoice1.getNumber(), invoice1.getDescription(), invoice1.getQuantity(),
                invoice1.getPrice());
        System.out.printf("Invoice%s %s (%d) : $%.2f%n", invoice2.getNumber(), invoice2.getDescription(), invoice2.getQuantity(),
                invoice2.getPrice());

        double InvoiceAmount = 0;
        invoice1.getInvoiceAmount(InvoiceAmount);
        invoice2.getInvoiceAmount(InvoiceAmount);

        System.out.printf("Invoice Balance %s %s (%d) : %.2f%n", invoice1.getNumber(), invoice1.getDescription(), invoice1.getInvoiceAmount(InvoiceAmount));
        System.out.printf("Invoice Balance %s %s (%d) : %.2f%n", invoice2.getNumber(), invoice2.getDescription(), invoice2.getInvoiceAmount(InvoiceAmount));
 }
}
