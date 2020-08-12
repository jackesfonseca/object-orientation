package application;

import devices.Printer;
import devices.Scanner;

public class Program
{
	public static void main(String[] args)
	{
		Printer p = new Printer(1000);
		p.processDoc("My letter");
		p.print("My letter");
		
		Scanner s = new Scanner(1001);
		s.processDoc("My email");
		System.out.println("Scan result: " + s.scan());
	}
}
