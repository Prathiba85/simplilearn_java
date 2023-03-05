package OOPS;

public class citizen extends person {
	public int SSN;
	public citizen()
	{
		System.out.println("This is default constructor of citizen class");
	}
	
	public citizen(String Name, String country,int age,int SSN)
	{
		this.SSN=SSN;
		this.name=name;
		this.country=country;
		this.age=age;
		System.out.println("This is parameterised constructor of citizen constructor");
	}
	
	public void print()
	{
		System.out.println("SSN is "+this.SSN);
	}

}
