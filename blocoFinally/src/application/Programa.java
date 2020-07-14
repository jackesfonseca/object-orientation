package application;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Programa
{
	public static void main(String[] args)
	{
		
		File file = new File("C:\\ws-eclipse\\Java_Learning\\java\\blocoFinally\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error opening file: " + e.getMessage());
		}
		finally
		{
			if(sc != null)
			{
				sc.close();
			}
			System.out.println("Block finally executed");
		}
	}
}
