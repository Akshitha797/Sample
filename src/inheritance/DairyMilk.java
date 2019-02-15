package inheritance;

public class DairyMilk extends Celebrations {
	
	public DairyMilk()
	{
		System.out.println("subchild");
		super.display();
		
	}

	public static void main(String[] args) {
	
        DairyMilk d= new DairyMilk();
        d.show();
	}

}
