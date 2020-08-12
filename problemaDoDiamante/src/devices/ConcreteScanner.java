package devices;

public class ConcreteScanner extends Device implements Scanner
{
	
	public ConcreteScanner(long serialNumber)
	{
		super(serialNumber);
	}
	
	@Override
	public void processDoc(String doc)
	{
		System.out.println("Scanner process: " + doc);
	}
	
	@Override
	public String scan()
	{
		return "Scanned content";
	}
}
