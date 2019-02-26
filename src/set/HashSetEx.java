package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {

		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(25);
		hs.add(12);
		hs.add(25);
		hs.add(89);
		hs.add(17);
		hs.add(67);
		hs.add(72);
		hs.add(7);
		hs.add(null);
		hs.add(null);
		
		System.out.println(hs);
		
		Iterator<Integer> i=hs.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	
	}

}
