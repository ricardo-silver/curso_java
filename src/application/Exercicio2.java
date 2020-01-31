package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Funcionario func = new Funcionario();

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Name:");
		func.name= sc.nextLine();

		System.out.println("Gross salary:");
		func.salary = sc.nextDouble();

		System.out.println("Tax:");
		func.tax = sc.nextDouble();

		System.out.printf("Employee : %s, R$ %.2f%n",func.name,func.salarioLiquido());

		System.out.println("Whichpercent age to increasesalary ?");
		double y = sc.nextDouble();

		System.out.printf("Updateddata : %s, R$ %.2f%n",func.name,func.salarioReajustado(y));

		sc.close();
	}
}
