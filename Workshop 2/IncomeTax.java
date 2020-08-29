/**********************************************
Workshop #2 Course:JAC444 -Semester 4
Last Name:Chan
First Name:Daryan
ID:113973192
Section:<section name>
This assignment represents my own work in accordance with Seneca Academic Policy.
Signature Daryan Chan
Date: 6/7/2020
**********************************************/

package workshop2;
import java.util.Scanner;
import java.text.DecimalFormat;

public class IncomeTax {
	
	public static final int SINGLE_FILER=0;
	public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW= 1;
	public static final int MARRIED_SEPARATELY = 2;
	public static final int HEAD_OF_HOUSEHOLD = 3;

	public static void main(String[] args) {
	
		new IncomeTax();

	}
	
	public IncomeTax() {
		System.out.print("1: Compute personal income tax");
		System.out.print("\n2: Print the tax tables for taxable incomes (with range)");
		System.out.print("\n3: Exit");
		System.out.print("\nEnter your option: ");
		Scanner input = new Scanner (System.in);			
		int option = input.nextInt();
		
		if (option == 1) {

			System.out.print("\nTax is: " + getIncomeTax());
		}
		if (option == 2) {
			System.out.print("\nEnter the amount from: ");
			double amountFrom = input.nextDouble();
			System.out.print("\nEnter the amount to: ");
			double amountTo = input.nextDouble();
			optionTwo(amountFrom, amountTo);
		}
		if (option == 3) {
			System.out.print("\nGood bye!");
		}	
		input.close();
	}
	
	
	public static double getIncomeTax() {
		double [] rates = new double[6];
		rates[0] = 0.10;
		rates[1] = 0.15;
		rates[2] = 0.25;
		rates[3] = 0.28;
		rates[4] = 0.33;
		rates[5] = 0.35;
		
		System.out.print("0 - single filer");
		System.out.print("\n1 - married jointly or qualifying widow(er)");
		System.out.print("\n2 - married separately");
		System.out.print("\n3 - head of the household");
		System.out.print("\nEnter the filling status: ");
		Scanner input1 = new Scanner (System.in);
		int status = input1.nextInt();
		double tax = 0.00;
		if (status==SINGLE_FILER) {
			System.out.print("Enter the Taxable Income: ");
			double income = input1.nextDouble();
			if (income > 0 && income <=8350) {
				tax = income * rates[0];
			}
			if (income >= 8351 && income <= 33950) {
				tax = income * rates[1];
			}
			if (income >= 33951 && income <= 82250) {
				tax = income * rates[2];
			}
			if (income >= 82251 && income <= 171550) {
				tax = income * rates[3];
			}
			if (income >= 171551 && income <= 372950) {
				tax = income * rates[4];
			}
			if (income >= 372951) {
				tax = income * rates[5];
			}
		}else if (status == MARRIED_JOINTLY_OR_QUALIFYING_WIDOW) {
			System.out.print("Enter the Taxable Income: ");
			double income1 = input1.nextDouble();
			if (income1 > 0 && income1 <=16700) {
				tax = income1 * rates[0];
			}
			if (income1 >=16701 && income1 <= 67900) {
				tax = income1 * rates[1];
			}
			if (income1 >=67901 && income1 <= 137050) {
				tax = income1 * rates[2];
			}
			if (income1 >= 137051 && income1 <= 208850) {
				tax = income1 * rates[3];
			}
			if (income1 >= 208851 && income1 <= 372950) {
				tax = income1 * rates[4];
			}
			if (income1 >= 372951) {
				tax = income1 * rates[5];
			}
		}else if (status == MARRIED_SEPARATELY) {
			System.out.print("Enter the Taxable Income: ");
			double income2 = input1.nextDouble();
			if (income2 > 0 && income2 <= 8350) {
				tax = income2 * rates[0];
			}
			if (income2 >= 8351 && income2 <= 33950) {
				tax = income2 * rates[1];
			}
			if (income2 >= 33951 && income2 <= 68525) {
				tax = income2 * rates[2];
			}
			if (income2 >= 68526 && income2 <= 104425) {
				tax = income2 * rates[3];
			}
			if (income2 >= 104426 && income2 <= 186475) {
				tax = income2 * rates[4];
			}
			if (income2 >= 186476) {
				tax = income2 * rates[5];
			}
		}else if (status == HEAD_OF_HOUSEHOLD) {
			System.out.print("Enter the Taxable Income: ");
			double income3 = input1.nextDouble();
			if (income3 > 0 && income3 <= 11950) {
				tax = income3 * rates[0];
			}
			if (income3 >= 11951 && income3 <= 45500) {
				tax = income3 * rates[1];
			}
			if (income3 >= 45501 && income3 <= 117450) {
				tax = income3 * rates[2];
			}
			if (income3 >= 117451 && income3 <= 190200) {
				tax = income3 * rates[3];
			}
			if (income3 >= 190201 && income3 <= 372950) {
				tax = income3 * rates[4];
			}
			if (income3 >= 372951) {
				tax = income3 * rates[5];
			}		
		}	
		return tax;
	}
	
	public static void optionTwo(double amountFrom, double amountTo) {
		int [][] intervals = new int [11][4];
		intervals [0][0] = 27050;
		intervals [0][1] = 45200;
		intervals [0][2] = 22600;
		intervals [0][3] = 36250;
		intervals [1][0] = 65550;
		intervals [1][1] = 109250;
		intervals [1][2] = 54625;
		intervals [1][3] = 93650;
		intervals [2][0] = 136750;
		intervals [2][1] = 166500;
		intervals [2][2] = 54625;
		intervals [2][3] = 93650;
		intervals [3][0] = 297350;
		intervals [3][1] = 297350;
		intervals [3][2] = 148675;
		intervals [3][3] = 297350;
		intervals [4][0] = 297351;
		intervals [4][1] = 297351;
		intervals [4][2] = 148676;
		intervals [4][3] = 297351;
		intervals [5][0] = 8350;
		intervals [5][1] = 16700;
		intervals [5][2] = 8350;
		intervals [5][3] = 11950;
		intervals [6][0] = 33950;
		intervals [6][1] = 67900;
		intervals [6][2] = 33950;
		intervals [6][3] = 45500;
		intervals [7][0] = 82250;
		intervals [7][1] = 137050;
		intervals [7][2] = 68525;
		intervals [7][3] = 117250;
		intervals [8][0] = 171550;
		intervals [8][1] = 208850;
		intervals [8][2] = 104425;
		intervals [8][3] = 190200;
		intervals [9][0] = 372950;
		intervals [9][1] = 372950;
		intervals [9][2] = 186475;
		intervals [9][3] = 372950;
		intervals [10][0] = 372951;
		intervals [10][1] = 372951;
		intervals [10][2] = 186476;
		intervals [10][3] = 372951;
		
		double[] taxRate = {0.15, 0.275, 0.305, 0.355, 0.391, 0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
		
		//2001 taxes
		int rows = ((int)(amountTo - amountFrom)/1000)+1;
		double [] singleAmount2001 = new double [rows];
		double [] singleAmountTax2001 = new double [rows];
		double [] marriedOrWidowAmount2001 = new double [rows];
		double[] marriedOrWidowAmountTax2001 = new double [rows];
		double[] marriedSeparateAmount2001 = new double [rows];
		double[] marriedSeparateAmountTax2001 = new double [rows];
		double [] householdAmount2001 = new double [rows];
		double [] householdAmountTax2001 = new double [rows];
		
		for (int i = 0; i < rows; i++) {
			singleAmount2001[i] = amountFrom + i*1000;
			if (singleAmount2001[i] <= intervals [0][0] ) {
				singleAmountTax2001[i] = singleAmount2001[i] * taxRate[0];
			}
			if (singleAmount2001[i] > intervals[0][0] && singleAmount2001[i] <= intervals[1][0]) {
				singleAmountTax2001[i] = singleAmount2001[i] * taxRate[1];
			}
			if (singleAmount2001[i] > intervals[1][0] && singleAmount2001[i] <= intervals[2][0]) {
				singleAmountTax2001[i] = singleAmount2001[i] * taxRate[2];
			}
			if (singleAmount2001[i] > intervals[2][0] && singleAmount2001[i] <= intervals[3][0]) {
				singleAmountTax2001[i] = singleAmount2001[i] * taxRate[3];
			}
			if (singleAmount2001[i] >= intervals[4][0]) {
				singleAmountTax2001[i] = singleAmount2001[i] * taxRate[4];
			}
		}
		
		for (int i = 0; i < rows; i++) {
			marriedOrWidowAmount2001[i] = amountFrom + i*1000;
			if (marriedOrWidowAmount2001[i] <= intervals[0][1]) {
				marriedOrWidowAmountTax2001[i] = marriedOrWidowAmount2001[i] * taxRate[0];
			}
			if (marriedOrWidowAmount2001[i] > intervals[0][1] && marriedOrWidowAmount2001[i] <= intervals[1][1]) {
				marriedOrWidowAmountTax2001[i] = marriedOrWidowAmount2001[i] * taxRate[1];
			}
			if (marriedOrWidowAmount2001[i] > intervals[1][1] && marriedOrWidowAmount2001[i] <= intervals[2][1]) {
				marriedOrWidowAmountTax2001[i] = marriedOrWidowAmount2001[i] * taxRate[2];
			}
			if (marriedOrWidowAmount2001[i] > intervals[2][1] && marriedOrWidowAmount2001[i] <= intervals[3][1]) {
				marriedOrWidowAmountTax2001[i] = marriedOrWidowAmount2001[i] * taxRate[3];
			}
			if (marriedOrWidowAmount2001[i] >= intervals[4][1]) {
				marriedOrWidowAmountTax2001[i] = marriedOrWidowAmount2001[i] * taxRate[4];
			}
		}
		
		for (int i = 0; i < rows; i++) {
			marriedSeparateAmount2001[i] = amountFrom + i*1000;
			if (marriedSeparateAmount2001[i] <= intervals [0][2]) {
				marriedSeparateAmountTax2001[i] = marriedSeparateAmount2001[i] * taxRate[0];
			}
			if (marriedSeparateAmount2001[i] > intervals [0][2] && marriedSeparateAmount2001[i] <= intervals [1][2]) {
				marriedSeparateAmountTax2001[i] = marriedSeparateAmount2001[i] * taxRate[1];
			}
			if (marriedSeparateAmount2001[i] > intervals [1][2] && marriedSeparateAmount2001[i] <= intervals [2][2]) {
				marriedSeparateAmountTax2001[i] = marriedSeparateAmount2001[i] * taxRate[2];
			}
			if (marriedSeparateAmount2001[i] > intervals [2][2] && marriedSeparateAmount2001[i] <= intervals [3][2]) {
				marriedSeparateAmountTax2001[i] = marriedSeparateAmount2001[i] * taxRate[3];
			}
			if (marriedSeparateAmount2001[i] >= intervals [4][2]) {
				marriedSeparateAmountTax2001[i] = marriedSeparateAmount2001[i] * taxRate[4];
			}
		}
		
		for (int i = 0; i < rows; i++) {
			householdAmount2001[i] = amountFrom + i*1000;
			if (householdAmount2001[i] <= intervals [0][3]) {
				householdAmountTax2001[i] = householdAmount2001[i] * taxRate[0];
			}
			if (householdAmount2001[i] > intervals [0][3] && householdAmount2001[i] <= intervals [1][3]) {
				householdAmountTax2001[i] = householdAmount2001[i] * taxRate[1];
			}
			if (householdAmount2001[i] > intervals [1][3] && householdAmount2001[i] <= intervals [2][3]) {
				householdAmountTax2001[i] = householdAmount2001[i] * taxRate[2];
			}
			if (householdAmount2001[i] > intervals [2][3] && householdAmount2001[i] <= intervals [3][3]) {
				householdAmountTax2001[i] = householdAmount2001[i] * taxRate[3];
			}
			if (householdAmount2001[i] >= intervals [4][3]) {
				householdAmountTax2001[i] = householdAmount2001[i] * taxRate[4];
			}
		}
		
		// 2019 taxes
		double [] singleAmount2009 = new double [rows];
		double [] singleAmountTax2009 = new double [rows];
		double [] marriedOrWidowAmount2009 = new double [rows];
		double[] marriedOrWidowAmountTax2009 = new double [rows];
		double[] marriedSeparateAmount2009 = new double [rows];
		double[] marriedSeparateAmountTax2009 = new double [rows];
		double [] householdAmount2009 = new double [rows];
		double [] householdAmountTax2009 = new double [rows];
		
		for (int i = 0; i < rows; i++) {
			singleAmount2009[i] = amountFrom + i*1000;
			if (singleAmount2009[i] <= intervals [5][0] ) {
				singleAmountTax2009[i] = singleAmount2009[i] * taxRate[5];
			}
			if (singleAmount2009[i] > intervals[5][0] && singleAmount2009[i] <= intervals[6][0]) {
				singleAmountTax2009[i] = singleAmount2009[i] * taxRate[6];
			}
			if (singleAmount2009[i] > intervals[6][0] && singleAmount2009[i] <= intervals[7][0]) {
				singleAmountTax2009[i] = singleAmount2009[i] * taxRate[7];
			}
			if (singleAmount2009[i] > intervals[7][0] && singleAmount2009[i] <= intervals[8][0]) {
				singleAmountTax2009[i] = singleAmount2009[i] * taxRate[8];
			}
			if (singleAmount2009[i] > intervals[8][0] && singleAmount2009[i] <= intervals[9][0]) {
				singleAmountTax2009[i] = singleAmount2009[i] * taxRate[9];
			}
			if (singleAmount2009[i] >= intervals[10][0]) {
				singleAmountTax2009[i] = singleAmount2009[i] * taxRate[10];
			}
		}
		
		for (int i = 0; i < rows; i++) {
			marriedOrWidowAmount2009[i] = amountFrom + i*1000;
			if (marriedOrWidowAmount2009[i] <= intervals [5][0] ) {
				marriedOrWidowAmountTax2009[i] = marriedOrWidowAmount2009[i] * taxRate[5];
			}
			if (marriedOrWidowAmount2009[i] > intervals[5][0] && marriedOrWidowAmount2009[i] <= intervals[6][0]) {
				marriedOrWidowAmountTax2009[i] = marriedOrWidowAmount2009[i] * taxRate[6];
			}
			if (marriedOrWidowAmount2009[i] > intervals[6][0] && marriedOrWidowAmount2009[i] <= intervals[7][0]) {
				marriedOrWidowAmountTax2009[i] = marriedOrWidowAmount2009[i] * taxRate[7];
			}
			if (marriedOrWidowAmount2009[i] > intervals[7][0] && marriedOrWidowAmount2009[i] <= intervals[8][0]) {
				marriedOrWidowAmountTax2009[i] = marriedOrWidowAmount2009[i] * taxRate[8];
			}
			if (marriedOrWidowAmount2009[i] > intervals[8][0] && marriedOrWidowAmount2009[i] <= intervals[9][0]) {
				marriedOrWidowAmountTax2009[i] = marriedOrWidowAmount2009[i] * taxRate[9];
			}
			if (marriedOrWidowAmount2009[i] >= intervals[10][0]) {
				marriedOrWidowAmountTax2009[i] = marriedOrWidowAmount2009[i] * taxRate[10];
			}
		}
		
		for (int i = 0; i < rows; i++) {
			marriedSeparateAmount2009[i] = amountFrom + i*1000;
			if (marriedSeparateAmount2009[i] <= intervals [5][0] ) {
				marriedSeparateAmountTax2009[i] = marriedSeparateAmount2009[i] * taxRate[5];
			}
			if (marriedSeparateAmount2009[i] > intervals[5][0] && marriedSeparateAmount2009[i] <= intervals[6][0]) {
				marriedSeparateAmountTax2009[i] = marriedSeparateAmount2009[i] * taxRate[6];
			}
			if (marriedSeparateAmount2009[i] > intervals[6][0] && marriedSeparateAmount2009[i] <= intervals[7][0]) {
				marriedSeparateAmountTax2009[i] = marriedSeparateAmount2009[i] * taxRate[7];
			}
			if (marriedSeparateAmount2009[i] > intervals[7][0] && marriedSeparateAmount2009[i] <= intervals[8][0]) {
				marriedSeparateAmountTax2009[i] = marriedSeparateAmount2009[i] * taxRate[8];
			}
			if (marriedSeparateAmount2009[i] > intervals[8][0] && marriedSeparateAmount2009[i] <= intervals[9][0]) {
				marriedSeparateAmountTax2009[i] = marriedSeparateAmount2009[i] * taxRate[9];
			}
			if (marriedSeparateAmount2009[i] >= intervals[10][0]) {
				marriedSeparateAmountTax2009[i] = marriedSeparateAmount2009[i] * taxRate[10];
			}
		}
		
		for (int i = 0; i < rows; i++) {
			householdAmount2009[i] = amountFrom + i*1000;
			if (householdAmount2009[i] <= intervals [5][0] ) {
				householdAmountTax2009[i] = householdAmount2009[i] * taxRate[5];
			}
			if (householdAmount2009[i] > intervals[5][0] && householdAmount2009[i] <= intervals[6][0]) {
				householdAmountTax2009[i] = householdAmount2009[i] * taxRate[6];
			}
			if (householdAmount2009[i] > intervals[6][0] && householdAmount2009[i] <= intervals[7][0]) {
				householdAmountTax2009[i] = householdAmount2009[i] * taxRate[7];
			}
			if (householdAmount2009[i] > intervals[7][0] && householdAmount2009[i] <= intervals[8][0]) {
				householdAmountTax2009[i] = householdAmount2009[i] * taxRate[8];
			}
			if (householdAmount2009[i] > intervals[8][0] && householdAmount2009[i] <= intervals[9][0]) {
				householdAmountTax2009[i] = householdAmount2009[i] * taxRate[9];
			}
			if (householdAmount2009[i] >= intervals[10][0]) {
				householdAmountTax2009[i] = householdAmount2009[i] * taxRate[10];
			}
		}
		
		display2001(rows, amountFrom, amountTo, singleAmountTax2001, marriedOrWidowAmountTax2001, marriedSeparateAmountTax2001, householdAmountTax2001);
		display2009(rows, amountFrom, amountTo, singleAmountTax2009, marriedOrWidowAmountTax2009, marriedSeparateAmountTax2009, householdAmountTax2009);
	}
	
	public static void display2001(int rows, double amountFrom, double amountTo, double[] singleAmountTax2001, double[] marriedOrWidowAmountTax2001, double[] marriedSeparateAmountTax2001, double[] householdAmountTax2001) {
		
		System.out.print("2001 tax tables for taxable income from " + amountFrom + " to " + amountTo);
		System.out.print("\n--------------------------------------------------------------------------");
		System.out.print("\nTaxable        Single        Married Joint        Married        Head of");
		System.out.print("\nIncome                       or Qualifying        Separate       a house");
		System.out.print("\n                              Widow(er)");
		System.out.print("\n--------------------------------------------------------------------------\n");
		
		for (int i = 0; i < rows; i++) {
			System.out.print("\n");
			System.out.print(new DecimalFormat("0").format(amountFrom + i*1000) + "         " + new DecimalFormat("0.00").format(singleAmountTax2001[i]) + "          " + new DecimalFormat("0.00").format(marriedOrWidowAmountTax2001[i]) + "             " + new DecimalFormat("0.00").format(marriedSeparateAmountTax2001[i]) + "        " + new DecimalFormat("0.00").format(householdAmountTax2001[i]));
		}
	}
	
	public static void display2009(int rows, double amountFrom, double amountTo, double[] singleAmountTax2009, double[] marriedOrWidowAmountTax2009, double[] marriedSeparateAmountTax2009, double[] householdAmountTax2009) {
		
		System.out.print("\n\n");
		System.out.print("\n2009 tax tables for taxable income from " + amountFrom + " to " + amountTo);
		System.out.print("\n--------------------------------------------------------------------------");
		System.out.print("\nTaxable        Single        Married Joint        Married        Head of");
		System.out.print("\nIncome                       or Qualifying        Separate       a house");
		System.out.print("\n                              Widow(er)");
		System.out.print("\n--------------------------------------------------------------------------\n");
		
		for (int i = 0; i < rows; i++) {
			System.out.print("\n");
			System.out.print(new DecimalFormat("0").format(amountFrom + i*1000) + "        " + new DecimalFormat("0.00").format(singleAmountTax2009[i]) + "        " + new DecimalFormat("0.00").format(marriedOrWidowAmountTax2009[i]) + "             " + new DecimalFormat("0.00").format(marriedSeparateAmountTax2009[i]) + "        " + new DecimalFormat("0.00").format(householdAmountTax2009[i]));
		}
	}
	
}
