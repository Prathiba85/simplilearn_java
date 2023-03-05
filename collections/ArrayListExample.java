package collections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] names = {"john","smith","leena","priya"};
		
		System.out.println("The name is "+names[2]);
		
		ArrayList <String> al = new ArrayList<>();
		al.add("john");
		al.add("Smith");
		al.add("priya");
		al.add(1,"mike");
		al.set(1,"madhu");
		
		System.out.println("Size"+al.size());
		System.out.println("First name "+al.get(al.size()-1));
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		
	}

}
