package application;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enoums.Color;

public class Program
{

	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();//deve-se declarar a lista do tipo da superclasse para que possa aceitar também os tipos das subclasses
		
		System.out.print("Enter with the of shapes: ");
		int n = sc.nextInt();
		
		for(int i=1; i<= n; i++)
		{
			System.out.println("Shape " + i + " data: ");
			System.out.print("Rectangle or circle (r/c)? ");
			char rs = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/WHITE): ");
			Color color = Color.valueOf(sc.next());//converte o valor informado para o tipo Color
			
			if(rs == 'r')
			{
				System.out.print("Width: ");
				double width  = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				
				Shape sh = new Rectangle(color, width, height);
				list.add(sh);
			}
			else
			{
				System.out.print("Radius: ");
				double radius  = sc.nextDouble();
				
				list.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS");
		
		for(Shape shape : list)
		{
			System.out.println(String.format("%.2f", shape.area()));
		}
		sc.close();
	}

}
