package assignment;

public class Color {

	public static void main(String[] args) {
		
		String choice= "R", color;
		
		System.out.println("Enter your Choice: R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White");
		
		switch(choice) {
		
		case "R":
			color="Red";
			break;
			
		case "B":
			color="Blue";
			break;
			
		case "G":
			color="Green";
			break;
			
		case "O":
			color="Orange";
			break;
			
		case "Y":
			color="yellow";
			break;
			
		case "W":
			color="White";
			break;
			
		default:
	        color = "Invalid Code";
	        break;
	        
		}
	        
	        System.out.println("You choose "+ color+" Color");
			
		
		

	}

}
