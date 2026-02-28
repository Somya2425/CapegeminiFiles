package package2;

public class InsufficientBalanceException extends RuntimeException {
	int amount ;
	InsufficientBalanceException(String message, int amount){
		
		super(message);
		this.amount = amount;
		System.out.print(amount);
	}

}
