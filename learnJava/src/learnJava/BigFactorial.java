package learnJava;

import java.math.BigInteger;

public class BigFactorial {

	/*Factorial of 5 is 5 * 4 * 3 * 2 * 1= 120*/
	public static void main(String[] args) {
		
		int i = 100;
		BigInteger number = new BigInteger("1");
		BigInteger fact = new BigInteger("1");
		System.out.println(number + " " + fact);
		for (int c = 1 ;c<=i;c++)
		{
			fact = fact.multiply(number);
			System.out.println(fact);
			number = number.add(BigInteger.ONE);
			System.out.println(number);
		}
		
		

	}

}
