package p1;

import java.util.Scanner;

public class Salary {
	
public static void main(String[] args) {
		
		double basicSalary, hra, da, tax=0, totalSalary;
		System.out.println("Enter the Basic Salary");
		Scanner sc = new Scanner(System.in);
		basicSalary = sc.nextInt();
		
		
		hra =0.4 * basicSalary;
		da = 0.6 * (basicSalary + hra);
		System.out.println("HRA="+ hra);
		System.out.println("DA="+da);
		
		if(basicSalary < 200000) {
			tax = 0;
		}
		else if(basicSalary >= 200000 && basicSalary <=600000) {
			tax = 0.1 * basicSalary;
		}
		else if(basicSalary > 600000) {
			tax = 0.2 * basicSalary;
		}
		System.out.println("Tax=" + tax);
		
		totalSalary = basicSalary + hra + da - tax;
		
		
		System.out.print("The Annual Salary for the employee is =  " + totalSalary );
	}

}