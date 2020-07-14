package entities;

public final class OutsourcedEmployee extends Employee
{
	private double additionalCharge;
	
	public OutsourcedEmployee()
	{
		super();
	}
	
	public OutsourcedEmployee(String name, Integer hours, double valuePerHour, double additionalCharge)
	{
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	public double getAdditionalCharge()
	{
		return additionalCharge;
	}
	
	public void setAdditionalCharge(double additionalCharge)
	{
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public final double payment()
	{
		return super.payment() + additionalCharge * 1.1;
	}
}