package entities;

public class Account {
	private String holder;
	private int number;
	private double balance;
	final double RATE = 5.0;

	public Account(String holder, int number, double initialDeposit)
	{	
		this.holder = holder;
		this.number = number;
		deposit(initialDeposit);
	}
	
	public Account(String holder, int number) 
	{
		this.holder = holder;
		this.number = number;
	}

	public String getName() 
	{
		return holder;
	}

	public void setName(String holder) {
		this.holder = holder;
	}

	public int getAccount() 
	{
		return number;
	}

	public double getBalance() 
	{
		return balance;
	}

	public double withdrow(double value)
	{
		return balance = balance - value - RATE;
	}

	public double deposit(double value)
	{
		return balance += value;
	}
	
	public double totalInAccount()
	{
		return balance;
	}

	public String toString()
	{
		return "name: "
			+ String.format("%s", holder)
			+ ", account: "
			+ String.format("%d", number)
			+", total: R$"
			+ String.format("%.2f", balance);
	}
}
