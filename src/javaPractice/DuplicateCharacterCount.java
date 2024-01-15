package javaPractice;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterCount {

	public static void main(String[] args) {
		
		String str1= "Amit Jaiswal Amit";
		String str =str1.replaceAll(" ", "");
		char[] ch=str.toCharArray();
		Integer count=1;
		Map<Character, Integer> map= new HashMap();
		  for(int i=0; i<ch.length; i++) 
		  {
			  if(!map.containsKey(ch[i]))
			  {
				  map.put(ch[i], count);
			  }
			  else
			  {
				  map.put(ch[i], map.get(ch[i])+1);
			  }
		  }
		  
		  for(Character c:map.keySet())
		  {
			  if(map.get(c)>1)
			  {
				  System.err.println("count of charcher   "  +c+ "   is  "+map.get(c));
			  }
		  }

	}

}
