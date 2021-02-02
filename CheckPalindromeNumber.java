package Assignment1;

import java.util.Scanner;

public class CheckPalindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int num=sc.nextInt();
		sc.close();
		int temp=num,rev=0;
		while(num!=0)
		{
			int n=num%10;
			rev=rev*10+n;
			num=num/10;
		}
		if(temp==rev)
			System.out.println("The number is Palindrome");
		else
			System.out.println("The number is not Palindrome");

	}

}
