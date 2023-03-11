package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Integer> basket = new HashMap<>();
		
		basket.put("Item1",1);
		basket.put("Item2",2);
		basket.put("Item3",3);
		basket.put("Item4",2);
		basket.put("Item3",2);
		basket.remove("Item2");
		basket.put("Item5", null);
	
		basket.put(null,6);
		System.out.println(basket);
		
		for(String item:basket.keySet())
		{
			System.out.println("Item name is :"+item +"  Value is "+basket.get(item) );
		}
		
		
		System.out.println("*********Iterating through value********");
		for(Integer value :basket.values())
		{
			System.out.println("The value "+value );
		}
		
		
	}

}
