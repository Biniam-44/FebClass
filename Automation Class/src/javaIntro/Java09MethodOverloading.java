package javaIntro;



public class Java09MethodOverloading {

	public static void main(String[] args) {
		 
		Java10MethodOverloadingAdd ad = new Java10MethodOverloadingAdd();
		double sum = ad.add(2.0, 3.0);
		ad.add();
        System.out.println(sum);
	}

}
