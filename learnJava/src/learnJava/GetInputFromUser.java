package learnJava;

import java.util.Scanner;

public class GetInputFromUser {
	
/*	Here Scanner is the class name, a is the name of object, new keyword is used to allocate the memory and System.in is the input stream. Following methods of Scanner class are used in the program below :-
	1) nextInt to input an integer
	2) nextFloat to input a float
	3) nextLine to input a string
*/
	public static void main(String[] args) {
		int a;
		float b;
		String s;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter a string");
		s = in.nextLine();
		System.out.println("You entered string " + s);

		System.out.println("Enter an integer");
		a = in.nextInt();
		System.out.println("You entered integer " + a);

		System.out.println("Enter a float");
		b = in.nextFloat();
		System.out.println("You entered float " + b);

	}

}
