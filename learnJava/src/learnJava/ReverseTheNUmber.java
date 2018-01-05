package learnJava;

public class ReverseTheNUmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 123;
		int reversenum = 0;

		int len = String.valueOf(num).length();

/*		for (int i = 0; i < len; i++) {
			reversenum = reversenum * 10;
			reversenum = reversenum + num % 10;
			num = num / 10;
		}*/
		
		while (num!=0) {
			reversenum = reversenum * 10;
			reversenum = reversenum + num % 10;
			
			num = num / 10;
			System.out.println(num);
		}

		System.out.println("Reverse of specified number is: " + reversenum);

	}

}
