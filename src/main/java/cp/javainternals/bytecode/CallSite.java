package cp.javainternals.bytecode;

public class CallSite {
	
	void method() {
		System.out.println("I am method");
	}
	
	void callMethod() {
		method();
	}

}
