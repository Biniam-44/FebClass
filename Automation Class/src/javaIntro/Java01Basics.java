package javaIntro;

public class Java01Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// This is the place where the code execution starts
		// This is a single line comment
		/*
		 * This is a multi line comment
		 * 
		 * I can write what ever I want inside here
		 * 
		 */

		// This line will print out this is my first java code
		System.out.println("This is my first Java code");

		// Java it's always case sensitive

		String a;

		// Data types

		String name = "My name is Nebyou 1234";

		double number1 = 20;

		double number2 = 15;

		// int resultAddition;

		double resultAddition = number1 + number2;

		double resultSub = number1 - number2;

		double resultDivide = number2 / number1;

		System.out.println("My Addition result is " + "resultAddition");

		System.out.println("My Sub result is " + resultSub);

		System.out.println("My division result is " + resultDivide);

		char character = 'b';

		float numberPoint = 3.53564368988262306820862632f;

		double numberPoint2 = 3.53564368988262306820862632;

		boolean abcd = false;

		System.out.println(numberPoint2);

		/*
		 * There are two types of errors 1. Runtime error - will happen after the code
		 * execution have started 2. Compilation error - will happen during the
		 * compilation of the code or before the code got executed
		 */

		Java02Methods cm = new Java02Methods();
		cm.AddTwoNumbers();
		cm.SubTwoNumbers();
		System.out.println(cm.MethodWithReturnType());
		System.out.println(cm.MethodWithBoolReturn());
		cm.MethodWithParameter(16, 10);
		cm.MethodWithStringParmeter("Eddy");
	}

}
