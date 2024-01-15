package javaPractice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the number");
      int num= sc.nextInt();
      int sum=1;
      while(num>0)
      {
    	  sum=sum*num;
    	  num--;
    	  
      }
     System.out.println("Factorial of the number:"+sum);

	}

}
