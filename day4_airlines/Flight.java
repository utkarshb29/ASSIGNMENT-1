package  day4_airlines;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Flight {

	private String flightNumber;
	private String airliner;
	
	private String source;
	private LocalDateTime flyDateTime;
	
	private String destination;
	private LocalDateTime arrivalDateTime;
	
	private Hault[] hault; 
	
	private boolean flyType; 
	private int internationFlyTax; 
	
	private int baseFare;
	private int finalCost;
	private int airport_surcharge,fuel_cost;
	private double percentage=0,per=0,intper=0;
	public int calculateCost()
	{
		
		 LocalDate localDate = arrivalDateTime.toLocalDate();
		 LocalTime localTime=arrivalDateTime.toLocalTime();
		 LocalTime time= LocalTime.parse("12:00");
		 int hr = localTime.compareTo(time);
		 AirlinerCalendar airlinecalendar= new AirlinerCalendar();
		 FriendlyCountry friendlycountry=new FriendlyCountry();
		for(int i=0;i<airlinecalendar.listOfHolidays.length;i++) {
			Period days= localDate.until(airlinecalendar.listOfHolidays[i]);
		if(days.getDays()<=10 && days.getDays()>=2){	
			percentage =0.2;
		}
		else if(days.getDays()<=2&& days.getDays()>=0) {
			percentage=0.5;
		}
		}
		if(hr<=2 ||hr>=2) {
			per=0.1;	
		}
		if(flyType=true)
		{
		for(int i=0;i<friendlycountry.countries.length;i++) {
			if(destination==friendlycountry.countries[i]) {
				intper=0.3;
				}
			}
		}	
		System.out.println(percentage+"\t"+per+"\t"+intper);
		finalCost=(int) (baseFare+percentage*baseFare+per*baseFare+baseFare*intper);
		airport_surcharge=(int) (baseFare*0.05);
		fuel_cost=(int) (baseFare*0.3);
		return finalCost;
		
	}

	public int getAirport_surcharge() {
		return airport_surcharge;
	}

	public void setAirport_surcharge(int airport_surcharge) {
		this.airport_surcharge = airport_surcharge;
	}

	public int getFuel_cost() {
		return fuel_cost;
	}

	public void setFuel_cost(int fuel_cost) {
		this.fuel_cost = fuel_cost;
	}

	public String getFlightNumber() {
		return flightNumber;
	}



	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}



	public String getAirliner() {
		return airliner;
	}



	public void setAirliner(String airliner) {
		this.airliner = airliner;
	}



	public String getSource() {
		return source;
	}



	public void setSource(String source) {
		this.source = source;
	}



	public LocalDateTime getFlyDateTime() {
		return flyDateTime;
	}



	public void setFlyDateTime(LocalDateTime flyDateTime) {
		this.flyDateTime = flyDateTime;
	}



	public String getDestination() {
		return destination;
	}



	public void setDestination(String destination) {
		this.destination = destination;
	}



	public LocalDateTime getArrivalDateTime() {
		return arrivalDateTime;
	}



	public void setArrivalDateTime(LocalDateTime arrivalDateTime) {
		this.arrivalDateTime = arrivalDateTime;
	}



	public Hault[] getHault() {
		return hault;
	}



	public void setHault(Hault[] hault) {
		this.hault = hault;
	}



	public boolean isFlyType() {
		return flyType;
	}



	public void setFlyType(boolean flyType) {
		this.flyType = flyType;
	}



	public int getInternationFlyTax() {
		return internationFlyTax;
	}



	public void setInternationFlyTax(int internationFlyTax) {
		this.internationFlyTax = internationFlyTax;
	}



	public int getBaseFare() {
		return baseFare;
	}



	public void setBaseFare(int baseFare) {
		this.baseFare = baseFare;
	}



	public int getFinalCost() {
		return finalCost;
	}



	public void setFinalCost(int finalCost) {
		this.finalCost = finalCost;
	}
	
}