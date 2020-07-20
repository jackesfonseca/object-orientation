package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program 
{

	/*OBS.:Quando se tem um método e dentro dele se faz a chamada se faz uma chamada de método que possa causar exceção deve-se:
	* 1 - Tratar a exceção com a extrutura (try-catch)
	* 2 - Propagar a eceção (throws)
	*/
	public static void main(String[] args) throws ParseException
	{
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room number: ");
		int roomNumber = sc.nextInt();
		System.out.print("Check-in date (dd/mm/yyyy): ");
		Date checkIn = sdf.parse(sc.next());//Le em forma de string e depois converte para date
		System.out.print("Check-out date (dd/mm/yyyy): ");
		Date checkOut = sdf.parse(sc.next());//Le em forma de string e depois converte para date
		
		if(!checkOut.after(checkIn))
		{
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		}
		else
		{
			Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println("Reservation" + reservation);
			
			System.out.println();
			System.out.println("Enter data to update reservation");
			System.out.print("Check-in date (dd/mm/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/mm/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
			String error = reservation.updateDates(checkIn, checkOut);
			
			if(error != null)
			{
				System.out.println("Error in reservation: " + error);
			}
			else {
				System.out.println("Reservation updated: " + reservation);
		
			}
		}
		
		sc.close();
	}

}