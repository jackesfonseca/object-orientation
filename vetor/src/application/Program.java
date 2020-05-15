package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Products;

public class Program 
{
	public static void main(String args[])
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, tam;
		
		System.out.print("Quantities of products: ");
		tam = sc.nextInt();
		
		Products vet[] = new Products[tam];
		
		for(i=0; i<vet.length; i++)
		{
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			vet[i] = new Products(name, price); 
		}
		
		double sum = 0.00;
		
		for(i=0; i<tam; i++)
		{
			sum += vet[i].getPrice();
		}
		
		double average = sum/vet.length;
		
		System.out.println("AVERAGE PRICE: " + average);
		
		sc.close();
	}
}
