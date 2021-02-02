package day4;

public class Sorting {

	public static void main(String[] args) {
		
		int a[]= {7,4,15,12,3,9,6};
		
		System.out.print("Before Sorting: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
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
		System.out.println(" ");
		System.out.print("After Sorting: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}
	

}
