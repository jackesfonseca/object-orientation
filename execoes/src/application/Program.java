package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program 
{

	/*OBS.:Quando se tem um método e dentro dele se faz a chamada se faz uma chamada de método que possa causar exceção deve-se:
	* 1 - Tratar a exceção com a extrutura (try-catch)
	* 2 - Propagar a eceção (throws)
	*/
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Room number: ");
			int roomNumber = sc.nextInt();
			System.out.print("Check-in date (dd/mm/yyyy): ");
			Date checkIn = sdf.parse(sc.next());//Le em forma de string e depois converte para date
			System.out.print("Check-out date (dd/mm/yyyy): ");
			Date checkOut = sdf.parse(sc.next());//Le em forma de string e depois converte para date
			
			Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println("Reservation" + reservation);
			
			System.out.println();
			System.out.println("Enter data to update reservation");
			System.out.print("Check-in date (dd/mm/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/mm/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation updated: " + reservation);
		}
		catch(ParseException e)
		{
			System.out.println("Inavlid date format!");
		}
		catch(DomainException e)
		{
			System.out.println("Error: " + e.getMessage());
		}
		catch(RuntimeException e)
		{
			System.out.println("Unexpected error!");
		}
		
		sc.close();
	}

}