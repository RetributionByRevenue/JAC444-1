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
public class reverseThread implements Runnable{
	private int num;
	private int add;

	public reverseThread(int a) {
		this.setNum(a);
		this.setAdd(a);
	}

	@Override
	public void run() {
		if (getNum() != 51) {
			try {
				Thread t1 = new Thread(new Message(getAdd()));
				t1.start();
		
				display();
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	
	private void setAdd(int num) {
		this.add = getNum() + 1;
	}
	
	private int getAdd() {
		return add;
	}
	
	private void display() {
		System.out.println("Hello from thread " + getNum());

	}

	public int getNum() {
		return num;
	}

	private void setNum(int num) {
		this.num = num;
	}
	
}
