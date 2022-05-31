package EmployeeSalary;

import InvoiceInfo.Invoice;

public class EmployeeTest {
    public static void main(String[] args) {


        Employee Employee1=new Employee ("Justin", "Timberlake", 60000.00);
        Employee Employee2=new Employee ("Tory", "Lanez", 85000.00);


        // Display balance of each object
        System.out.printf("Payroll For %s %s  : $%.2f%n", Employee1.getFirstName(), Employee1.getLastName(), Employee1.getSalary());
        System.out.printf("Payroll For %s %s  : $%.2f%n", Employee2.getFirstName(), Employee2.getLastName(), Employee2.getSalary());

        double IncreasedSalary = 0;
        Employee1.getIncreasedSalary(IncreasedSalary);
        Employee2.getIncreasedSalary(IncreasedSalary);

        double YearlySalary = 0;
        Employee1.getYearlySalary(YearlySalary);
        Employee2.getYearlySalary(YearlySalary);

        System.out.printf("Employee %s %s  Increased Salary: %.2f, Yearly Salary %.2f%n", Employee1.getFirstName(), Employee1.getLastName(), Employee1.getIncreasedSalary(IncreasedSalary), Employee1.getYearlySalary(YearlySalary));
        System.out.printf("Employee %s %s  Increased Salary: %.2f, Yearly Salary %.2f%n", Employee2.getFirstName(), Employee2.getLastName(), Employee2.getIncreasedSalary(IncreasedSalary), Employee2.getYearlySalary(YearlySalary));
    }
}
