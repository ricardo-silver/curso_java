package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.ClientePedido;
import entities.Pedido;
import entities.PedidoItem;
import entities.ProdutoPedido;
import entities.StatusPedido;


public class ExercicoPedido {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		ClientePedido client = new ClientePedido(name, email, birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		StatusPedido status = StatusPedido.valueOf(sc.next());
		
		Pedido order = new Pedido (new Date(), status, client);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();

			ProdutoPedido product = new ProdutoPedido(productName, productPrice);

			System.out.print("Quantity: ");
			int quantity = sc.nextInt();

			PedidoItem orderItem = new PedidoItem(quantity, productPrice, product); 

			order.adicionaItem(orderItem);
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		
		sc.close();
	}
}