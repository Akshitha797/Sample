package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap=new HashMap<Integer, String>();
		hashMap.put(100, "Akshitha");
		hashMap.put(101, "Anusha");
		hashMap.put(102, "Neelam");
		hashMap.put(103, "Preethi");
		
		for(Map.Entry m : hashMap.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
