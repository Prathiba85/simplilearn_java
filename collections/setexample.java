package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;



public class setexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
HashSet <String > h = new HashSet<String>();

h.add("Jake");
h.add("Lilly");
h.add("Naina");
h.add("Naina");


System.out.println(h);

// convert set to list
ArrayList<String> st = new ArrayList (h);

TreeSet <String> set2 = new TreeSet<String>();
set2.add("Zen");
set2.add("Julie");
set2.add("Andrew");
System.out.println(set2);




	}

}
