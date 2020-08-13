package model.entities;

public class UsaInterestRate implements InterestService
{ 
	private double interestRate;
	
	public UsaInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}
}