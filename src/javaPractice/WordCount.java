package javaPractice;

import java.util.HashMap;
import java.util.Map;

public class WordCount {

	public static void main(String[] args) {
		
		String str="Amit Amit I am not well well";
		
		String arr[]= str.split(" ");
		
		Map<String, Integer> map= new HashMap<String, Integer>();
		Integer count=1;
		for(int i=0; i<arr.length;i++)
		{
		
		if(!map.containsKey(arr[i]))
		{
			map.put(arr[i], count);
		}
		else
		{
			map.put(arr[i], map.get(arr[i])+1);
		}
		}
		
		for(String w:map.keySet())
		{
			System.out.println("The count of the word " +w+ "===>" +map.get(w) );
		}

	}

}
