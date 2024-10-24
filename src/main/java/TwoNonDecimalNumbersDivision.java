package com.qualizeal.javaapp02.operation;
public class TwoNonDecimalNumbersDivision{
	public double divide(int num1,int num2){
		if(num1 < 0 || num2 < 0){
			return -1.0;
		}
		if(num1 == 0 || num2 == 0){
			return -2.0;
		}
		double result =  (double)num1/(double)num2;
		return result;
		
			
	}
}