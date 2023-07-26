package Module3;

public abstract class Account {
	
	String Name;
	int Accuntnumber;
	float Amount=5000f;
	
	
	public Account(String name, int accuntnumber, float amount) {
		super();
		this.Name = name;
		this.Accuntnumber = accuntnumber;
		
		this.Amount = amount;
		
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAccuntnumber() {
		return Accuntnumber;
	}
	public void setAccuntnumber(int accuntnumber) {
		Accuntnumber = accuntnumber;
	}
	public float getAmount() {
		return Amount;
	}
	public void setAmount(float amount) {
		
		this.Amount = amount;
		
	}
	
	public abstract void deposit(float amount); 
	
	public abstract void withdraw(float amount);
	
}
