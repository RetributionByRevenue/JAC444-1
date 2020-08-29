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

public class SalariedEmployee extends Employee{
	private double weeklySalary;
	
	public SalariedEmployee() {
		
	}
	
	public SalariedEmployee(String first, String last, String ssn) {
		super(first, last, ssn);
		// TODO Auto-generated constructor stub
	}
	
	public SalariedEmployee(String first, String last, String ssn, double salary) {
		super(first, last, ssn);
		setWeeklySalary(salary);
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary <= 0) {
			throw new ArithmeticException("weekly salary cannot be less than or equal to 0");
		}
		else
			this.weeklySalary = weeklySalary;
	}
	
	public String toString() {
		return super.toString() + " has a weekly salary of " + getWeeklySalary();
	}

	@Override
	public double getPaymentAmount() {
		
		return getWeeklySalary();
	}
}
