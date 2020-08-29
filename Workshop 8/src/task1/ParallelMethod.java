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
import java.util.*;

public class ParallelMethod implements Runnable{
	private static final int rows = 2000;
	private static final int cols = 2000;
	private static long runTime;
	private static double matrix1[][] = new double [rows][cols];
	private static double matrix2[][] = new double [rows][cols];
	
	public ParallelMethod() {
		runTime = 0;
		int count = 0;
		for (int i = 0; i< matrix1.length; i++) {
			for (int j = 0; j< matrix1[i].length; j++) {
				count++;
				matrix1[i][j] = count;   //creating first matrix
				matrix2[i][j] = 2*count; //creating second matrix with values 2x greater than first matrix
			}
		}
	}
	
	public ParallelMethod(int increase) {
		runTime=0;
		int count = 0;

		for (int i = 0; i< matrix1.length; i++) {
			for (int j = 0; j< matrix1[i].length; j++) {
				count++;
				matrix1[i][j] = count*increase;      //creating first matrix
				matrix2[i][j] = 2*(count*increase);  //creating second matrix with values 2x greater than first matrix
			}
		}
	}
	
	public void run() {
		try {
			System.out.println("Starting Multi-threading");
			long startTime = System.nanoTime();						       //gets the start time before addition of two matrices begin
			double newMatrix[][] = parallelAddMatrix(matrix1, matrix2);    //gets the sum of the two matrices
			long stopTime = System.nanoTime();							   //gets the time when execution of the addition is finished
			runTime = stopTime - startTime;
			display();		
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	private static synchronized double[][] parallelAddMatrix(double[][] a, double[][] b){
		double[][] result = new double[rows][cols];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				result[i][j] = a[i][j] + b[i][j];
			}
		}
		return result;
	}
	
	private static void display() {
		System.out.println("The 2 matrices are finally added together");
		System.out.println("The execution time for adding the 2 matrices in multi-threading is: " + runTime);
	}
	

}
