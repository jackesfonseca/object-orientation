package application;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Program
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<>();
		String path = "C:\\ws-eclipse\\Java_Learning\\java\\interfaceComparable\\out.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path)))
		{
			String name = br.readLine();//ler uma linha do arquivo
			while(name != null)
			{
				list.add(name);
				name = br.readLine();
			}
			
			Collections.sort(list);//metodo que ordena uma coleção, contido no pacote java.util.Collections
			for(String l : list)
			{
				System.out.println(l);
			}
		}
		catch(IOException e)
		{
			System.out.println("Error: " + e.getMessage());
		}
	}
}
