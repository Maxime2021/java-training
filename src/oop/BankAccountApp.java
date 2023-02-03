package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		//Creating a new Bank Account >> think instanciate an object
		//With encapsulation: public API methods
		
		BankAccount acc1 = new BankAccount();
		acc1.setName("Mark Zuckerberg");
		System.out.println(acc1.getName());
		acc1.setSsn("23454532334");
		System.out.println("SSN: " + acc1.getSsn());
		
		acc1.accountNumber = "19993349";
		
		acc1.balance = 10000;
		acc1.setRate();
		acc1.increaseRate(); 
		
		
		acc1.deposit(1500);
		
		// Polymorphism through overriding
		System.out.println(acc1.toString());
		
		BankAccount acc2 = new BankAccount("Checking Account");
		
		BankAccount acc3 = new BankAccount("Checking Account", 5000);
		acc3.accountNumber = "0049943";
		
		
		/*
		 * acc3.checkBalance();
		 //Demo for inheritance 
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate= "4.5";
		cd1.name = "Juan";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compount();*/
	}

}
