package model.entities;

public class BrazilInterestRate implements InterestService
{
	private double interestRate;
	
	public BrazilInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}
	
}