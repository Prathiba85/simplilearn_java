package OOPS;

public class runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /*employee emp1 = new employee();
       emp1.name="prathiba";
       emp1.empid =1000;
       emp1.dispalyname();
     
       employee emp2 = new employee();
       emp2.name="Sri";
       emp2.empid =1001;
       emp2.dispalyname();
     
       employee emp3 = new employee("Rohan",5002);
       emp3.dispalyname();
       employee.display_salary();*/
       System.out.println("******CT1 *****");
       citizen ct1=new citizen();
       ct1.SSN=5425;
       ct1.age=35;
       ct1.name ="prabhu";
       ct1.country="Australia";
       ct1.print();
       System.out.println("******CT2 *****");
       citizen ct2=new citizen("Shiva","US",40,52601);
       ct2.print();
       System.out.println("******Insurance *****");
       insurance ins =new insurance();
       ins.SSN=999;
       ins.insuranceid=3000;
       ins.print();
       ct2.print();
       
       icici c =new icici();
       
       ChromeBrowser obj= new ChromeBrowser();
       
       EncapsulationExample e = new EncapsulationExample();
       e.setSalary(50000);
System.out.println("Salary is : "+e.getSalary());       
	}

}
