/**********************************************
 Workshop #8
 Course:JAC444 -Semester 4
 Last Name: Chan
 First Name: Daryan
 ID: 113973192 
 Section: NAA
 This assignment represents my own work in accordance with Seneca Academic Policy.
 Signature Daryan Chan
 Date: July 26, 2020
 **********************************************/


package task1;

public class Test {
	
	public static void main(String[] args) {
	
		
		//This will test the parallel method to see how long it will take to finish
		Thread t1 = new Thread(new ParallelMethod(2));
		Thread t2 = new Thread(new ParallelMethod());
		t1.start();
		t2.start();
		
		//This will test the sequential method to see how long it will take to finish 	
		SequentialMethod sm = new SequentialMethod(2);
		sm.start();
		SequentialMethod sm2 = new SequentialMethod();
		sm2.start();
	}
	

	


}
