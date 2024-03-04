import java.util.Scanner;

class Account{
	// used for account holder 
	private int accountNumber;
	private String name ;
	private double balance ;
	
	// used for bank
	private static int totalAccount;
	private static double totalAmount;
	
	Account(int accountNumber,String name,double balance){
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		
		totalAccount++;
		totalAmount += balance;
	}
	public void deposite(double amount){
		if(amount > 0){
			this.balance +=amount;
			totalAmount += amount;
			System.out.println("Diposite succesful");
		}
		else 
			System.out.println("Enter the valid amount");
	}
	public void withdraw(double amount){
		if(amount<this.balance && amount >0){
			this.balance -= amount;
			totalAmount -= amount;
		}
		else 
			System.out.println("Insufficient amount in your account.");
	}
	public void accountInfo(){
		System.out.println(this.accountNumber+ " "+ this.name + " "+ this.balance);
	}
	
	public static void bankInfo(){
		System.out.println("Total no of account: "+totalAccount);
		System.out.println("Total amount in the bank: "+totalAmount);
		
	}
}

class Bank{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Account h1 = new Account(100,"uttam kumar jena",1200);
		
		System.out.println("Enter the account number : ");
		int ac = sc.nextInt();
		
		System.out.println("Enter your name : ");
		String name = sc.next();
		
		System.out.println("Enter the account amount : ");
		int amt = sc.nextInt();
		
		Account h2 = new Account(ac,name,amt);
		
		h1.accountInfo();
		h2.accountInfo();
		Account.bankInfo();
		
		System.out.println("Enter the amount to be deposited: ");
		double rup = sc.nextDouble();
		
		h2.deposite(rup);
		h2.accountInfo();
		Account.bankInfo();
		
	}
}

















