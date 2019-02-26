package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Position {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the no of elements :");
		int n=s.nextInt();
		
		ArrayList a=new ArrayList();
		
		for (int i = 0; i <n; i++) {
			
			a.add(s.nextInt());			
		}
		
		System.out.println("Enter the element :");
		int num=s.nextInt();
		
		System.out.println(a.indexOf(num));
		
		
	}

}
