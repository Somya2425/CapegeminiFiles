package package2;

public class Bank {
     public void withDraw(int balance, int amount) {
    	 if(amount>balance) {
    		 throw new InsufficientBalanceException("low balance", amount-balance);
    	 }
    	 Account.balance = balance- amount;
    	 System.out.println(amount+ "withdrawn");
     }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
