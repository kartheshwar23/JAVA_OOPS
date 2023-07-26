package Module3;

import java.util.Scanner;

public class CurentAccount extends Account {
	Scanner sc=new Scanner(System.in);
	public CurentAccount(String name, int accuntnumber, float amount) {
		super(name, accuntnumber, amount);
		// TODO Auto-generated constructor stub
	}

	int transcount=0;
	int transamount;
	
	@Override
	public  void withdraw(float transamnt) {
		
		transcount++;
		Amount-=transamnt;
		if(transcount>=15) {
			Amount-=30;
		}
		System.out.println(Amount);
		
	}
	@Override
	public  void deposit(float transamnt){
	
		transcount++;
		Amount+=transamnt;
		if(transcount>=2) {
			Amount-=30;
		}
		System.out.println(Amount);
		}
	
}
