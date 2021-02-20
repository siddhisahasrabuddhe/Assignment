package trainTicket;

public class Train {
	
	public int trainNo;
	public String trainName;
	public static String source="Banglore";
	public static String destination="Mumbai";
	public double ticketPrice;
	
	
	public Train(int trainNo, String trainName, String source, String destination, double ticketPrice) {
		super();
		this.trainNo = trainNo;
		this.trainName = trainName;
		this.source = source;
		this.destination = destination;
		this.ticketPrice = ticketPrice;
	}



	public int getTrainNo() {
		return trainNo;
	}



	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}



	public String getTrainName() {
		return trainName;
	}



	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}



	public String getSource() {
		return source;
	}



	public void setSource(String source) {
		this.source = source;
	}



	public String getDestination() {
		return destination;
	}



	public void setDestination(String destination) {
		this.destination = destination;
	}



	public double getTicketPrice() {
		return ticketPrice;
	}



	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}



	public static void main(String[] args) {
//Train t=new Train("100",);

	}

}
