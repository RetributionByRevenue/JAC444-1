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

public class CommissionEmployee extends Employee{
	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee() {
		super();
	}

	public CommissionEmployee(String first, String last, String ssn) {
		super(first, last, ssn);
	}
	
	public CommissionEmployee(String first, String last, String SSN, double sales, double rate) {
		super(first, last, SSN);
		setGrossSales(sales);
		setCommissionRate(rate);
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		if (grossSales <= 0) {
			throw new ArithmeticException("Not Valid");
		}else {
			this.grossSales = grossSales;
		}	
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		if (commissionRate < 0.0 || commissionRate > 1.0) {
			throw new ArithmeticException("Not Valid");
		}else {
			this.commissionRate = commissionRate;
		}
	}
	
	public String toString() {
		return super.toString() + " has a gross sales of " + getGrossSales() + " and a commission rate of " + getCommissionRate();
	}

	@Override
	public double getPaymentAmount() {
		return getGrossSales()*getCommissionRate();
	}

}
