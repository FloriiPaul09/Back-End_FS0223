package esercizio3;

public class BankException extends Exception{
	
	private final String message;
	
	public BankException(String msg) {
		super(msg);
		this.message = msg;
	}
	
	@Override
	public String toString() {
		return this.message;
	}
}
