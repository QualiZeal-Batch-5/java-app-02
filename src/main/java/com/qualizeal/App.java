package com.qualizeal.javaapp02;

import com.qualizeal.javaapp02.operation.TwoNonDecimalNumbersDivision;

public class App {
	public static void main(String[] args) {
		TwoNonDecimalNumbersDivision twoNonDecimalNumbersDivision = new TwoNonDecimalNumbersDivision();
		double answer1= 0;
		try{
			answer1 = twoNonDecimalNumbersDivision.divide(20,10);
			System.out.println(answer1);
		}catch(Exception e){
		}
		//double answer2 = twoNonDecimalNumbersDivision.divide(20,-10);
		//double answer3 = twoNonDecimalNumbersDivision.divide(0,10);
		//System.out.println(answer1);
	}
	
}