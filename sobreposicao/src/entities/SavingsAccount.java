package entities;

public class SavingsAccount extends Account
{
	private double interestRate;
	
	public SavingsAccount()
	{
		
	}
	
	public SavingsAccount(Integer number, String holder, double balance, double interestRate)
	{
		super(number, holder, balance);
		this.interestRate = interestRate;
	}
	
	public double getInterestRate()
	{
		return interestRate;
	}
	
	public void updateBalance(double amount)
	{
		balance += amount;
	}
	
	//notação que indica sobreposição
	@Override
	public void withdrow(double amount)
	{
		balance -= amount;
	}
}
