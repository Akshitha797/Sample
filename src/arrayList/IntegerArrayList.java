package arrayList;

import java.util.ArrayList;
import java.util.Iterator;


public class IntegerArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> a=new ArrayList<>();
		
		a.add(12);
		a.add(34);
		
	
		ArrayList<Integer> a1=new ArrayList<>();
		a1.add(75);
		a1.add(67);
		a1.addAll(a);
		
		System.out.println(a1);
		System.out.println(a1.get(2));
		
		Iterator<Integer> iterator=a1.iterator();
		while(iterator.hasNext())
		{
			System.out.println("Element :"+iterator.next());
		}
		
		for(Integer i : a1)
		{
			System.out.println(i);
		}
		
		
		
	}

}
