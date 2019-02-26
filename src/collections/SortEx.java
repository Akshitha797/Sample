package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortEx {

	public static void main(String[] args) {

		ArrayList<String> a=new ArrayList<>();
		a.add("Akshitha");
		a.add("Neelam");
		a.add("Anusha");
		a.add("Preethi");
		
		Collections.sort(a);
		
		Iterator it=a.iterator();
		while(it.hasNext())
			System.out.println(it.next()); 
		
	}

}
