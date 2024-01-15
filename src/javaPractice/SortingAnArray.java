package javaPractice;

import java.util.Arrays;

public class SortingAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {10,12,4,3,5,2,1,7,45};
		
		System.out.println("Array before sorting "+Arrays.toString(arr));
		for(int i=0;i<arr.length; i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					arr[j]=arr[j]+arr[j+1];
					arr[j+1]=arr[j]-arr[j+1];
					arr[j]=arr[j]-arr[j+1];
				
				}
			}
		}
		System.out.println("Array After sorting "+Arrays.toString(arr));
	}

}
