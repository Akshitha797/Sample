package arrayList;

import java.util.ArrayList;

public class BooleanArrayList {
	
	public static void main(String[] args) {

		ArrayList<Boolean> a=new ArrayList<>();
		
		a.add(true);
		a.add(false);
		
	
		ArrayList<Boolean> a1=new ArrayList<>();
		a1.add(true);
		a1.add(false);
		a1.addAll(a);
		
		System.out.println(a1);
		System.out.println(a1.get(2));
		
		
	}


}
