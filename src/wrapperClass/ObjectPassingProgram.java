package wrapperClass;

import java.util.Scanner;

import basics.Student1;

public class ObjectPassingProgram {
	
	Scanner sc=new Scanner(System.in);
	Student1 s=new Student1();
	

	public static void main(String[] args) {

		//Student1 s1=new Student1();
		ObjectPassingProgram ob=new ObjectPassingProgram();
		//s1=ob.accept();
		//ob.display(s1);
		ob.display(ob.accept());
		
	}
	
	public void display(Student1 s)
	{
		System.out.println(s.getName());
		System.out.println(s.getRoll());
		System.out.println(s.getFees());
		
	}
	public Student1 accept()
	{
		
		System.out.println("Enter the name :");
		s.setName(sc.next());
		
		System.out.println("Enter the roll number :");
		s.setRoll(sc.nextInt());
		
		System.out.println("Enter the fees");
		s.setFees(sc.nextDouble());
		
		return s;
	}

}
