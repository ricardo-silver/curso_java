package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ExercicioEmployee {

	public static void main(String[] args) {
		
		   Locale.setDefault(Locale.US);
	       Scanner sc = new Scanner(System.in);
	       
	       List<Employee> list = new ArrayList<>();

	          System.out.println("How many employees will be registered ?");
	          int qtde = sc.nextInt();
	          
	          for (int i=1; i<=qtde; i++) {
	        	  
	                 System.out.println();
	                 
	                 System.out.println("Exployee #" + i + ":");
	                 
	                 System.out.print("Id: ");
	                 int id = sc.nextInt();
	                 
	                 System.out.print("Nome: ");
	                 sc.nextLine();
	                 String nome = sc.nextLine();
	                 
	                 System.out.print("Salario: ");
	                 double salario = sc.nextDouble();
	                 
	                 list.add(new Employee(id,nome,salario));

	                 }
	          
	        System.out.println();
	  		System.out.print("Enter the employee id that will have salary increase: ");
	  		int idnew = sc.nextInt();
	  		
	  		Employee emp = list.stream().filter(x -> x.getId() == idnew).findFirst().orElse(null);
	  		
	  		if (emp == null) {
	  			System.out.println("This id does not exist!");
	  		}
	  		else {
	  			System.out.print("Enter the percentage: ");
	  			double percentage = sc.nextDouble();
	  			emp.aumentoSalario(percentage);
	  		}
	          
	          System.out.println("List of Employees :");
	          
	          for (Employee x : list ) {
	          System.out.println(x);
	          }
	          
	          sc.close();
	}

}
