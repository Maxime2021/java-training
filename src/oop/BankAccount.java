package oop;

public class BankAccount implements IRate{
	
	//Define variables
	String accountNumber;
	// static >> belongs to the CLASS not the object instance  
	//final >> constant (often static final)
	
	private static final String routingNumber = "013546";
	
	
	//Instance variables 
	private String name;
	private String ssn;
	

	String accountType;
	double balance = 0;
	
	//Constructor  definition: unique methods
	// They are used to define / setup / initialize properties of an object 
	// 2. Constructors are IMPLICITLY  called upon INSTANTIATION 
	// 3. the same name as the class itself
	// 4. Constructors have no return type 
	// 4. Constructors have no return type
	//4. Constructors have no return type

	
	BankAccount() {
		System.out.println("NEW ACCOUNT CREATED");
	}
	//Overloading: Call same method name with different arguments 
	
	BankAccount(String accountType) {
		System.out.println("NEW ACCOUNT: " + accountType);
	}
	
	BankAccount(String accountType, double initDeposit){
		//initDeposit, accountType, msg are all local variables
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("INITIAL DEPOSIT OF: $"+ initDeposit);
		String msg = null;
		if(initDeposit < 1000) {
			msg= "Error: Minimum deposit must be at least $1,000";
			System.out.println(msg);
		}else {
			msg =("Thans for your initial deposit of: $" + initDeposit);
		}
		System.out.println(msg);
		balance = initDeposit;
	}
	
	
	//Getters and Setters
	
	//Allow the user to define the name
	public void setName(String name) {
		this.name = "Mr." + name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	
	//Interface methods
	public void setRate() {
		System.out.println("SETTING RATE");
	}
	
	public void increaseRate() {
		System.out.println("INCREASING RATE");
	}
	
	//Define methods
	//public is visible anywhere in the project 
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	
	//Default modifier is package and is visible anywhere in the package 
		void withdraw(double amount) {
			balance = balance + amount;
			showActivity("WITHDRAW");
		}
	
	//private: Can only be called from within the class
	private void showActivity(String activity) {
			System.out.println("YOUR RECENT TRANSACTION: " + activity);
			System.out.println("YOUR NEW BALANCE IS: $" + balance);
	}
	
	
	
	void checkBalance() {
		System.out.println("Balance: "+ balance);
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[Name: " + name +". ACCOUNT#" +accountNumber +". ROUTING#" + routingNumber + "BALANCE: $" + balance +"]";
	}
}
