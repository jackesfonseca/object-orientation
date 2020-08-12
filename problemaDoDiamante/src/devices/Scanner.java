package devices;

public class Scanner extends Device
{
	
	public Scanner(long serialNumber)
	{
		super(serialNumber);
	}
	
	@Override
	public void processDoc(String doc)
	{
		System.out.println("Scanner process: " + doc);
	}
	
	public String scan()
	{
		return "Scanned content";
	}
}
