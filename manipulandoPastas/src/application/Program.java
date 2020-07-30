package application;

import java.util.Scanner;
import java.io.File;

public class Program 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		//exibir as pastas naqule diretório
		File[] folders = path.listFiles(File::isDirectory);
		
		System.out.println("Folders: ");
		for(File folder : folders)
		{
			System.out.println(folder);
		}
		
		//exibir as arquivos naqule diretório
		File[] files = path.listFiles(File::isFile);
		
		System.out.println("Files");
		for(File file : files)
		{
			System.out.println(file);
		}
		
		//criar uma subpasta
		boolean success = new File(strPath + "\\subdir").mkdir();
		
		System.out.println("Directory created succesfully: " + success);
		
		//obter o nome do arquivo
		System.out.println("Get name: " + path.getName());
		//obter o caminho do arquivo
		System.out.println("Get parent: " + path.getParent());
		//caminho completo do arquivo (com o nome)
		System.out.println("Get path: " + path.getPath());
		
		sc.close();
	}
}
