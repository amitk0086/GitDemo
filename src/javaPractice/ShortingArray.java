package javaPractice;

import java.util.Arrays;

public class ShortingArray {

	public static void main(String[] args) {

//		int [] arr= {10,12,43,1,5,4};
//		int n= arr.length;
//		
//		System.out.println("Array before sorting"+Arrays.toString(arr));
//		for(int i=0;i<n-1;i++)
//		{
//			for(int j=0;j<n-1;j++)
//			{
//				if(arr[j]>arr[j+1])
//				{
//					arr[j]=arr[j]+arr[j+1];
//					arr[j+1]=arr[j]-arr[j+1];
//					arr[j]=arr[j]-arr[j+1];
//				}
//			}
//		}
//		
//		System.out.println("Array After sorting"+Arrays.toString(arr));
//		
//		System.out.println(arr[arr.length-2]);
		
		
		int arr[]= {10,3,5,6,7};
		int n= arr.length;
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=0; j<n-1;j++)
			{
				if (arr[j]>arr[j+1])
				{
					arr[j]=arr[j]+arr[j+1];
					arr[j+1]=arr[j]-arr[j+1];
					arr[j]=arr[j]-arr[j+1];
				}
			}
			
		}
		
		System.out.println("2nd highest salary     "+arr[arr.length-2]);

		
		

	}

}
