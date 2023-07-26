package Module3;

import java.util.Scanner;

public  class SBAccount extends Account {
	
	Scanner sc=new Scanner(System.in);
	int roi=4;
	public SBAccount(String name, int accuntnumber, float amount) {
		super(name, accuntnumber, amount);
		// TODO Auto-generated constructor stub
	}
	@Override
	public  void withdraw(float transmnt) {
		Amount-=transmnt;
		System.out.println("Balance amount ="+Amount+roi);
	}
	@Override
	public  void deposit(float transmnt){
		Amount+=transmnt;
		System.out.println("Balance amount ="+Amount+roi);
	}

}
