package javaIntro;

abstract class AbstractClass{
	
	public abstract void MethodAbstract();
}
public class Java13Abstraction extends AbstractClass {
	public void MethodAbstract() {
		System.out.println("this is my implemented abstract method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Java13Abstraction ab = new Java13Abstraction();
		ab.MethodAbstract();


	}

}
