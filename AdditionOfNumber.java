package Assignment1;

import java.util.Scanner;

public class AdditionOfNumber {

	public static void main(String[] args) {
		int sum=0,n;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number");
	  int num=sc.nextInt();
	  
	  sc.close();
	  
	  while(num!=0)
	  {
		  n=num%10;
		  sum=sum+n;
		  num=num/10;
	  }
	  
	  System.out.println(sum);

	}

}
