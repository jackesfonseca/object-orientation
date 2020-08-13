package model.entities;

import java.security.InvalidParameterException;

public interface InterestService 
{
	double getInterestRate();
	
	//O método default não precisar ser implementado pelas classes que implementam a interface
	default double payment(int months, double amount)
	{
		if(months < 1)
		{
			throw new InvalidParameterException("Months must be greater than 1");
		}
		return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);//Como a interface não armazenará dados será usado a própriao função getInterestRate para obter o dado da taxa de juros
	}
}
