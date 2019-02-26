package arrayList;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListToArray {

	public static void main(String[] args) {		
		Scanner s=new Scanner(System.in);
		try {
			FileOutputStream fileOutputStream=new FileOutputStream("F:\\JavaPrograms\\ArrayList.txt");
			System.out.println("Enter the Input :");
			String n=s.next();
			byte[] b=n.getBytes();	
			fileOutputStream.write(b);
			fileOutputStream.close();		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
