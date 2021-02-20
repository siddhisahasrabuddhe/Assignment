package trainTicket;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TicketApplication {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

System.out.println("Enter The Train Number");
int trNo=sc.nextInt();

DateTimeFormatter df= DateTimeFormatter.ofPattern("dd/MM/yyyy");
System.out.println("Enter The Travel Date");
String date=sc.next();
//LocalDate td= dateInput(date);
//LocalDate ld=LocalDate.parse(date, df);

System.out.println("Enter No of Passenger");
int passNo=sc.nextInt();

for(int i=1;i<=passNo;i++)
{
System.out.println("Enter Age of passenger "+i);
int age=sc.nextInt();
}
for(int i=1;i<=passNo;i++)
{
System.out.println("Enter Gender of passenger"+i);
String gen=sc.next();
}
for(int i=1;i<=passNo;i++)
{
System.out.println("Enter Passenger Name "+i);
String passName=sc.next();
}

 System.out.println("Ticket Booked with PNR:"+Ticket.generatePNR());




	}

	}


