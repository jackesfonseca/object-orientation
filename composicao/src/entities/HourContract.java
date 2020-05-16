package entities;

import java.util.Date;

public class HourContract
{
	private Date date;
	private double valuePerHour;
	private Integer hours;
	
	public HourContract(){		
	}
	
	public HourContract(Date date, double valuePerHour, Integer hours)
	{
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}
	public void setDate(Date date)
	{
		this.date = date;
	}
	
	public Date getDate()
	{
		return date;
	}
	
	public void setValuePerHour(double valuePerHour)
	{
		this.valuePerHour = valuePerHour;
	}
	
	public double getValuePerHour()
	{
		return valuePerHour;
	}
	
	public void setHours(Integer hours)
	{
		this.hours = hours;
	}
	
	public Integer getHours()
	{
		return hours;
	}
	
	public double totalValue()
	{
		return valuePerHour * hours;
	}
}
