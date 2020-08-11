package model.entities;

import model.enums.Color;

public class Circle extends AbstractShape
{
	private double radius;
	
	public Circle() {
		
	}
	
	public Circle(Color color, double radius) {
		super(color);
		this.radius = radius;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	public double area()
	{
		return Math.PI * radius * radius;
	}
}
