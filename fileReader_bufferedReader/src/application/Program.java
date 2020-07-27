package application;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Program 
{
	public static void main(String[] args)
	{
		String path = "C:\\ws-eclipse\\Java_Learning\\java\\fileReader_bufferedReader\\obj\\in.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try
		{
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			while(line != null)
			{
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try {
				if(br != null)
				{
					br.close();
				}
				if(fr != null)
				{
					fr.close();
				}
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
