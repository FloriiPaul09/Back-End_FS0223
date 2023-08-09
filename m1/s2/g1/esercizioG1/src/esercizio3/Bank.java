package esercizio3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bank {

	private static final Logger logger = LoggerFactory.getLogger(Bank.class);
	
	public static void main(String[] args) {
		
		BankAccount account1 = new BankAccount("Mark Rem", 30000.0);
		
		System.out.println("Amount: " + account1.returnAmount());
		
		try {
			
			account1.withdraw(100.0);
			
			System.out.println("Amount: " + account1.returnAmount());
		
		}catch (BankException ex){
			logger.error("Error during the withdrawal..." + ex, ex);
			ex.printStackTrace();
		}
	}

}
