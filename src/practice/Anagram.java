package practice;

import java.util.Scanner;
import java.util.TreeSet;

public class Anagram {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		TreeSet s=new TreeSet<>();
		String str1=sc.next();
		
		for (int i = 0; i < str1.length(); i++) {
			s.add(str1.charAt(i));
		}
		
		TreeSet s1=new TreeSet<>();
		String str2=sc.next();
		for (int i = 0; i < str2.length(); i++) {
			s1.add(str2.charAt(i));
		}
		
		if(s.equals(s1))
			System.out.println("Yes, two strings are anagram");
		else
			System.out.println("No, two strings are not anagram");
			
		
	}

}
