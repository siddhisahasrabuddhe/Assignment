package assignment;

public class Months {

	public static void main(String[] args) {
		
String months;
int choice=8;
		
		System.out.println("Enter Month: 1->January, 2->February, 3->March, 4->April, 5->May, 6->June, 7->July, 8->August, 9->september, 10->October, 11->November, 12->December");
		
		switch(choice) {
		
		case 1:
			months="January";
			break;
			
		case 2:
			months="February";
			break;
			
		case 3:
			months="March";
			break;
			
		case 4:
			months="April";
			break;
			
		case 5:
			months="May";
			break;
			
		case 6:
			months="June";
			break;
			
		case 7:
			months="July";
			break;
			
		case 8:
			months="August";
			break;
			
		case 9:
			months="September";
			break;
			
		case 10:
			months="October";
			break;
			
		case 11:
			months="November";
			break;
			
		case 12:
			months="December";
			break;
			
			
			
		default:
			months = "Invalid Input";
	        break;
	        
		}
	        
	        System.out.println("You choose "+ months+" Month");

	}

}
