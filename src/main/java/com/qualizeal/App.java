package com.qualizeal.javaapp02;
 
import com.qualizeal.javaapp02.operation.TwoNonDecimalNumbersDivision;
public class App {
	public static void main(String[] args) {
		TwoNonDecimalNumbersDivision twoNonDecimalNumbersDivision = new TwoNonDecimalNumbersDivision();
		double result1 = twoNonDecimalNumbersDivision.divide(10,2);
		System.out.println(result1);
	}
}