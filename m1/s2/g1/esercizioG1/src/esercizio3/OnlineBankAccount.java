package esercizio3;

public class OnlineBankAccount extends BankAccount{

	double maxWithdraw;
	
	OnlineBankAccount(String owner, double amount, double maxWithdraw){
		
		super(owner, amount);
		this.maxWithdraw = maxWithdraw;
		
	}
	
	void printAmount() {
		
		System.out.println("Owner: " + owner + " amount: " + amount + 
				" number of transactions: " + numberTransactions + 
				" maximum amount of transactions: " + maxTransactions +
				" maximum amount of withraw is: " + maxWithdraw);
		
	}
	
	void withdraw(double withdrawal) throws BankException{
		if (withdrawal <= maxWithdraw) {
			super.withdraw(withdrawal);
		} else {
			throw new BankException("Impossible to withdraw");
		}
	}
	
	
}
