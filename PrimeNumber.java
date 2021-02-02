package Assignment1;


public class PrimeNumber {

	public static void main(String[] args) {

		
		for(int j=10;j<=99;j++) 
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
