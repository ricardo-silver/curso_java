package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class ExercicioProduto {

	public static void main(String[] args) throws ParseException {


		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Produto> list = new ArrayList<>();

		System.out.println("Enter the number of products:");
		int qtde = sc.nextInt();

		for (int i=1; i<=qtde; i++) {

			System.out.println();

			System.out.println("Product #" + i + " data:");

			System.out.println("Common, used or imported (c/u/i)?");

			char tipo = sc.next().charAt(0);

			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();

			System.out.print("Price: ");
			double preco = sc.nextDouble();

			if (tipo == 'i') {

				System.out.print("Customs fee:");
				double taxa = sc.nextDouble();
				list.add(new ProdutoImportado(nome,preco,taxa));
			}
			else { if (tipo == 'u') {
				System.out.print("Manufactured date (DD/MM/YYYY):");
				Date dataFab = sdf.parse(sc.next());
				list.add(new ProdutoUsado( nome, preco, dataFab));
			} else list.add(new Produto(nome,preco));
			}
		}
		
		System.out.printf("PRICE TAG:%n");

		for (Produto  prod : list) {
			System.out.printf(prod.priceTag() + "%n");
		}
		
		sc.close();
	}

}
