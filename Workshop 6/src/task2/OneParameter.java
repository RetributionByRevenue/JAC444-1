/**********************************************
Workshop # 6
Course:JAC444 -Semester 4
Last Name: Chan
First Name: Daryan
ID: 113973192
Section: NAA
This assignment represents my own work in accordance with Seneca Academic Policy.
Signature Daryan Chan
Date: July 12, 2020
**********************************************/

package task2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OneParameter implements ArrayProcessor{
	
//	static double[] values = new double[3];
//	 static double num1 = 0;
//	static double num2 = 0;
//	static double num3 = 0;
	
	public static void main(String[] args) {
		
	     List list = new ArrayList<>();

	        list.add("A");

	        list.add("B");

	        list.add("C");

	        list.add("D");

	        for (int i = 0; i < list.size(); i++){
	            System.out.print(list.remove(i));
	        }
	}
	
//		System.out.println("Enter 3 values: ");
//		Scanner input = new Scanner(System.in);
//		values[0] = input.nextDouble();
//		values[1] = input.nextDouble();
//		values[2] = input.nextDouble();
//		
//		num1 = values[0];
//		num2 = values[1];
//		num3 = values[2];
		
//		final ArrayProcessor func = (values) -> {
//			return values[0] + values[1] + values[2];
//		};
//		
//		final ArrayProcessor func1 = (values) -> {
//			return (values[0] + values[1] + values[2])/3;
//		};
//		
//		final ArrayProcessor func2 = (values) -> {
//
//			double lowest = 999999;
//			for (int i = 0; i < 3; i++) {
//				if (lowest > values[i]) {
//					lowest = values[i];
//				}				
//			}
//			return lowest;
//		};
//		
//		final ArrayProcessor func3 = (values) -> {
//
//			double highest = 0;
//			for (int i = 0; i < 3; i++) {
//				if (highest < values[i])
//					highest = values[i];
//			}
//			return highest;
//		};
//		
//		System.out.println("The sum of numbers: " + func.apply(values));
//		System.out.println("The average of numbers: " + func1.apply(values));
//		System.out.println("The maximum value of the array: " + func3.apply(values));
//		System.out.println("The minimum value of the array: " + func2.apply(values));
//		System.out.println("The number of times " + values[0] + " appears in the array is " + counter(values[0]));
//	}
//	
//	public static ArrayProcessor counter( double value ) {
//		double num = value;
//		final double[] Array = values;
//		final double n1 = num1;
//		final double n2 = num2;
//		final double n3 = num3;
//		
//		ArrayProcessor ap = (double[] array) -> {
//			
//			if (num == array[0]) counter++;
//			if (num == array[1]) counter++;
//			if (num == array[2]) counter++;
//			return counter;
//		};
//		return ap.apply(values);
//	}
//
//	@Override
//	public double apply(double[] array) {
//		return 0;
//	}
//	

}
