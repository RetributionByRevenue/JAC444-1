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

public class BasePlusCommissionEmployee extends CommissionEmployee{
	
	private double baseSalary;
	
	public BasePlusCommissionEmployee() {
		
	}
	
	public BasePlusCommissionEmployee(String first, String last, String ssn) {
		super(first, last, ssn);
		// TODO Auto-generated constructor stub
	}

	public BasePlusCommissionEmployee(String first, String last, String SSN, double sales, double rate) {
		super(first, last, SSN, sales, rate);
		// TODO Auto-generated constructor stub
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if (baseSalary <= 0) {
			throw new ArithmeticException("Base salary cannot be 0 or lower");
		}
		else
			this.baseSalary = baseSalary;
	}

	public String toString() {
		return super.toString() + ". This employee has a base salary of " + getBaseSalary();
	}

	@Override
	public double getPaymentAmount() {
		
		return getBaseSalary();
	}

}
