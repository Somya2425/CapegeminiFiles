package package2;

public class InvalidAgeException extends RuntimeException{
     InvalidAgeException(String message){
    	 System.out.println("invalid age entered");
     }
}
