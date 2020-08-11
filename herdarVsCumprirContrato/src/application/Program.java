package application;

import java.util.Locale;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Rectangle;
import model.enums.Color;

public class Program
{
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		AbstractShape s1 = new Rectangle(Color.BLACK, 2.0, 5.0);
		AbstractShape s2 = new Circle(Color.WHITE, 2.0);
		
		System.out.println("Rectangle color: " + s1.getColor());
		System.out.println("Rectamgle area: " + String.format("%.3f", s1.area()));

		System.out.println("Circle color: " + s2.getColor());
		System.out.println("Circle area: " + String.format("%.3f", s2.area()));
	}
}
