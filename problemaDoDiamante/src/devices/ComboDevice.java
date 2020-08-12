package devices;

public abstract class ComboDevice extends Device implements Printer, Scanner
{
	public ComboDevice(long serialNumber) {
		super(serialNumber);
	}
	
	public void print()
	{
		System.out.println("Combo printing");
	}
	
	public String scan()
	{
		return "Combo scan result";
	}
	
	public void processdoc(String doc)
	{
		System.out.println("Combo processing: " + doc);
	}
}
