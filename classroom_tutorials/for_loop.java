package classroom_tutorials;

public class for_loop {
	public static void main(String[] args)
	{
		/*for (int num =10;num>0;num-=2)
		{
			//System.out.println(num);
			
		}
		int arr[]= {2,3,4,6,8,9};
		for(int i=0;i<arr.length;i++)
			//System.out.println(arr[i]);*/
		int arr[]= {2,3,4,6,8,9};
		for(int j:arr)
		{
			System.out.println(j);
		}
		
		String name="john";	
		for (int i=0;i<(name.length());i++)
		{
			System.out.println("character at value is :"+name.charAt(i));
		}
		
		char name1[] = name.toCharArray();
		
		String s= "John"; 
		for (int i=name.length()-1;i>=0;i--)
		{
			System.out.println("character at value is :"+s.charAt(i));
		}
	}

}
