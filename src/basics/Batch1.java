package basics;

public class Batch1 {

	public static void main(String[] args) {
		
		Student s1=new Student();
		
		s1.setName("akshitha");
		s1.setRoll(1);
		s1.setFees(15000);
		s1.setCollege("VJIT");
		
	/*	System.out.println("Details of student1 : ");
		
		System.out.println(s1.getName());
		System.out.println(s1.getRoll());
		System.out.println(s1.getFees());
		System.out.println(s1.getCollege()+"\n");*/
		
		Student s2=new Student();
		
		s2.setName("srujana");
		s2.setRoll(2);
		s2.setFees(15000);
		s2.setCollege("VJIT");
		
		/*System.out.println("Details of student2 : ");
		
		System.out.println(s2.getName());
		System.out.println(s2.getRoll());
		System.out.println(s2.getFees());
		System.out.println(s2.getCollege()+"\n");*/
		
        Student s3=new Student();
		
		s3.setName("akshitha");
		s3.setRoll(3);
		s3.setFees(15000);
		s3.setCollege("CBIT");
		
		/*System.out.println("Details of student3 : ");
		
		System.out.println(s3.getName());
		System.out.println(s3.getRoll());
		System.out.println(s3.getFees());
		System.out.println(s3.getCollege());*/
		
		System.out.println(s1.getCollege());
		System.out.println(s2.getCollege());
		System.out.println(s3.getCollege());
		

	}

}
