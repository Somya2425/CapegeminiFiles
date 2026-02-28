package Thread;

public class BankAccount {

    int balance = 1000;

    public synchronized void withdraw (int amount) throws InterruptedException {

        System.out.println(Thread.currentThread().getName() + " entered withdraw");
        System.out.println(Thread.currentThread().getName() + " acquired lock");

        if(balance<amount){
            System.out.println(" insufficient balance...");
            System.out.println(Thread.currentThread().getName() + " is going to wait");

            wait();

            System.out.println(Thread.currentThread().getName() + " get notified and reacquired lock");
        }
        balance = balance - amount;
        System.out.println(Thread.currentThread().getName() + " completed withdrawal");
        System.out.println(" remaining balance " + balance);
    }

    public synchronized void deposit(int amount){
        System.out.println(Thread.currentThread().getName() + " entered deposit");
        System.out.println(Thread.currentThread().getName() + " acquired lock");

        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited amount");
        System.out.println(" updated balance " + balance);

        notify();
        System.out.println(Thread.currentThread().getName() + " sent notify signal");

        System.out.println(Thread.currentThread().getName() + " releasing lock");
    }


}
class ss{
    public static void main(String[] args){
         BankAccount b = new BankAccount();
         b.deposit(34);
    }
}
