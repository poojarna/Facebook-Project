
public class xBankDriver {
	
	public static void main(String[] args) {
		
		
		xBankAccount account1 = new xBankAccount();
		xBankAccount account2 = new xBankAccount(250);
		
		System.out.println("account1: " + account1);
		System.out.println("account2: " + account2);
		System.out.println();
		
		account1.deposit(250);
		
		System.out.println("account1: " + account1);
		System.out.println("account2: " + account2);
		System.out.println();
		
		if (account1.equals(account2)) {
			System.out.println("The accounts have the same balance.");
		} else {
			System.out.println("The accounts have different balances.");
		}
	}

}
