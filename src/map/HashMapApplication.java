package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashMapApplication {

	public static void main(String[] args) {

		HashMap<Integer,String> hashMap=new HashMap<>();
		hashMap.put(101, "Bob");
		hashMap.put(102, "Alice");
		hashMap.put(103, "Jane");
		
		HashSet<Integer> keys=new HashSet<>(hashMap.keySet());
		Iterator it=keys.iterator();
		while(it.hasNext())
			System.out.println(it.next()); 
		
		HashSet<String> values=new HashSet<>(hashMap.values());
		Iterator it1=values.iterator();	
		while(it1.hasNext())
			System.out.println(it1.next()); 	
	}

}
