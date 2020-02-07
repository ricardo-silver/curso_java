package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import entities.Conta;
import entities.exceptions.DomainException;

public class ExercicioContaException {

	public static void main(String[] args) throws DomainException {

		String numeroConta;
		String nomeTitular;
		double saldo;
		double limite;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		try {
			
			System.out.println("Enter account data: ");
			System.out.println("Number:");
			numeroConta = sc.nextLine();

			System.out.println("Holder: ");      
			nomeTitular = sc.nextLine();

			System.out.println("Initial deposit value: ");      
			saldo = sc.nextDouble();

			System.out.println("Limit value: ");      
			limite = sc.nextDouble();

			Conta conta = new Conta(numeroConta,nomeTitular,saldo,limite);

			System.out.println(conta);

			System.out.println("Enter amount for withdraw: ");        
			conta.saque(sc.nextDouble());        						

			System.out.println("New balance: " + conta);
		}
		catch (InputMismatchException e) {
			System.out.println("Invalid data input.");
		}
		catch (DomainException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Unexpected error.");
		}
		finally {
			if(sc!= null) {
				sc.close();
				}
			}
		}
	
}
