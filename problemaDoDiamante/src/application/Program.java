package application;

import devices.ConcretePrinter;
import devices.ConcreteScanner;

public class Program
{
	public static void main(String[] args)
	{
		ConcretePrinter p = new ConcretePrinter(1000);
		p.processDoc("My letter");
		p.print("My letter");
		
		ConcreteScanner s = new ConcreteScanner(1001);
		s.processDoc("My email");
		System.out.println("Scan result: " + s.scan());
	}
}
