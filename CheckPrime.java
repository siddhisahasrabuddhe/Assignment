package assignment;

public class CheckPrime {

		
		public static void main(String[] args) {
			
			
		    
			
			int j=65;
			boolean flag = false;
		    for (int k = 2; k <= j / 2; ++k) {
		      
		      if (j % k == 0) {
		        flag = true;
		        break;
		      }
		    }
			
		    if (!flag)
		      System.out.println(j + " is a prime number.");
		    else
			      System.out.println(j + " is not a prime number.");
		   
			 
			}    

	}

