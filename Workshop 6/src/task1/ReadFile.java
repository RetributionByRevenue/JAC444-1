///**********************************************
//Workshop # 6
//Course:JAC444 -Semester 4
//Last Name: Chan
//First Name: Daryan
//ID: 113973192
//Section: NAA
//This assignment represents my own work in accordance with Seneca Academic Policy.
//Signature Daryan Chan
//Date: July 12, 2020
//**********************************************/
//
//package task1;
//
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.util.Scanner;
//
//public class ReadFile {
//	
//	BabyNamesRanking bnr = new BabyNamesRanking();
//	
//	public void copyData() {
//		try (Scanner s1 = new Scanner(new FileReader("babynamesranking2009.txt"))) {
//		    while (s1.hasNext()) {
//		        bnr.babynames2009.add(s1.nextLine());
//		    }
//		    System.out.println(bnr.babynames2009);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		
//		try (Scanner s2 = new Scanner(new FileReader("babynamesranking2010.txt"))) {
//		    while (s2.hasNext()) {
//		        bnr.babynames2010.add(s2.nextLine());
//		    }
//		    System.out.println(bnr.babynames2010);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		
//		try (Scanner s3 = new Scanner(new FileReader("babynamesranking2011.txt"))) {
//		    while (s3.hasNext()) {
//		        bnr.babynames2011.add(s3.nextLine());
//		    }
//		    System.out.println(bnr.babynames2011);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		
//		try (Scanner s4 = new Scanner(new FileReader("babynamesranking2012.txt"))) {
//		    while (s4.hasNext()) {
//		        bnr.babynames2012.add(s4.nextLine());
//		    }
//		    System.out.println(bnr.babynames2012);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		
//		try (Scanner s5 = new Scanner(new FileReader("babynamesranking2013.txt"))) {
//		    while (s5.hasNext()) {
//		        bnr.babynames2013.add(s5.nextLine());
//		    }
//		    System.out.println(bnr.babynames2013);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		
//		try (Scanner s6 = new Scanner(new FileReader("babynamesranking2014.txt"))) {
//		    while (s6.hasNext()) {
//		        bnr.babynames2014.add(s6.nextLine());
//		    }
//		    System.out.println(bnr.babynames2014);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		
//		try (Scanner s7 = new Scanner(new FileReader("babynamesranking2015.txt"))) {
//		    while (s7.hasNext()) {
//		        bnr.babynames2015.add(s7.nextLine());
//		    }
//		    System.out.println(bnr.babynames2015);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		
//		try (Scanner s8 = new Scanner(new FileReader("babynamesranking2016.txt"))) {
//		    while (s8.hasNext()) {
//		        bnr.babynames2016.add(s8.nextLine());
//		    }
//		    System.out.println(bnr.babynames2016);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		
//		try (Scanner s9 = new Scanner(new FileReader("babynamesranking2017.txt"))) {
//		    while (s9.hasNext()) {
//		        bnr.babynames2017.add(s9.nextLine());
//		    }
//		    System.out.println(bnr.babynames2017);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		
//		try (Scanner s10 = new Scanner(new FileReader("babynamesranking2018.txt"))) {
//		    while (s10.hasNext()) {
//		        bnr.babynames2018.add(s10.nextLine());
//		    }
//		    System.out.println(bnr.babynames2018);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//	}
//}
