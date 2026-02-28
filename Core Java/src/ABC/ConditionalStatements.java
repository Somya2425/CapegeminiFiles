package ABC;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 2;

        if (num % 2 == 0) {
            System.out.println("Even number");
        } 
        else {
            System.out.println("Odd number");
        }
        
        switch(num) {
        case 1:
        	System.out.println("no. is 1");
         	break;
        
	    case 2:
       	    System.out.println("no. is 2");
      	    break;
     	 
     	default:
     		System.out.println("no. not present");
     		
        }
        
	}

}
