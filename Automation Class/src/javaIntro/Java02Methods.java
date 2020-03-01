package javaIntro;

public class Java02Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * How we create an object is className name = new className();
		 */

		Java02Methods cm = new Java02Methods();
		cm.AddTwoNumbers();
		cm.SubTwoNumbers();
		System.out.println(cm.MethodWithReturnType());

	}

	int a = 27;
	int b = 18;

	public void AddTwoNumbers() {
		int sum = a + b;
		System.out.println(sum);
	}

	public void SubTwoNumbers() {
		int sub = a - b;
		System.out.println(sub);
	}

	// Method with an Integer return type
	public int MethodWithReturnType() {
		return 2;
	}

	// Method with a boolean return type
	public boolean MethodWithBoolReturn() {
		return false;
	}
	public boolean MethodBoolReturnWithParmaeter( boolean a) {
		return a;
	}

	public void MethodWithParameter(int a, int b) {

		int sum = a + b;
		System.out.println("My sum from the parameter is " + sum);
	}

	public void MethodWithStringParmeter(String name) {

		System.out.println("My name is " + name);
	}

}
