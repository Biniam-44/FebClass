package javaIntro;

public class Java05Arrays {

	public static void main(String[] args) {
		
		// Arrays are a collection of objects
		
		String b[] = {"Nebyou","Abel","Tesfa"};
		// We declare the arrays with allocated memory
		int z[] = new int[4];
		z[0] = 12;
		z[1] = 11;
		z[2] =13;
		//z[3] = 14;
		//z[4] =15;
		
		System.out.println(z[2]);
		String c = "Nebyou";
		int a[] = {2,4,6,7,8,90,100,120};
		//int z[] = {12,11,13,14};
		 
		int result = 0;
		int d =11234;
		System.out.println(a.length);
		System.out.println(a[3]);
		
		
		for(int i=0; i < a.length;i++) {
			result = result +a[i];
			// a[0] = 2
			//a[1]= 2 + 4 = 6
			//a[2]= 6 + 6 =12
			//a[3] = 12 + 7 = 19
			//a[4] =19 + 8 = 27
			//a[5] = 27 + 90 = 117
		} 

		System.out.println(result);
	}

}
