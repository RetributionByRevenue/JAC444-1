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
public class Message implements Runnable{
	private int Num;
	private int add;
	
	public Message(int num) {
		this.setNum(num);
		this.setAdd();
	}
	
	private int getAdd() {
		return add;
	}
	
	private void setAdd() {
		this.add = getNum() + 1;
	}
	
	public int getNum() {
		return Num;
	}

	public void setNum(int num) {
		Num = num;
	}

	@Override
	public void run() {
		if (getNum() != 51) {
			try {
				Thread t2 = new Thread(new reverseThread(getAdd()));
				t2.start();			
				display();
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	
	public void display() {
		System.out.println("Hello from thread " + getNum());
		

	}
}
