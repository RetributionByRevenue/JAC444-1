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

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccessFile {
	
	BabyNames bn = new BabyNames();

	List<Integer> nums1 = new ArrayList<Integer>();
	List<Integer> nums2 = new ArrayList<Integer>();
	
	private List<String> maleNames = new ArrayList<>();
	private List<String> femaleNames = new ArrayList<>();
	
	
	public void getData(String filename) {
		
		List<String> column2 = new ArrayList<String>();	
		List<String> column4 = new ArrayList<String>();
	
		if (filename.toString().contains("babynamesranking2009.txt")) {
			try (Scanner s1 = new Scanner(new FileReader("babynamesranking2009.txt"))) {
			    while (s1.hasNext()) {		    	
			    	nums1.add(s1.nextInt());
			    	column2.add(s1.next());
			    	nums2.add(s1.nextInt());
			    	column4.add(s1.next());		
			    	s1.next();
			    }
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			setMaleNames(column2);
			setFemaleNames(column4);
		}

		if (filename.toString().contains("babynamesranking2010.txt")) {
			try (Scanner s1 = new Scanner(new FileReader("babynamesranking2010.txt"))) {
			    while (s1.hasNext()) {		    	
			    	nums1.add(s1.nextInt());
			    	column2.add(s1.next());
			    	nums2.add(s1.nextInt());
			    	column4.add(s1.next());		
			    	s1.next();
			    }
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			setMaleNames(column2);
			setFemaleNames(column4);
		}

		if (filename.toString().contains("babynamesranking2011.txt")) {
			try (Scanner s1 = new Scanner(new FileReader("babynamesranking2011.txt"))) {
			    while (s1.hasNext()) {
			    	nums1.add(s1.nextInt());
			    	column2.add(s1.next());
			    	nums2.add(s1.nextInt());
			    	column4.add(s1.next());		
			    	s1.next();
			    }
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			setMaleNames(column2);
			setFemaleNames(column4);
		}
	
		if (filename.toString().contains("babynamesranking2012.txt")) {
			try (Scanner s1 = new Scanner(new FileReader("babynamesranking2012.txt"))) {
			    while (s1.hasNext()) {
			    	nums1.add(s1.nextInt());
			    	column2.add(s1.next());
			    	nums2.add(s1.nextInt());
			    	column4.add(s1.next());		
			    	s1.next();
			    }
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}	
			setMaleNames(column2);
			setFemaleNames(column4);
		}

		
		if (filename.toString().contains("babynamesranking2013.txt")) {
			try (Scanner s1 = new Scanner(new FileReader("babynamesranking2013.txt"))) {
			    while (s1.hasNext()) {
			    	nums1.add(s1.nextInt());
			    	column2.add(s1.next());
			    	nums2.add(s1.nextInt());
			    	column4.add(s1.next());		
			    	s1.next();
			    }
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			setMaleNames(column2);
			setFemaleNames(column4);
		}
			
		if (filename.toString().contains("babynamesranking2014.txt")) {
			try (Scanner s1 = new Scanner(new FileReader("babynamesranking2014.txt"))) {
			    while (s1.hasNext()) {
			    	nums1.add(s1.nextInt());
			    	column2.add(s1.next());
			    	nums2.add(s1.nextInt());
			    	column4.add(s1.next());		
			    	s1.next();
			    }
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			setMaleNames(column2);
			setFemaleNames(column4);
		}

		if (filename.toString().contains("babynamesranking2015.txt")) {
			try (Scanner s1 = new Scanner(new FileReader("babynamesranking2015.txt"))) {
			    while (s1.hasNext()) {
			    	nums1.add(s1.nextInt());
			    	column2.add(s1.next());
			    	nums2.add(s1.nextInt());
			    	column4.add(s1.next());		
			    	s1.next();
			    }
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			setMaleNames(column2);
			setFemaleNames(column4);
		}
	
		if (filename.toString().contains("babynamesranking2016.txt")) {
			try (Scanner s1 = new Scanner(new FileReader("babynamesranking2016.txt"))) {
			    while (s1.hasNext()) {
			    	nums1.add(s1.nextInt());
			    	column2.add(s1.next());
			    	nums2.add(s1.nextInt());
			    	column4.add(s1.next());		
			    	s1.next();
			    }
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			setMaleNames(column2);
			setFemaleNames(column4);
		}
	
		if (filename.toString().contains("babynamesranking2016.txt")) {
			try (Scanner s1 = new Scanner(new FileReader("babynamesranking2017.txt"))) {
			    while (s1.hasNext()) {
			    	nums1.add(s1.nextInt());
			    	column2.add(s1.next());
			    	nums2.add(s1.nextInt());
			    	column4.add(s1.next());		
			    	s1.next();
			    }
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			setMaleNames(column2);
			setFemaleNames(column4);
		}
	
		if (filename.toString().contains("babynamesranking2018.txt")) {
			try (Scanner s1 = new Scanner(new FileReader("babynamesranking2018.txt"))) {
			    while (s1.hasNext()) {
			    	nums1.add(s1.nextInt());
			    	column2.add(s1.next());
			    	nums2.add(s1.nextInt());
			    	column4.add(s1.next());		
			    	s1.next();
			    }
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			setMaleNames(column2);
			setFemaleNames(column4);
		}
	}
	
	public void setMaleNames(List<String> list1) {
		for (String s: list1)
			maleNames.add(s);
	}
	
	public void setFemaleNames(List<String> list1) {
		for (String s: list1)
			femaleNames.add(s);
	}
	
	public List<String> getMaleNames(){
		return maleNames;
	}
	
	public List<String> getFemaleNames(){
		return femaleNames;
	}
}
