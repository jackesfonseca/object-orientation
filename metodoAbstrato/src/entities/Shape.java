package entities;

import entities.enoums.Color;

public abstract class Shape
{
	private Color color;
	
	public Shape() {
		
	}
	
	public Shape(Color color)
	{
		this.color = color;
	}
	
	public Color getColor()
	{
		return color;
	}
	
	public void setCaolor(Color color)
	{
		this.color = color;
	}
	
	public abstract double area();
}
