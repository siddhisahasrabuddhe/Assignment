package trainTicket;
import trainTicket.Passenger;
import trainTicket.Train;

import java.time.LocalDate;
import java.util.Collection;
import java.util.TreeMap;

public class Ticket {
	
	private int conter;
	private static String pnr;
	private static LocalDate travelDate;
	private Train train;
	private TreeMap<Passenger,Double> passengers=new TreeMap<Passenger,Double>();
	
	double calPassengerFare(Passenger passenger) {

if(passenger.getAge()<=12)
	return (0.5 * train.getTicketPrice());

if(passenger.getAge()>=60)
	return (0.6 * train.getTicketPrice());

if(passenger.getAge()<=12)
	return (0.25 * train.getTicketPrice());

else
	return train.getTicketPrice();
			
	}
	
	public static String generatePNR()
	{
		
		char s= Train.source.charAt(0);    
		char d=Train.destination.charAt(0);
		return pnr= s+d+"_"+travelDate +"_"+100;
	}
	
	public void addPassenger(String name, int age, char gender)
	{
		passengers=new TreeMap();
		Double fare=(Double) calPassengerFare(new Passenger(name,age,gender));
		passengers.put(new Passenger(name,age,gender),fare);
		
	}

double calculateTotalTicketPrice()
{
	double totalPrice=0;
	Collection<Double> price=passengers.values();
	for(Double values:price)
	{
		totalPrice=totalPrice+values;
	}
	return (double)totalPrice;
}
	
	//public Ticket(LocalDate travelDate, Train train) {
	//	super();
	//	this.travelDate = travelDate;
	//	this.train = train;
		
	//}
 
	StringBuilder generateTicket()
	{
		StringBuilder sb=new StringBuilder();
		return sb.append("PNR: "+generatePNR()).append("\n").append("TrainNo: "+train.getTrainNo()).append("\n").append("Train Name:"+train.trainName).append("From:"+train.source).append("To:"+train.destination).append("Travel Date:"+travelDate);
	}

	

	public int getConter() {
		return conter;
	}

	public void setConter(int conter) {
		this.conter = conter;
	}

	public String getPnr() {
		return pnr;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	public static LocalDate getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(LocalDate travelDate) {
		this.travelDate = travelDate;
	}

	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

	public TreeMap<Passenger, Double> getPassengers() {
		return passengers;
	}

	public void setPassengers(TreeMap<Passenger, Double> passengers) {
		this.passengers = passengers;
	}

}
