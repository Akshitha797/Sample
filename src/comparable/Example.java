package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Example {

	public static void main(String[] args) {

		ArrayList<Student> a=new ArrayList<>();
		a.add(new Student(1,"Akshitha",21));
		a.add(new Student(2,"Anusha",19));
		a.add(new Student(3,"Neelam",24));
		
		Collections.sort(a);
		
		for(Student st : a)
		{
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
		
	}

}
