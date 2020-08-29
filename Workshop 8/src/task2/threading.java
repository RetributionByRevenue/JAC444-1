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

package task2;

public class threading {

	public static void main(String[] args) {

		Thread thread = new Thread(new reverseThread(1));

		thread.start();

	}

}
