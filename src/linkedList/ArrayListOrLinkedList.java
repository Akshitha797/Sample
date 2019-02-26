package linkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListOrLinkedList {

	public static void main(String[] args) {

		LinkedList<Integer> ll=new LinkedList<Integer>();
		
		for(int i=0;i<10e5;i++)
			ll.add(i);
		
		System.out.println("In progress......");
		long start=System.currentTimeMillis();
		
		for(int i=0;i<10e5;i++)
			ll.add(i);
		long end=System.currentTimeMillis();
		
		System.out.println("Time taken for linkedList:"+(end-start));
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for(int i=0;i<10e5;i++)
			al.add(i);
		
		System.out.println("In progress......");
		long start1=System.currentTimeMillis();
		
		for(int i=0;i<10e5;i++)
			al.add(i);
		long end1=System.currentTimeMillis();
		
		System.out.println("Time taken for ArrayList:"+(end1-start1));
	
		
	}

}
