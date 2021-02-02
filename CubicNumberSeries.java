package Assignment1;

import java.util.Scanner;

public class CubicNumberSeries {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		
		int n=sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++)
		{
			int num=i*i*i;
			System.out.print(num+" ");
		}

	}

}
