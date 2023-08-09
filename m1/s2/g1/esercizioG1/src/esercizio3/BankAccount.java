package esercizio3;

public class BankAccount {
	String owner;
	int numberTransactions;
	final int maxTransactions = 50;
	double amount;
	
	BankAccount(String owner, double amount){
		this.owner = owner;
		this.amount = amount;
		numberTransactions = 0;
	}
	
	void withdraw(double withdrawal) throws BankException {
		try {
			
			if(numberTransactions < maxTransactions) {
				
				amount = amount - withdrawal;
				
				if(amount < 0) {
					throw new BankException("Impossible to withdraw, you don't have enough money");
				} else {
					amount = amount - withdrawal - 0.50;
				}
			}
		}finally {
			numberTransactions++;
		}
	}
	
	double returnAmount() {
		return amount;
	}
}
	

