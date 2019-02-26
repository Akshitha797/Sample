package arrayList;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import basics.Student1;

public class Example {
	
	static int count=1;
	public static Student1 getInfo()
	{
		
		Scanner s=new Scanner(System.in);
		
		Student1 student=new Student1();
		System.out.println("Enter the details of Student "+count+" :");
		System.out.println("Enter the name :");
		student.setName(s.next());
		System.out.println("Enter the roll number :");
		student.setRoll(s.nextInt());
		System.out.println("Enter fees :");
		student.setFees(s.nextDouble());
		count++;
		
		return student;	
	}

	public static void main(String[] args) {
		
		ArrayList<Student1> st=new ArrayList<>();
		st.add(getInfo());
		st.add(getInfo());
		
		System.out.println(st);
		
		try {
			FileOutputStream fileOutputStream=new FileOutputStream("F:\\JavaPrograms\\Student1.txt");
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(st);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}
