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

public class Invoice implements Payable {

	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;
	
	public Invoice(String part, String description, int count, double price) {
		this.partNumber = part;
		this.partDescription = description;
		this.quantity = count;
		this.pricePerItem = price;
	}
	
	//might need public static 
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	
	public String getPartNumber() {
		return this.partNumber;
	}
	
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	
	public String getPartDescription() {
		return this.partDescription;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}
	
	public double getPricePerItem() {
		return this.pricePerItem;
	}
	
	public String toString() {
		return getPartNumber() + " " + getPartDescription() + " " + getQuantity() + " " + getPricePerItem();
	}
	
	@Override
	public double getPaymentAmount() {
		
		return (getQuantity() * getPricePerItem());
	}

	
}
