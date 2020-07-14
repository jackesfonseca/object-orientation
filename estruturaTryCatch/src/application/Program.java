package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		try
		{
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}

		//acessou o array fora do limit
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid position");
		}
		//Valor inválido para o inteiro
		catch(InputMismatchException e)
		{
			System.out.println("Input Error");
		}
		System.out.println("Fim do programa!");
		
		sc.close();
	}
}
