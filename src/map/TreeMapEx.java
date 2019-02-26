package map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap=new TreeMap<Integer, String>();
		treeMap.put(100, "Akshitha");
		treeMap.put(101, "Anusha");
		treeMap.put(102, "Neelam");
		treeMap.put(103, "Preethi");
		
		for(Map.Entry m : treeMap.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
