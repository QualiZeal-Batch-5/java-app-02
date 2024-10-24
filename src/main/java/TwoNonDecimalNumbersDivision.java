package com.qualizeal.javaapp02.operation.divide;

public class TwoNonDecimalNumbersDivision {
	public long divide(int num1, int num2) {
		var result = 0;
		if (num1 < 0 || num2 < 0) {
			result = -1;
		}
		if (num1 == 0 || num2 == 0) {
			result = -2;
		}
		else {
			result = num1 / num2;
		}
	return result;
	}
}
