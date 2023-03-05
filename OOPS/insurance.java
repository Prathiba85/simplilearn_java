package OOPS;

public class insurance extends citizen {
	public int insuranceid;
	public  insurance (){
		System.out.println("This is the constructor of insurance class");
		
	}
	public void print()
	
	{
		super.print();
		System.out.println("Insurance id" +insuranceid);
	}

}
