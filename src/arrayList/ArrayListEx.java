package arrayList;

import java.util.ArrayList;

import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {

		List animals=new ArrayList();
		
		animals.add("Akshitha");
		animals.add(10);
		animals.add(100.0);
		
		System.out.println(animals);
		System.out.println(animals.get(2));
		
		animals.add(2,"Puupy");
		System.out.println(animals);
		System.out.println(animals.get(2));
		
		
	}

}
