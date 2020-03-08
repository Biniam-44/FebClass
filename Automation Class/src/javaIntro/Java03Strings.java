package javaIntro;

public class Java03Strings {
	public void Method1() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// There are two ways of declaring a string
		
		// The 1st way
		String name = "My name is nebyou";
		System.out.println(name);
		System.out.println("My name is nebyou");
		
		// The 2nd way
		String name1 = new String("My name is Tesfa");
		System.out.println(name1);
		
		// I want to get the 9th character on name string
		char index = name.charAt(9);
		System.out.println(index);
		System.out.println("Our 9th index character is " + index);
		
		// I want to  get on which index is letter T
		int charIndex = name1.indexOf("T");
		System.out.println(charIndex);
		
		//I want to make sure s exists in at the end of any variable on name1
		boolean ending = name1.endsWith("s");
		System.out.println(ending);
		
		if(ending = true) {
			System.out.println("The string name1 ends with a returns true");
		}
		else {
			System.out.println("The string name1 ends with a returns false");
		}
		
		boolean ending2 = name.endsWith("u");
		System.out.println(ending2);
		
		int a =3;
		
		if(a == 1) {
			System.out.println("I'm the if part " + a);
		}
		else if(a == 3) {
			System.out.println("I'm the else if part " + a);
		}
		else {
			System.out.println("I'm the else part " + a);
		}
		// I want to convert name1 to all Caps case
		String allCaps = name1.toUpperCase();
		System.out.println(allCaps);
		
		// I want to convert name1 to all Lower case
		String allLower = name1.toLowerCase();
		System.out.println(allLower);
		
		// I want to get the length of name1
		int length = name1.length();
		System.out.println(length);
		
		
		
		
	}

}
