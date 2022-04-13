package bonus;

import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {

		String name = " ";
		double hours = 0;
	
		Scanner inp = new Scanner(System.in);
		System.out.println("Please insert your name: ");
		name = inp.nextLine();
		System.out.println("Please insert the working hours: ");
		hours = inp.nextDouble();
		Employee obj = new Employee(name, hours);

		System.out.println(obj.getTotalPay());
		
		inp.close();
	}

}
