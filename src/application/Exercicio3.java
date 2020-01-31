package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Student stu = new Student();

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		stu.name= sc.nextLine();
		stu.nota1 = sc.nextDouble();
		stu.nota2 = sc.nextDouble();
		stu.nota3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n" , stu.finalGrade());
		stu.resultado();

		sc.close();

	}

}
