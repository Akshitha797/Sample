package set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {

		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(25);
		ts.add(12);
		ts.add(25);
		ts.add(5);
		ts.add(82);
		ts.add(789);
		ts.add(96);
		ts.add(8);
		
		Iterator<Integer> i=ts.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		ts.remove(96);
		System.out.println("After removing :");
		
		Iterator<Integer> i1=ts.iterator();


		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	
	}

}
