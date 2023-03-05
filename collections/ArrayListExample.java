package collections;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = { "john", "smith", "leena", "priya" };

		System.out.println("The name is " + names[2]);

		ArrayList<String> al = new ArrayList<>();
		al.add("zeho");
		al.add("john");
		al.add("smith");
		al.add("priya");
		al.add(1, "andrew");
		

		System.out.println("Size" + al.size());
		System.out.println("First name " + al.get(al.size() - 1));
		System.out.println(al);
		al.remove(2);
		System.out.println(al);

		for (String a : al)
			System.out.println(a);
		java.util.Iterator<String> t = al.iterator();
		System.out.println("*****Value of iterator ******");
		while (t.hasNext()) {

			System.out.println(t.next());
		}

		Collections.sort(al);

		System.out.println(al);

		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);
	}

}
