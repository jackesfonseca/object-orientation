package devices;

public class Printer extends Device
{
	public Printer(long serialNumber) {
		super(serialNumber);
	}
	
	@Override
	public void processDoc(String doc)
	{
		System.out.println("Printer process: " + doc);
	}
	
	public void print(String doc)
	{
		System.out.println("Printing: " + doc);
	}
}
