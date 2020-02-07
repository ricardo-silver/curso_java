package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Conta;
import entities.exceptions.DomainException;

public class ExercicioBanco {

       public static void main(String[] args) throws DomainException {

             String numeroConta;
             String nomeTitular;
             char resposta;
             double saldo;

             Locale.setDefault(Locale.US);
             Scanner sc = new Scanner(System.in);
             
             System.out.println("Enter account number: ");      
             numeroConta = sc.nextLine();
             
             System.out.println("Enter account holder: ");      
             nomeTitular = sc.nextLine();
             
             System.out.println("Initial deposit(y/n)?");       
             resposta = sc.next().charAt(0);

             if (resposta == 'y') {
                    System.out.println("Enter initialdeposit value: ");      
                    saldo = sc.nextDouble();
             }

             else {
                    saldo = 0;
                   }

             Conta conta = new Conta(numeroConta,nomeTitular,saldo);

             System.out.println(conta);

             /*System.out.printf("Accountdata: %s, Holder: %s, Balance: $ %.2f%n" , conta.getNumeroConta() ,conta.getNomeTitular(), conta.getSaldo());*/                             

             System.out.println("Enter a deposit value: ");            
             conta.deposito(sc.nextDouble());      

             System.out.println(conta);
             /*System.out.printf("Updated Accountdata: %s, Holder: %s, Balance: $ %.2f%n" , conta.getNumeroConta() ,conta.getNomeTitular(), conta.getSaldo());*/

              System.out.println("Enter a draw value: ");        
             conta.saque(sc.nextDouble());         

             System.out.println(conta);
             /*System.out.printf("Updated Accountdata: %s, Holder: %s, Balance: $ %.2f%n" , conta.getNumeroConta() ,conta.getNomeTitular(), conta.getSaldo());*/
             sc.close();    
       }

}