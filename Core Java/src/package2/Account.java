package package2;

public class Account {
	static int balance = 1000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Bank  b = new Bank();
        b.withDraw(balance, 500);
        System.out.println(balance);
        b.withDraw(balance, 500);
        System.out.println(balance);
	}

}
