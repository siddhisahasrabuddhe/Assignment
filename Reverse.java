package assignment;

public class Reverse {

	public static void main(String[] args) {
		
		int n = 576, revNum = 0, rem, originalNum;
		
		System.out.println("Number is:"+ n);

        originalNum = n;

        
        while( n != 0 )
        {
            rem = n % 10;
            revNum = revNum * 10 + rem;
            n= n/10;
        }
        System.out.println("Reverse Number is:"+ revNum);
	}

}
