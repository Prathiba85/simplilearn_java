package OOPS;

public class employee {
	public String name;
	public int empid;
	private static int salary = 50000;
	employee ()
	{
		this.name = name;
		this.empid = empid;
		System.out.println("Default constructor");
	}
	
	employee (String name, int empid)
	{
		this.name = name;
		this.empid = empid;
		System.out.println("Parameterised constructor");
	}
	public void dispalyname()
	{
		System.out.println("Name of employee is "+name);
	}
	
	public static void display_salary()
	{
		System.out.println("Salary of emplyee "+salary);
		
	}

}
