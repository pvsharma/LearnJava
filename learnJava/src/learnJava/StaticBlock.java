package learnJava;

public class StaticBlock {

	/*
	 * Java programming language offers a block known as static which is
	 * executed before main method executes. Below is the simplest example to
	 * understand functioning of static block later we see a practical use of
	 * static block.
	 * 
	 * 
	 * Static block can be used to check conditions before execution of main
	 * begin, Suppose we have developed an application which runs only on
	 * Windows operating system then we need to check what operating system is
	 * installed on user machine. In our java code we check what operating
	 * system user is using if user is using operating system other than
	 * "Windows" then the program terminates.
	 *
	 */
	public static void main(String[] args) {
		System.out.println("Main method is executed.");
	}

	static {
		System.out.println("Static block is executed before main method.");
		String os = System.getenv("OS");
		if (os.equals("Windows_NT") != true) {
			System.exit(1);
		}
	}

}
