package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program
{
	public static void main(String[] args)
	{
		File file = new File("C:\\ws-eclipse\\Java_Learning\\java\\arquivos\\in\\greetings.txt");
		Scanner sc = null;
		
		try
		{
			sc = new Scanner(file);
			while(sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
			}	
		}
		catch(IOException e)
		{
			System.out.println("Error: " + e.getMessage());
		}
		finally
		{
			if(sc != null)//Pode ser que na hora de instanciar o Scanner ocorra algum problema e por isso o valor de sc será null, caso tente fecgar com sc.close() será gerado um nullPointerException
			{
				sc.close();
			}
		}
	}
}
