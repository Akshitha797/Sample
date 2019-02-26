package linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {

		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(25);
		ll.add(12);
		ll.add(86);
		ll.addFirst(28);
		
		Iterator<Integer> i=ll.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
