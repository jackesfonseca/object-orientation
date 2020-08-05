package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalServices
{
	private Double pricePerDay;
	private Double pricePerHour;
	
	private BrazilTaxService taxService;
	
	public RentalServices(Double pricePerDay, Double pricePerHour, BrazilTaxService taxService)
	{
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}
	
	//carRental é um objeto da classe CarRental
	public void processInvoice(CarRental carRental)
	{
		long t1 = carRental.getStart().getTime();//o getStart é um modulo da classe CarRental e o getTime pega o tempo em milisegundos
		long t2 = carRental.getFinish().getTime();
		/*Lógica da conversão
		 * Para converter milisegundos para segundos divide-se por 1000
		 * Para converter segundos em minutos divide-se por 60
		 * Para converter minutos em horas divide-se por 60
		 */
		double hours = (double)(t2 - t1) / 1000 / 60 / 60;
		
		double basicPayment;
		
		if(hours <= 12.0)
		{
			basicPayment = Math.ceil(hours) * pricePerHour;//O Math.ceil(double) arredonda o resultado para mais
		}
		else
		{
			basicPayment = Math.ceil(hours / 24) * pricePerDay;
		}
		
		//será armazenado na variável tax o resultado da função tax contida no objeto taxService da classe BrazilTaxService passando como parâmetro o basicPayment
		double tax = taxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
}
