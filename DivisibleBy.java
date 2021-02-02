package assignment;

public class DivisibleBy {

	public static void main(String[] args) {
		//int num;
		int count=0;
		
		System.out.println("The First 5 Values which are divisible by 2, 3 and 5 are:");
		
		for(int i=1;i<=1000; i++)
		{
			if(i % 2==0 && i % 5==0 && i % 3==0 )
			{
				System.out.println(i);
				count++;
			}
			
			if(count==5)
				break;
		}

	}

}
