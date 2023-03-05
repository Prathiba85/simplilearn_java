package classroom_tutorials;

public class reverse {
	public static void main(String[] args)
	{
		/*
	}
		String s= "racecar"; 
		String result ="";
		for (int i=s.length()-1;i>=0;i--)
		{
			result = result+s.charAt(i);
			
		}
		System.out.println("reversed string is  :"+result);
		
		if (result.equalsIgnoreCase(s))
			System.out.println("it is palindrome");
		else
		
			
			
			System.out.println("It is not palindrome");
		
		*/
		//Reverse String
		
		String str2= "David meets John and Liliy";
		String[] st=str2.split(" ");
		String result1="";
		
		
		
		
		for(int i=st.length-1;i>=0;i--)
		{
			
			result1 =result1 +st[i];
			result1 =result1+" ";
		}
		System.out.println(result1.trim());
	
	}

}
