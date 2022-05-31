package EmployeeSalary;

public class Employee {
    private String firstname;
    private String lastname;
    private double salary;

    public Employee (String firstname, String lastname, double salary){
        this.firstname=firstname;
        this.lastname=lastname;
        this.salary=salary;

        if (salary < 0.0) // if the price is valid
        {
            this.salary=0.0;
        }
    }

    public double getIncreasedSalary(double IncreasedSalary)
    {
        IncreasedSalary = salary + (salary * 0.1); //multiply the quantity by the price

        return IncreasedSalary;
    }

    public double getYearlySalary(double YearlySalary)
    {
        YearlySalary = salary * 12; //multiply the quantity by the price

        return YearlySalary;
    }

    //method to return the number
    public String getFirstName()
    {
        return firstname;
    }

    //method to return the description
    public String getLastName()
    {
        return lastname;
    }

    //method to return the price
    public double getSalary()
    {
        return salary;
    }
}
