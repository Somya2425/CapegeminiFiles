package package2;

public class CheckAge {
    public void check(int age) {
    	if(age<18) {
    		throw new InvalidAgeException("less than 18");
    	}
    	System.out.println("go on....you can vote");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
