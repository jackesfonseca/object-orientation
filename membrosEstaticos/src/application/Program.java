package application;

import java.util.Scanner;
import java.util.Locale;
import util.Calculator;

public class Program
{
	public static final double PI = 3.14159;
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Calculator cal = new Calculator();
		
		double raio;
		System.out.print("Enter with raio: ");
		raio = sc.nextDouble();
		
		System.out.printf("circumference = %.2f\n", circumference(raio));
		System.out.printf("volume = %.2f\n", cal.volume(raio));
		
		sc.close();
	}
	public static double circumference(double raio)
	{
		return 2.0 * PI * raio * raio;
	}
}