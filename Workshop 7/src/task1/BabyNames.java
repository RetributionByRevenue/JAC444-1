/**********************************************
 Workshop #7 
 Course:JAC444 -Semester 4
 Last Name: Chan
 First Name: Daryan
 ID: 113973192 
 Section: NAA
 This assignment represents my own work in accordance with Seneca Academic Policy.
 Signature Daryan Chan
 Date: July 17, 2020
 **********************************************/

package task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class BabyNames {
	
	static AccessFile af = new AccessFile();
	
	public static void main(String[] args) {	
		getFileName();
		display();
		List<String> modifiedList = DeleteCommonNames(af.getMaleNames(), af.getFemaleNames());
		displayModifiedData(modifiedList);
	}
	
	//gets the filename from the user and copies the data from the textfile into a list
	public static void getFileName() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a file name for baby name ranking: ");
		String filename = input.nextLine();
		af.getData(filename);
	}
	
	//This function goes through and boy's and girl's list and see the common names they share
	public static List<String> CommonName() {
		List<String> common = new ArrayList<String>(af.getFemaleNames());
		common.retainAll(af.getMaleNames());
		return common;
	}

	//this function determines how many names are in common with each other from the boy's name list and girl's name list
	public static int numberOfNamesInCommon(List<String> list1, List<String> list2) {
		if (af.getMaleNames().isEmpty() || af.getFemaleNames().isEmpty()) {
			return 0;
		}else {
            Set<String> setCommon = new HashSet<String>();
            for (String s : list1) {
                // add the values of list1 to the set
                setCommon.add(s);
            }
            int common = 0;
            for (String s : list2) {
                if (setCommon.contains(s)) {
                    // if a value in list2 exists in the set, increase common
                    common++;
                    setCommon.remove(s);
                }
            }
            return common;
		}
	}
	
	//this function will take the maleNames and femaleNames lists and delete the shared names
	public static List<String> DeleteCommonNames(List<String> list1, List<String> list2) {
		List<String> union = new ArrayList<String>(list1);
		union.addAll(list2);
		List<String> intersection = new ArrayList<String>(list1);
		intersection.retainAll(list2);
		union.removeAll(intersection);
		return union;
	}
	
	//this function will reverse the maleNames and femaleNames list
	public static List<String> reverseOrder(List<String> list1){
		Collections.reverse(list1);
		return list1;
	}
	
	//displays the unaltered information back to the user
	public static void display() {
		System.out.println(numberOfNamesInCommon(af.getMaleNames(), af.getFemaleNames()) + " names used for both genders");
		System.out.println("They are " + CommonName()); //CommonName();
		System.out.println("The boy's names are: " + af.getMaleNames());
		System.out.println("The girl's names are: " + af.getFemaleNames());	
	}
	
	//displays modified data back to user
	public static void displayModifiedData(List<String> modifiedList) {
		System.out.println("The list of names after removing the duplicate names are: ");
		for (String s: modifiedList)
			System.out.println(s);
		System.out.println("The boy's list in reverse order: " + reverseOrder(af.getMaleNames()));
		System.out.println("The girl's list in reverse order: " + reverseOrder(af.getFemaleNames()));
	}
}
