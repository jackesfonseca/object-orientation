package application;

import entities.BusinessAccount;

public class Program
{

	public static void main(String[] args)
	{
		BusinessAccount account = new BusinessAccount(123, "Jackes Fonseca", 9940.00, 9000.00);

		account.deposit(800.0);
		
		System.out.println(account);
	}

}
