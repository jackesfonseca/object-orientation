package appliction;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program 
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Account holder: ");
		String holder = sc.nextLine();
		System.out.print("Account number: ");
		int number = sc.nextInt();
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		if(response == 'y')
		{
			System.out.print("Enter with de deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(holder, number, initialDeposit);
		}else
		{
			account = new Account(holder, number);
		}
		
		
		System.out.println();
		//ATENÇÃO: Não é necessário fazer o chamado account.toString() pq o java detecta que o objeto está em um contexto de println que está esperando uma string e implicitamente chamará o toString
		System.out.println("Enter data: " + account);
		
		System.out.println();
		System.out.print("Enter with deposit: ");
		double value = sc.nextDouble();
		account.deposit(value);
		
		System.out.println();
		System.out.print("Updated deposit: " + account);
		
		System.out.println();
		System.out.print("Enter with withdraw: ");
		value = sc.nextDouble();
		account.withdrow(value);
		
		System.out.println();
		System.out.print("Updated withdraw: " + account);

		sc.close();
	}

}
