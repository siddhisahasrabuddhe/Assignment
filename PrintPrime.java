package assignment;

public class PrintPrime {
	
public static void main(String[] args) {
		
	System.out.println("Prime number between 10-99 are:");
		for(int j=10;j<=99;j++) {
	    boolean flag = false;
	    for (int k = 2; k <= j / 2; ++k) {
	      
	      if (j % k == 0) {
	        flag = true;
	        break;
	      }
	    }
		
	    if (!flag)
	      System.out.print(j+" ");
	   
		 
		}    
}

}
