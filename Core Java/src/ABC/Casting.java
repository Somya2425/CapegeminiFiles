package ABC;

class Animals{
	void sound() {
		System.out.println("A");
	}
}

class Dog extends Animals{
	void sound() {
		System.out.println("B");
	}
	void eat() {
		System.out.println("eat");
	}
}

public class Casting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animals a = new Dog();
		a.sound();
	}

}

