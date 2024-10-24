package com.qualizeal.javaapp02.operation;

public class TwoNonDecimalNumbersDivision {

	double result = 0;

	public double divide(int num1,int num2) {

		if(num1 < 0 || num2 < 0) {

			result = -1.0;

		}

		else if(num1==0 || num2==0) {

			result = -2.0;

		}

		else{

			result = (double)num1 / num2;

		}

		return result;

	}

}