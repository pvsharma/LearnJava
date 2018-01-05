package learnJava;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("PLease enter the number : ");
		Scanner sn = new Scanner(System.in);
		int j = sn.nextInt();
		
		for (int i = 1;i<=10;i++)
		{
			System.out.println(j+" * " + i + " = " + j*i);
		}

	}

}
