package basics;

public class Bank {
	int accNo;
	int balance;
	
	public Bank()
	{
		this(100,2000);
		System.out.println("Constructor called");
		
	}
	
	public Bank(int accNo, int balance)
	{

		this.accNo=accNo;
		this.balance=balance;
		System.out.println(accNo+" "+balance);

	}

	public static void main(String[] args) {
		
		Bank b1=new Bank();
		Bank b2=new Bank(30,500);
		Bank b3=new Bank();
        
	
	}

}
