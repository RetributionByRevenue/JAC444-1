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

package task2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Counting {
	
	int numLines = 9;
    int counter = 0;
	private Scanner x;
	
	String[] words = new String[numLines];
	char[] lower = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    char[] upper = new char[] {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	int[] lowerctr = new int[26];
	int[] upperctr = new int[26];
    
    public static void main(String[] args) {
		
    	System.out.println("Enter a filename:");
    	Scanner inputScanner = new Scanner(System.in);
    	String filename = inputScanner.next();
		Counting c = new Counting();
		c.openFile(filename);	
	
	    c.readFile();
	    c.count();
		c.closeFile();
	}
	
	public void openFile(String filename) {
		try {
			x = new Scanner(new File(filename));
		
		}
		catch(IOException e) {
			System.out.println("Error");
		}
	}
	
	
	public void readFile() {

		while(x.hasNext()) {
			for (int i=0; i<numLines; i++) {
				words[i]=x.nextLine();
				//System.out.println(words[i]);
			}	
		}		
	}
	
	public void closeFile() {
		x.close();
	}
	
	
	 public void count() { 		 
		 for(int i = 0; i < numLines; i++) {
		
			//lowercase 
		    for(int l = 0; l < lower.length; l++) { 
		    	for(int j = 0; j < words[i].length(); j++ ) {
		     	    if(lower[l] == words[i].charAt(j)) { 
	             	lowerctr[l]++; 
	        	             
		     	    }
		    	}
		    } 
     
		  //uppercase 
		  for(int u = 0; u < upper.length; u++) { 
			  for (int n = 0; n < words[i].length(); n++) {		   
				   if(upper[u] == words[i].charAt(n)) { 
					   upperctr[u]++;			  
				   } 
			  }
		   } 
		}
		for (int p = 0; p < 26; p++) {
			 System.out.println(lower[p] + " : " + lowerctr[p]);
		} 
		for (int q = 0; q < 26; q++) {
			System.out.println(upper[q] + " : " + upperctr[q]);
		}
	}
}
