package com.qualizeal.javaapp02;
import com.qualizeal.javaapp02.operation.TwoNonDecimalNumbersDivision;

public class App {
	public static void main(String[] args) {
       TwoNonDecimalNumbersDivision twoNonDecimalNumbersDivision = new TwoNonDecimalNumbersDivision();
       double result1 =  twoNonDecimalNumbersDivision.divide(200,10);
       System.out.println(result1);
       double result2 =  twoNonDecimalNumbersDivision.divide(10,3);
       System.out.println(result2);
       double result3 =  twoNonDecimalNumbersDivision.divide(2,10);
       System.out.println(result3);



	}
}