package entities;

public class Account
{
	protected Integer number;
	protected String holder;
	//dá permissão para que uma subclasse acesse esse atributo
	protected double balance;
	
	public Account()
	{
	
	}
	
	public Account(Integer number, String holder, double balance)
	{
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	
	public Integer getNumber()
	{
		return number;
	}
	
	public void setNumber(Integer number)
	{
		this.number = number;
	}
	
	public String getHolder()
	{
		return holder;
	}
	
	public void setHolder(String holder)
	{
		this.holder = holder;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void deposit(double amount)
	{
		balance += amount;
	}
	
	public void withdrow(double amount)
	{
		if(amount <= balance) balance -= amount + 5;
	}
}
