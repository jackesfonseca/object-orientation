package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation 
{
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException
	{
		if(!checkOut.after(checkIn))
		{
			throw new DomainException("Error in reservation: Check-out date must be after check-in date");
		}
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	public Integer getRoomNumber()
	{
		return roomNumber;
	}
	
	public void setRoomNumber(Integer roomNumber)
	{
		this.roomNumber = roomNumber;
	}
	
	public Date getCheckIn()
	{
		return checkIn;
	}
	
	public Date getCheckOut()
	{
		return checkOut;
	}
	
	public long duration()
	{
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void updateDates(Date checkIn, Date checkOut) throws DomainException //A exceção será lançada para a classe principal para ser tartada
	{
		Date now = new Date();
		
		if(checkIn.before(now) || checkOut.before(now))
		{
			throw new DomainException("Error in reservation: Reservation dates for update must be future");//Exceção apresentada quando são passados argumentos inválidos para um método
		}
		if(!checkOut.after(checkIn))
		{
			throw new DomainException("Error in reservation: Check-out date must be after check-in date");
		}
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	//Sobreposição
	@Override
	public String toString()
	{
		return "Room "
			+ roomNumber
			+ ", check-in: "
			+ sdf.format(checkIn)
			+ ", cehck-out: "
			+ sdf.format(checkOut)
			+ ", "
			+ duration()
			+ " night";
	}
	
}
