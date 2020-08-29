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

public class HourlyEmployee extends Employee{
	private double wage;
	private double hours;
	
	public HourlyEmployee() {
		
	}
	
	public HourlyEmployee(String first, String last, String ssn) {
		super(first, last, ssn);
	}
	
	public HourlyEmployee(String first, String last, String ssn, double hourlyWage, double hoursWorked) {
		super(first, last, ssn);
		setWage(hourlyWage);
		setHours(hoursWorked);
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		if (wage <= 0)
			throw new ArithmeticException("Wage cannot be less or equal to 0");
		else 
			this.wage = wage;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		if (hours < 0.0 || hours > 168.0)
			throw new ArithmeticException("Hours cannot be below 0 or be above 168 hours");
		else 
			this.hours = hours;
	}
	
	public String toString() {
		return super.toString() + " has an hourly wage of " + getWage() + " and worked for " + getHours() + " hour";
	}

	@Override
	public double getPaymentAmount() {
		
		return getWage()*getHours();
	}

}
