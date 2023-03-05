package classroom_tutorials;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=  {10,20,30,40,50,60};
		System.out.println(arr.length);
		
		
		System.out.println("The value in index  "+arr[0]);
		System.out.println(arr[arr.length-1]);
		String arr1[]= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		System.out.println("Value at third position: "+arr1[2]);
		String str ="Clean world Green world happy";
		
		String arr3[] = str.split(" ");
	
		System.out.println(arr3.length);
		
		String sent ="Clean world Green world happy";
		
		for(int i=0;i<=(sent.length()-1);i++)
		{
			System.out.print(sent
					.charAt(i));
		}
		

	}

}
