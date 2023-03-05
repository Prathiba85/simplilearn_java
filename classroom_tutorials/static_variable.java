package classroom_tutorials;

public class static_variable {
	static int s =200;
	
	public static void main (String[] args)
	{
		s=s+250;
		check();
		
	}
	
public static void check()
{
	System.out.println(s);
}

}
