package com.qualizeal.javaapp02;
import com.qualizeal.javaapp02.operation.TwoNonDecimalNumbersDivision;
public class App {
	public static void main(String[] args) {
		TwoNonDecimalNumbersDivision twoNonDecimalNumbersDivision = new TwoNonDecimalNumbersDivision();
		double result1 = twoNonDecimalNumbersDivision.divide(10,3);
		System.out.println(result1);
		double result2 = twoNonDecimalNumbersDivision.divide(10,4);
		System.out.println(result2);

	}
}