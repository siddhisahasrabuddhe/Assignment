package day4;

public class LinearSearch {

	public static void main(String[] args) {
		
		int a[]= {2,6,11,9,6,23};
		
		int count=1;
		int number=23;
		
		for(int i=0;i<a.length;i++)
		{
			if(number==a[i]) 
			{
				System.out.println("Element is found at position "+ count);
			}
			else
			{
				count++;
				System.out.println("Element is not found");
			}
		}
	}

}
