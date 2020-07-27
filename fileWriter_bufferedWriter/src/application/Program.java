package application;

import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Program 
{
	public static void main(String[] args)
	{
		String[] lines = new String[] {"Good Night", "Good Evenning"};
		
		String path = "C:\\ws-eclipse\\Java_Learning\\java\\fileWriter_bufferedWriter\\obj\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path)))//acrescentando o argumento true para instanciar o arquivo ele adicona ao arquivo existente
		{
			for(String line : lines)
			{
				bw.write(line);//imprime a linha no arquivo
				bw.newLine();//salta uma linha
			}
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
