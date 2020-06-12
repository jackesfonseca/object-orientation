package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args)
	{
		Account acc1 = new Account(1001, "Bob", 1000.00);
		acc1.withdrow(200.00);
		System.out.println(acc1.getBalance());
		
		// UPCASTING
		Account acc2 = new BusinessAccount(1002, "Jack", 1000.00, 500.00);
		acc2.withdrow(200.00);
		System.out.println(acc2.getBalance());
		
		// UPCASTING
		Account acc3 = new SavingsAccount(1003, "Elen", 1000.00, 0.01);
		acc3.withdrow(200.00);
		System.out.println(acc3.getBalance());

	}

}
