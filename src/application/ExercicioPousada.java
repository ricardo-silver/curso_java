package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pousada;
public class ExercicioPousada {

	public static void main(String[] args) {
		
		  Pousada[] pousada = new Pousada[10];

          Locale.setDefault(Locale.US);
          Scanner sc = new Scanner(System.in);

          System.out.println("How many rooms will be rented ?");

          int qtde = sc.nextInt();

          for (int i=1; i<=qtde; i++) {
        	  
                 System.out.println();
                 
                 System.out.println("Rent #" + i + ":");
                 
                 System.out.print("Name: ");
                 sc.nextLine();
                 
                 String name = sc.nextLine();
                 
                 System.out.print("Email: ");
                 String email = sc.nextLine();
                 
                 System.out.print("Room: ");
                 int room = sc.nextInt();
                 
                 pousada[room] = new Pousada(name, email);

                 }

                 System.out.println();
        
          System.out.println("Busy Rooms: ");

          for (int i=0; i < pousada.length; i++) {


                        if ( pousada[i] != null ) {

                        System.out.println(i + ": " + pousada[i]);

                        }
          }

          sc.close();
	}

}
