package assignment;
import java.util.Scanner;

public class Que5 {

	public static void main(String[] args) {
		
		int a, num, sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number:");
        a = scan.nextInt();
        while(a > 0)
        {
            num = a % 10;
            sum = sum + num;
            a = a/ 10;
        }
        System.out.println("Sum of Digits:"+sum);

	}

}
