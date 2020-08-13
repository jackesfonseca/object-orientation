package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.BrazilInterestRate;
import model.entities.InterestService;

public class Program
{
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();
	
		InterestService is = new BrazilInterestRate(2.0);
		double payment = is.payment(months, amount);
		
		System.out.println("Rayment after " + months + " months:");
		System.out.println(String.format("%.2f", payment));
	
		sc.close();
	}
}
