package javaPractice;

public class SumofArrayNumber {

	public static void main(String[] args) {
		
		int arr[]= {4,5,3,7,6,9,0,6};
		int sum=0;
		
		for(int i=0; i<=arr.length-1;i++)
		{
			sum=sum+arr[i];
		}
		
		System.out.println("Sum of element an array  " +sum);
	}

}
