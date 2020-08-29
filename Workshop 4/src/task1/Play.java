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
import java.util.Scanner;

public class Play {
	boolean isCorrect;
	int wordLength = 0;
	String randomWord = "";
	
	public Play() {
		
	}
	
	public Play(String text) {
		this.randomWord = text;
	}
	
	public String getHiddenWord(String text) {
		String hidden = "";
		for (int i = 0; i < text.length(); i++) {
			hidden += '*';
		}		
		return hidden;
	}
	
	public  void begin() {
		Scanner input = new Scanner(System.in);
	       
	    String hiddenWord = getHiddenWord(randomWord);
	    int count = 0;
	    while (!randomWord.equals(hiddenWord)) {
	
	        System.out.print("(Guess) Enter a letter in word " + hiddenWord + " > ");
	        char ch = input.next().charAt(0);
	
	        if (!isAlreadyInWord(hiddenWord, ch)) {
	
	            hiddenWord = getGuess(randomWord, hiddenWord, ch);
	
	            if (!isCorrect) {
	                System.out.println(ch + " is not in the word.");
	                count++;
	            }
	        } else {
	            System.out.println(ch + " is already in word.");
	        }
	    }
	    System.out.println("The word is '" +  hiddenWord + "'. You missed " + count + " time(s).");
	}
	    
	public  boolean isAlreadyInWord(String hiddenWord, char ch) {

        for (int i = 0; i < hiddenWord.length(); i++) {
	        if (ch == hiddenWord.charAt(i)) {
	            return true;
	        }
	    }
	    return false;
	}
	
    public String getGuess(String word, String hiddenWord, char ch) {
        isCorrect = false;
        StringBuilder s = new StringBuilder(hiddenWord);
      
        for (int i = 0; i < word.length(); i++) {
            if (ch == word.charAt(i) && s.charAt(i) == '*') {
                isCorrect = true;
                s = s.deleteCharAt(i);
                s = s.insert(i, ch);
            }
        }
        return s.toString();
    }	
}
