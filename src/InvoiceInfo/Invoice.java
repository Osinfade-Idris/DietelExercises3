package InvoiceInfo;

public class Invoice {
    private String number;
    private String description;
    private int quantity;
    private double price;



    public Invoice (String number, String description, int quantity, double price){

        this.number=number;
        this.description=description;
        this.quantity=quantity;
        this.price=price;
        if (price < 0.0) // if the price is valid
        {
            this.price=0.0;
        }

        if (quantity < 0.0) // if the price is valid
        {
            this.quantity=0;
        }

    }

    //method invoice amount
    public double getInvoiceAmount(double InvoiceAmount)
    {

            InvoiceAmount = price * quantity; //multiply the quantity by the price

            return InvoiceAmount;
    }

    //method to return the number
    public String getNumber()
    {
        return number;
    }

    //method to return the description
    public String getDescription()
    {
        return description;
    }

    //method to return the quantity
    public int getQuantity()
    {
        return quantity;
    }

    //method to return the price
    public double getPrice()
    {
        return price;
    }


}
