package task2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class Map {
	static private String m_name;
	static private String timeStamp;
	static private List<String> countries; //= Arrays.asList("Canada", "USA", "Mexico", "France", "England", "Poland", "Russia", "Japan", "Taiwan", "China", "South Korea", "Germany", "Sweden", "Spain", "Norway", "Belgium", "Ukraine", "Greece", "Australia", "Turkey", "India", "Denmark", "Czech Republic", "Netherlands","Indonesia");
	static private List<String> cities; //= Arrays.asList("Ottawa", "Washington", "Mexico City", "Paris", "London", "Warsaw", "Moscow", "Tokyo", "Taipei", "Beijing", "Souel", "Berlin", "Stockholm", "Madrid", "Oslo", "Brussells", "Kiev", "Athens", "Canberra", "Ankara", "New Delhi", "Copenhagen", "Prague", "Amsterdam", "Jarkarta");
	static Scanner input = new Scanner(System.in);
	public Map() {
		countries = Arrays.asList("Canada", "USA", "Mexico", "France", "England", "Poland", "Russia", "Japan", "Taiwan", "China", "South Korea", "Germany", "Sweden", "Spain", "Norway", "Belgium", "Ukraine", "Greece", "Australia", "Turkey", "India", "Denmark", "Czech Republic", "Netherlands","Indonesia");
		cities = Arrays.asList("Ottawa", "Washington", "Mexico City", "Paris", "London", "Warsaw", "Moscow", "Tokyo", "Taipei", "Beijing", "Souel", "Berlin", "Stockholm", "Madrid", "Oslo", "Brussells", "Kiev", "Athens", "Canberra", "Ankara", "New Delhi", "Copenhagen", "Prague", "Amsterdam", "Jarkarta");
		m_name = "";
		timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
	}
	
	public static void setLog(String name){
		m_name = name;
		timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
		start();
	}
	
	public static String getName() {
		return m_name;
	}
		
	public static String getCity(String country){
		int index = getCountryIndexPosition(country);
		if (index == -1) {
			System.out.println("Country isn't in database");
		}
		String requestedCityName = cities.get(index);
		return requestedCityName;	
	}

	public static int getCountryIndexPosition(String country){
		int position = 0;
		for (int i = 0; i < countries.size(); i++) {
			if (country.equals(countries.get(i))) {
				return position;
			}
			position++;
		}
		return -1;
	}
	
	public static void start() {
		System.out.println("Enter any button but (C) to end the program");
		String exit = input.next();
		if (exit.toString().contains("c") || exit.toString().contains("C")) {
			System.out.println("Do you want to log your visit? (Y) or (N) ");
			String choice = input.next();
			processChoice(choice);
		}
	}
	
	public static void processChoice(String choice) {		
		if (choice.toString().contains("Y") || choice.toString().contains("y")) {
			System.out.println("Enter name: ");
			String name = input.next();
			setLog(name);
		}	else if (choice.toString().contains("n") || choice.toString().contains("N")) {
			System.out.println("Which country's capital city do you want to see? ");
			String select = input.next();
			System.out.println(select + "'s capital city is " + getCity(select));
			start();
		}else {
			System.out.println("Please repeat");
			start();
		}	
	}
	
	public static void main(String[] args) {
		Map map = new Map();
		start();
		System.out.println("Good bye " + m_name + ", your sign in time was " + timeStamp);
		return;
	}

}
