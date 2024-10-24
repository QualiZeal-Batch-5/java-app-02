package com.qualizeal.javaapp01.operation;
import com.qualizeal.javaapp01.operation.divide.TwoNonDecimalNumbersDivision;
public class Program {
	public static void main(String[] args){
		TwoNonDecimalNumbersDivision twoNonDecimalNumbersDivision = new TwoNonDecimalNumbersDivision();
		var result = twoNonDecimalNumbersDivision.divide(10,2);
		System.out.println(result);
	}
}