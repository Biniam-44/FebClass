package javaIntro;
class Vehicle{
	public void run(int a) {
		System.out.println("Vehicle engine is running");
		
	}
}
public class Java11MethodOverridingBike extends Vehicle {

	public void run(int a) {
		System.out.println("Bike is moving");
	}
	public static void main(String[] args) {
		Java11MethodOverridingBike obj = new Java11MethodOverridingBike();
		obj.run(1);

	}

}
