package entities;

public class BusinessAccount extends Account
{
	private double loanLimit;
	
	public BusinessAccount()
	{
		//indica para este construtor executar a lógica do construtor na superclasse
		super();
	}
	
	public BusinessAccount(Integer number, String holder, double balance, double loanLimit)
	{
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}
	
	public double getLoanLimit()
	{
		return loanLimit;
	}
	
	public void loan(double amount)
	{
		if(amount <= loanLimit) deposit(amount);
	}
	
	public void withdrow(double amount)
	{
		//realiza a mesma operação da superclasse através do super
		super.withdrow(amount);
		balance -= 2;
	}
	
	public String toString()
	{
		return "R$ " + balance
				+ ", account: " + number
				+ ", Holder: " + holder;
	}
}
