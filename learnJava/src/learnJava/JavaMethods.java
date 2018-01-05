package learnJava;

public class JavaMethods {
/*	Syntax of methods
	"Access specifier" "Keyword(s)" "return type" methodName(List of arguments) {
	// Body of method
	}

	Access specifier can be public or private which decides whether other classes can call a method.
	Kewords are used for some special methods such as static or synchronized.
	Return type indicate return value which method returns.
	Method name is a valid Java identifier name.

	Access specifier, Keyword and arguments are optional.

	Examples of methods declaration:
	public static void main(String[] args);
	void myMethod();
	private int maximum();
	public synchronized int search(java.lang.Object);*/
	
	  // Constructor method
	 
	JavaMethods() {
	    System.out.println("Constructor method is called when an object of it's class is created");
	  }
	 

	public static void main(String[] args) {
	    staticMethod();
	    JavaMethods object = new JavaMethods();
	    object.nonStaticMethod();
	  }
	 
	  // Static method
	 
	  static void staticMethod() {
	    System.out.println("Static method can be called without creating object");
	  }
	 
	  // Non static method
	 
	  void nonStaticMethod() {
	    System.out.println("Non static method must be called by creating an object");
	  }

	}


