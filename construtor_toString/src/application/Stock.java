package application;
import java.util.Scanner;
import java.util.Locale;
import entities.Product;

public class Stock
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Enter with poduct data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.print("Enter with the number of the products to be add in stock: ");
		quantity = sc.nextInt();
		product.AddProducts(quantity);
		
		System.out.println();
		System.out.println("Update added product data: " + product);
		
		System.out.print("Enter with the number of theproducts to be remove in stock: ");
		quantity = sc.nextInt();
		product.RemoveProducts(quantity);
		
		sc.nextLine();//apenas o nextLine remove o caracter de nova linha (gerado pelo seu Enter) da stream de entrada
		
		System.out.println();
		System.out.println("Update removed product data: " + product);
		System.out.println();
		
		System.out.print("New product's name: ");
		name = sc.nextLine();
		product.setName(name);
		System.out.println("Updated name: " + product.getName());
		System.out.println();
		
		System.out.print("New product's price: ");
		price = sc.nextDouble();
		product.setPrice(price);
		System.out.println("Updated price: " + product.getPrice());
		System.out.println();
		
		sc.close();
	}
}
