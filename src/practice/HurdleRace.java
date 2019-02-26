package practice;

import java.util.Scanner;

public class HurdleRace {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of hurdles :");
		int n=sc.nextInt();
		System.out.println("Enter maximum height :");
		int k=sc.nextInt();
		
		int[] arr=new int[n];
		
		System.out.println("Enter the hurdles :");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int max=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		
		if(max>k)
			System.out.println(max-k);
		else if(max==k || max<k)
			System.out.println(0);
	}

}
