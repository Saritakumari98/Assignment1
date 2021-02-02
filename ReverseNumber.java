package Assignment1;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num=sc.nextInt();
		sc.close();
		while(num!=0)
		{
			int n=num%10;
			rev=rev*10+n;
			num=num/10;
		}
		System.out.println(rev);

	}

}
