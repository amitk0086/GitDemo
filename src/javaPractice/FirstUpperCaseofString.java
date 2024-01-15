package javaPractice;

public class FirstUpperCaseofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "Amit Kumar Jaiswal";
		String[] arr=str.split(" ");
		String AfterUppercase="";
		for (String w: arr)
		{
			String first=w.substring(0, 1);
			String afterfirst= w.substring(1);
			AfterUppercase=AfterUppercase+first.toUpperCase()+afterfirst+" ";
		}
		
		
		System.out.println(AfterUppercase);
		
		
	}

}
