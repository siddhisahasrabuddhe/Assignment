package assignment;

public class MinMax {

	public static void main(String[] args) {
		
int a[]= {7,4,15,12,3,9,6};
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Largest No is: "+a[6]);
		System.out.println("Second Largest No is: "+a[5]);
		System.out.println("smallest No is: "+a[0]);
		System.out.println("Largest No is: "+a[1]);

	}
}