package Assignment1;

import java.util.Scanner;

public class PrimeNumberSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		
		int n=sc.nextInt();
		sc.close();
		
		for(int j=1;j<=n;j++) 
		{
			int count=1,i=1; 
			
			while(i<=j/2) 
			{
				if(j%i==0)
					count++;
				
				if(count>2)
					break;
				
				i++;
			}
			
			if(count==2)
				System.out.print(j+" ");
		
		}

	}

}
