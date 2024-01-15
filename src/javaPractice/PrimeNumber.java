package javaPractice;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num=4;
		int count=0;
		
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					count++;	
				}
			}
			if(count==2)
			{
				System.out.println("Number is prime Number");
			}
			else
			{
				System.out.println("Number is not prime Number");
			}
		}
		else
		{
			System.out.println("Number is not prime number");
		}

	}

}
