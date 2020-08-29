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

abstract class Employee implements Payable {

	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	public Employee() {
		
	}
	
	public Employee(String first, String last, String ssn) {
		this.firstName = first;
		this.lastName = last;
		this.socialSecurityNumber = ssn;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setSSN(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	public String getSSN() {
		return socialSecurityNumber;
	}
	
	public String toString() {
		return getFirstName() + " " + getLastName() + " " + getSSN();
	}


}
