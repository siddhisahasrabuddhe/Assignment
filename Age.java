import java.util.Scanner;

public class Age {

	public static void main(String[] args) {

		int n; 
		int child=0, adult=0, senior=0;
		
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter no of ages you want to store: "); 
		n=sc.nextInt();  
		int[] age = new int[10];  
		System.out.println("Enter Ages: ");  
		for(int i=0; i<n; i++)  
		{  
        age[i]=sc.nextInt();  
		}  
		System.out.println("Ages are: ");  
		
		for (int i=0; i<n; i++)   
		{  
		System.out.print(age[i]+" ");  
		} 
		System.out.println("");
		
		for (int i = 0; i < n; i++) {
			if (age[i] < 18) {
				child++;
			} else if (age[i] >= 18 && age[i] <= 54) {
				adult++;

			} else if (age[i] >= 55) {
				senior++;
			}
		}
		System.out.println("Childern:" + child);
		System.out.println("Adult:" + adult);
		System.out.println("Senior Citizen:" + senior);
		
	}

}
