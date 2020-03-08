package javaIntro;



public class Java07InheritanceProgrammer extends Java06InheritanceEmployee  {

	public double ProgrammerBonus(double bouns) {
		return bouns;
	}
	public static void main(String[] args) {
		Java07InheritanceProgrammer IE = new Java07InheritanceProgrammer();
		IE.EmployeeSalary(5000);
		IE.ProgrammerBonus(1000);
		IE.empId = 100;
		System.out.println(IE.a = 'b');
		
		

	}

}
