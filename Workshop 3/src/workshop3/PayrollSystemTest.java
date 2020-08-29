/**********************************************
Workshop #3
Course:JAC444 -Semester 4
Last Name:Chan
First Name:Daryan
ID:113973192 
Section: NAA
This assignment represents my own work in accordance with Seneca Academic Policy.
Signature Daryan Chan
Date:6/14/2020
**********************************************/

package workshop3;

public class PayrollSystemTest {

	public static void main(String[] args) {
		
		CommissionEmployee Emp1 = new CommissionEmployee("Affan", "Khan", "12345", 1000.50, 0.5);
		HourlyEmployee Emp2 = new HourlyEmployee("Roger", "Yu", "23456", 30, 40);
		SalariedEmployee Emp3 = new SalariedEmployee("Kasia", "Markiewicz", "34567", 50000.00);
		BasePlusCommissionEmployee Emp4 = new BasePlusCommissionEmployee("Darth", "Vader", "45678", 800.87, 0.3);
		
		//employee array
		Employee[] Emp = {Emp1, Emp2, Emp3, Emp4};
		
		Emp4.setBaseSalary(30000);
		
		System.out.println( "Employees processed individually:\n");
		System.out.printf("%s %s: $%,.2f\n\n", Emp1, " earned", Emp1.getPaymentAmount());
		System.out.printf("%s %s: $%,.2f\n\n", Emp2, " earned", Emp2.getPaymentAmount());
		System.out.printf("%s %s: $%,.2f\n\n", Emp3, " earned", Emp3.getPaymentAmount());
		System.out.printf("%s %s: $%,.2f\n\n", Emp4, " earned", Emp4.getPaymentAmount());
		
		for (int i = 0; i < Emp.length; i++) {
			System.out.println(Emp[i].toString());
			System.out.println("and has earned " + Emp[i].getPaymentAmount());
			
			if (Emp[i] instanceof CommissionEmployee) {
				System.out.println("This employee is a Commission Employee");
				 Emp1 = new CommissionEmployee();
			}
			if (Emp[i] instanceof HourlyEmployee) {
				System.out.println("This employee is a Hourly Employee");
				Emp2 = new HourlyEmployee();
			}
			if (Emp[i] instanceof SalariedEmployee) {
				System.out.println("This employee is a Salaried Employee");
				Emp3 = new SalariedEmployee();
			}
			if (Emp[i] instanceof BasePlusCommissionEmployee) {
				System.out.println("This employee is a Base Plus Commission Employee");
				Emp4 = new BasePlusCommissionEmployee();
			}
		}
		
		for (int i = 0; i < Emp.length; i++) {
			System.out.println("This object belongs to this class: " + Emp[i].getClass());
		}
	}
	

}
