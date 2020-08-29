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

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class tester {

	public static void main(String[] args){
		ReadFile r = new ReadFile();
		r.openFile();
		r.readFile();
		r.closeFile();
	
		Scanner input = new Scanner(System.in);
		String Continue = "y";
		while (Continue.equals("y")) {
			r.randomize();
		    String text = r.gameWord();
			Play play = new Play(text);
			play.begin();
	        System.out.println("Do you want to guess another word? Enter y or n>");
	        Continue = input.next();
		}    
		System.out.println("Good bye!");	
	}
}

