package javaIntro;
class shape{
	void draw(){
		System.out.println("Drawing..");
	}
}
class Rectangle extends shape{
	void draw() {
		System.out.println("I am drawing a rectangle");
	}
}

class Circle extends shape{
	public void draw() {
		System.out.println("I am drawing a circle");
	}
}
class Triangle extends shape{
	public void draw() {
		System.out.println("I am drawing a Triangle");
	}
}
// The return type is incompatible with shape.draw()
class Hexagon extends shape{
	public void draw() {
		System.out.println("I am drawing Hexagon");
	}
	public void method1() {
		
	}
}
public class Java12Polymorphism {

	public static void main(String[] args) {
		shape s = new Rectangle();
		s.draw();
		shape s1 = new Circle();
		s1.draw();
		shape s2 = new Triangle();
		s2.draw();
		shape s3 = new Hexagon();
		s3.draw();
		
		

	}

}
