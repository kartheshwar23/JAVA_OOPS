package Module3;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the type of account 1)SavingAccount | 2)CurentAccount");
		int num=sc.nextInt();
		System.out.println("Enter the Name");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.println("Eter the Accunt number");
		int accuntnum=sc.nextInt();
		System.out.println("Enter the initial Amount ");
		float amount=sc.nextInt();
		Account a1;
		if(num==1) {
			 a1=new SBAccount(name,accuntnum,amount);
		}else if(num==2) {
			a1=new CurentAccount(name, accuntnum, amount);
		}
		else {
			System.err.println("Invalid Account type");
			return;
		}
		while(true) {
		System.out.println("Enter transaction type 1) Withdraw | 2) Deposit |3)To quit");
		int transtype=sc.nextInt();
		switch(transtype) {
		case 1:
		{
				System.out.println("Enter amnt to withdraw");
				float amnt=sc.nextFloat();
				a1.withdraw(amnt);
				break;
			}
		case 2:{
			System.out.println("Enter amnt to Deposit");
			float amnt=sc.nextFloat();
			a1.deposit(amnt);
			
			break;
			}
		case 3:{
			System.out.println("***Bye**");
			return;
		}
		default: 
			{System.out.println("Invalid type ");
			break;
			}
		
	}
		}

}
}
