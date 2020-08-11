package model.entities;

import model.enums.Color;

public class Rectangle extends AbstractShape
{
	private double height;
	private double width;
	
	public Rectangle() {
		
	}
	
	public Rectangle(Color color, double height, double width)
	{
		super(color);
		this.height = height;
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double area()
	{
		return height * width;
	}
}
