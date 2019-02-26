package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Search {
	
	Scanner s=new Scanner(System.in);
	
	public ArrayList input()
	{
		ArrayList a=new ArrayList();
		
		System.out.println("Enter the no of elements :");
		int n=s.nextInt();
		
		for(int i=0;i<n;i++)
		{
			a.add(s.nextInt());
		}
		
		return a;
		
	}
	
	public int inputNum()
	{
		System.out.println("Enter the element to search :");
		int num=s.nextInt();
		return num;
	}
	
	public static void search(ArrayList a,int num)
	{	
	System.out.println(a.contains(num));	
	}

	public static void main(String[] args) {

		Search se=new Search();
		search(se.input(),se.inputNum());
		
	}

}
