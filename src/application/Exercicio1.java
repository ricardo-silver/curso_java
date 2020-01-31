package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Exercicio1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		System.out.println("Enter rectangle width and height:");

		Scanner sc = new Scanner(System.in);

		Rectangle rectangle = new Rectangle();

		rectangle.width = sc.nextDouble();
		rectangle.heigth = sc.nextDouble();

		System.out.printf("AREA = %.2f%n", rectangle.area());
		System.out.printf("PERIMETER = %.2f%n", rectangle.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());
		sc.close();
	}

}