/**********************************************
Workshop # Course: JAC444 -Semester 4
Last Name: Chan
First Name: Daryan
ID: 113973192
Section: NAA
This assignment represents my own work in accordance with Seneca Academic Policy.
Signature
Date: 6/20/2020
**********************************************/
package task1;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;


public class ReadFile {
	
	private final int numLines = 10;
	private Scanner x;
	String[] words = new String[numLines];
	String randomWord = "";
	
	public void openFile() {
		try {
			x = new Scanner(new File("hangman.txt"));
		}
		catch(IOException e) {
			System.out.println("Error");
		}
	}
	
	public void readFile() {
		while(x.hasNext()) {
			for (int i = 0; i<numLines; i++) {
				words[i] = x.next();
			}
		}
	}
	
	public void closeFile() {
		x.close();
	}
	
	public void randomize() {
		Random random = new Random();
		int index = random.nextInt(words.length);
		randomWord = words[index];
	}
	
	public String gameWord() {
		return randomWord;
	}
}
