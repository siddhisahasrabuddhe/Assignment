package assignment;

import java.util.Scanner;

public class NumberFound {
	
	public static void main(String[] args) {

		int arr[]= {1,4,2,9,7,6,11,87,67};
		
		System.out.println("Enter num:");
        int num;
        int flag=0;
        Scanner scan= new Scanner(System.in);
        num=scan.nextInt();
        for(int i=0;i<arr.length;i++) {
       	if(arr[i]==num) {
       		System.out.println(i+1);
       		flag=1;
       	}
       	 
       	}
       	 
	
        if(flag==0) {
       	System.out.println("-1");
	}


	}

}
