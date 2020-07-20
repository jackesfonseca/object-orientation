package model.entities;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class Reservation 
{
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut)
	{
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
	
	public String updateDates(Date checkIn, Date checkOut)
	{
		Date now = new Date();
		
		if(checkIn.before(now) || checkOut.before(now))
		{
			return "Error in reservation: Reservation dates for update must be future";
		}
		if(!checkOut.after(checkIn))
		{
			return "Error in reservation: Check-out date must be after check-in date";
		}
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		
		return null;//Caso não retorne nenhuma mensagem de errro o programa irá retornar null dizendo que não houveram erros
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
