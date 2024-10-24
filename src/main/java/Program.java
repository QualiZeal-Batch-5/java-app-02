package com.qualizeal.javaapp02.operation;
import com.qualizeal.javaapp02.operation.divide.TwoNonDecimalNumbersDivision;
public class Program {
	public static void main(String[] args){
		TwoNonDecimalNumbersDivision twoNonDecimalNumbersDivision = new TwoNonDecimalNumbersDivision();
		var result = twoNonDecimalNumbersDivision.divide(10,2);
		System.out.println(result);
	}
}