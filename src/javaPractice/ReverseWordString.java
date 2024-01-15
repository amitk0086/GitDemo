package javaPractice;

public class ReverseWordString {

	public static void main(String[] args) {
		
		String str="Amit Kumar Jaiswal";
		String words[]= str.split(" ");
		String reverseString="";
		
		for(int i=0;i<words.length;i++)
		{
			String word= words[i];
			String reversword="";
			
			for(int j=word.length()-1;j>=0;j--)
			{
				reversword=reversword+word.charAt(j);
			}
			
			reverseString=reverseString+reversword+ " ";
		}
		
		System.out.println(reverseString);
	}

}
