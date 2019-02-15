package abstractClass;

public class Aeroplane extends Flyable{

	public static void main(String[] args) {
		
        Flyable f=new Aeroplane();
        f.display();
        f.show();
        f.start();
		
	}

	@Override
	public void display() {
          System.out.println("display");		
	}

	@Override
	public void show() {
         System.out.println("show");		
	}

}
