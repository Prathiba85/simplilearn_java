package collections;

import java.util.HashMap;

public class Map_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Clean world Green World Happy World";
		
		String arr[] = str.split(" ");
		
		HashMap<String , Integer> h = new HashMap();
		int v=0;
		
		for(String a:arr)
		{
			if(h.containsKey(a))
			{
				 v= (int) h.get(a);
				h.put(a,v+1);
			}
			else
			{
				h.put(a,1);
			}
		}
		System.out.println(h);

	}

}
