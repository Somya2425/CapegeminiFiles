package ABC;

public class Abstraction {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();
		a.takeId();

	}

}

abstract class A{
	
	abstract public void takeName();
	abstract public void takeId();
	
}

class B extends A{
	public void takeName() {
		System.out.println("Take name");
	}
	
	public void takeId() {
		System.out.println("Take id");
	}
}