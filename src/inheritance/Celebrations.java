package inheritance;

public class Celebrations extends Cadbury {
	
	public Celebrations()
	{
		super.display();
		System.out.println("Child");
		
	}

	public void display()
	{
		System.out.println("Celebrations");
	}
	public static void main(String[] args) {
		
		new Celebrations();

	}

}
