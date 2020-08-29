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


package task1;

import java.util.Arrays;

public class SequentialMethod {
	static private final int rows = 2000;
	static private final int cols = 2000;
	private static long runTime;
	private static double matrix3[][] = new double [rows][cols];
	private static double matrix4[][] = new double [rows][cols];
	
	//Methods below will be used to calculate execution time for adding two 2000*2000 matrices using sequential method

	public SequentialMethod() {
		runTime = 0;
		int count = 0;
		for (int i = 0; i< matrix3.length; i++) {
			for (int j = 0; j< matrix3[i].length; j++) {
				count++;
				matrix3[i][j] = count;   //creating first matrix
				matrix4[i][j] = 2*count; //creating second matrix with values 2x greater than first matrix
			}
		}
	}
	
	public SequentialMethod(int increase) {
		runTime = 0;
		int count = 0;

		for (int i = 0; i< matrix3.length; i++) {
			for (int j = 0; j< matrix3[i].length; j++) {
				count++;
				matrix3[i][j] = count*increase;          //populating the first matrix
				matrix4[i][j] = 2*(count*increase);		 //populating second matrix with values 2x greater than first matrix
			}
		}
	}
	
	public void start() {
		System.out.println("Starting single threading");
		long startTime = System.nanoTime();								//gets start time before addition of the 2 matrices begin
		double[][] newMatrix = sequentialAddMatrix(matrix3, matrix4);	//gets back the sum of the two matrices
		long stopTime = System.nanoTime();								//records the time it takes for the execution to finish
		runTime = stopTime - startTime;
		display(newMatrix);		
	}
	
	private double[][] sequentialAddMatrix(double[][]a, double[][]b){
		double[][] result = new double[rows][cols];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				result[i][j] = a[i][j] + b[i][j];
			}
		}
		return result;
	}
	
	private void display(double[][] a) {
		System.out.println("The 2 matrices are finally added together");
//		for (double[] row: a) {
//			System.out.println(Arrays.toString(row));
//		}
		System.out.println("The execution time for adding the 2 matrices is: " + getRunTime());
	}
	
	private long getRunTime() {
		return runTime;
	}

}
