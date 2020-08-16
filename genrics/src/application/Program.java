package application;

import java.util.Scanner;
import model.entities.PrintService;

public class Program 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<>();// O<> é a notação usada para indicar que está se uando uma classe do tipo genercs
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++)
		{
			int value = sc.nextInt();
			ps.addValue(value);
		}

		//O typesafe do generics não permite adicionar uma variável de tipo diferente do que a indicado
		ps.print();
		System.out.println("First: " + ps.first());
		sc.close();
	}
}
