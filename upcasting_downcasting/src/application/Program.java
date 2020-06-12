package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program
{

	public static void main(String[] args)
	{
		
		
		Account acc = new Account(1001, "Anna", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Bob", 0.0, 500.00);
				
		// UPCASTING subclasse => superclasse
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Mary", 0.0, 200.00);
		Account acc3 = new SavingsAccount(1004, "Jack", 0.0, 0.01);
		
		// DOWNCASTING superclasse => subclasse
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.00);
		
		//BusinessAccount bcca5 = (BusinessAccount)acc3;
		if(acc3 instanceof BusinessAccount)
		{
			BusinessAccount bacc1 = (BusinessAccount)acc3;
			bacc1.deposit(100.00);
			System.out.println("Deposit!");
		}
		
		else if(acc3 instanceof SavingsAccount)
		{
			SavingsAccount sacc = (SavingsAccount)acc3;
			sacc.deposit(300.00);
			System.out.println("Update!");
		}
		
	}

}