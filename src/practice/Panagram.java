package practice;

import java.util.HashSet;
import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		HashSet hs=new HashSet<>();
		
		for (int i = 0; i < s.length(); i++) {
			hs.add(s.charAt(i));
		}
		
		if(hs.size()==27)
			System.out.println("Pangram");
		else
			System.out.println("Not Pangram");
	}

}
