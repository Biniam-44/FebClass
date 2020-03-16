package javaIntro;

public class Java20Constructors {

	//Constructors are always called at the creation of the object
	//Constructors have no return type
	//Constructors have always the same name as the class name
	public Java20Constructors() {
		
	}
	public Java20Constructors(int a) {
		System.out.println("I am the constructor with a parameter " + a);
	}
	public  Java20Constructors(String c) {
		System.out.println("I am the constructor with a Stirng parameter " + c);
	}
	public void Method1() {
		System.out.println("I am the method not the constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Java20Constructors cons = new Java20Constructors("Nebyou");
		cons.Method1();
		
		
	}

}
