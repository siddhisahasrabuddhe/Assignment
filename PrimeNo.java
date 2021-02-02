package assignment;

public class PrimeNo {

	public static void main(String[] args) {
		
		for(int j=2;j<=17;j++) {
	    boolean flag = false;
	    for (int i = 2; i <= j / 2; ++i) {
	      
	      if (j % i == 0) {
	        flag = true;
	        break;
	      }
	    }
		
	    if (!flag)
	      System.out.println(j + " is a prime number.");
	    //else
	      //System.out.println(j + " is not a prime number.");
		 
		}    
}
}
