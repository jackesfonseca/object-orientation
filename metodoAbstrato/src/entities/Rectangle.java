package entities;

import entities.enoums.Color;

public class Rectangle extends Shape
{

	private double width;
	private double height;
	
	public Rectangle()
	{
		super();
	}

	public Rectangle(Color color, double widht, double height)
	{
		super(color);
		this.width = widht;
		this.height = height;
	}
	
	public void setHeight(double height)
	{
		this.height = height;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public void setWidth(double weight)
	{
		this.width = weight;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	@Override	
	public double area()
	{
		return width * height;
	}
	
}
