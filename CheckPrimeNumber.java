package Assignment1;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		
		int count=1,i=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		
		int n=sc.nextInt();
		sc.close();
		while(i<=n/2) 
		{
			if(n%i==0)
				count++;
			if(count>2)
				break;
			
			i++;
		}
		
		if(count==2)
			System.out.println("Prime Number");
		else
			System.out.println("Not a Prime Number");
		

	}

}
