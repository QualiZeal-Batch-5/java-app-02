package com.qualizeal.javaapp02.operation;

public class TwoNonDecimalNumbersDivision {
	public double divide(int num1, int num2) {
		double result = 0;
		
		if(num1 == 0 || num2 == 0) 
			return -2.0;
		else if(num1 < 0 || num2 < 0) 
			return -1.0;
		else {
			result = (double) num1 / num2;
			return result;
		}
	}
}