package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.ContribuintePF;
import entities.ContribuintePJ;


public class ExercicioContribuinte {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Contribuinte> list = new ArrayList<>();

		System.out.println("Enter the number of tax payer:");
		int qtde = sc.nextInt();

		for (int i=1; i<=qtde; i++) {

			System.out.println();

			System.out.println("Tax payer #" + i + " data:");

			System.out.println("Individual or Company (i/c)?");

			char tipo = sc.next().charAt(0);

			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();

			System.out.print("Anual income:");
			double rendaAnual = sc.nextDouble();

			if (tipo == 'i') {

				System.out.print("Health expenditures:");
				Double despesaSaude = sc.nextDouble();
				list.add(new ContribuintePF(nome,rendaAnual,despesaSaude));
			}
			else  {
				System.out.print("Number of Employees:");
				int numeroFuncionarios = sc.nextInt();
				list.add(new ContribuintePJ( nome, rendaAnual, numeroFuncionarios));
			} 
		}
		sc.close();
		System.out.println("");
		System.out.printf("IMPOSTO ARRECADADO:%n");
		
		Double soma = 0.00;
		
		for (Contribuinte x : list ) {
			System.out.printf(x.getNome() + ": $ " + String.format("%.2f",x.impostoArrecadado())+"%n" );
			soma += x.impostoArrecadado();
		}
	
		System.out.println();
		System.out.printf("TOTAL DE IMPOSTOS: $ " +  String.format("%.2f",soma));
	}

}
