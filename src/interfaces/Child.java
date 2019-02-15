package interfaces;

public class Child implements Father,Mother {
	public void name()
	{
		System.out.println("Hello!!!");
	}

	public static void main(String[] args) {
		
		Child c=new Child();
		c.name();

	}

}
