package javaPractice;

public class LargestNumberfromAnArray {

	public static void main(String[] args) {
		
		int a[]= {10,20,40,5,8,50,60};
		int max=a[0]; 
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
           System.out.println("Max valu is "     +max);
	}

//	//Min Number
//		int a[]= {10,20,40,5,8,50,60};
//		
//		int min=a[0];
//		
//		for(int i=1;i<a.length;i++)
//			{
//				if(min>a[i])
//				{
//					min=a[i];
//				}
//			}
//	           System.out.println("Max valu is "     +min);
//	
	//}
}
