package com.qualizeal.javaapp02.operation;

public class TwoNonDecimalNumbersDivision{
	double result = 0;
	public double divide(int a, int b) {
		if(a < 0 || b < 0) {
			result = -1.0;
		}
		else if(a == 0 || b == 0)  {
			result = -2.0;
		}
		else {
		result = (double)a/b;
		}
	return result;
	}
}
		
	
	