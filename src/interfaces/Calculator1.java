package interfaces;

public class Calculator1 implements Operations{
	
	public static void main(String args[])
	{
		Calculator1 c=new Calculator1();
		c.add(20,30 );
		c.sub(40,25);
	}

	@Override
	public void add(int a,int b) {
		
		System.out.println(a+b);
	}

	@Override
	public void sub(int a,int b) {
		
		System.out.println(a-b);
		
	}

}

