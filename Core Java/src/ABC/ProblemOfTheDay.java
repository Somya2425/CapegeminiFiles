package ABC;
import java.io.*;
public class ProblemOfTheDay {
	
	
	enum Status {
	    Pending,
	    IN_PROGRESS,
	    COMPLETED
	}

	
	class Task {
	    int id;
	    String description;
	    int priority;
	    Status status;
	    long createdTime;
	}
	
	
	 
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			
//         Math m = new Math();
         //call the readline method of bufferreader class
        try {
        	FileReader f = new FileReader("h");
    		
        }
        catch(Exception e){
        	System.out.println("file not found");
        }
		
        // Reader r = new Reader();  // object cannt be formed because abstaract class
         InputStream input1 = System.in; 
         InputStreamReader input = new InputStreamReader(input1);
         
         BufferedReader br = new BufferedReader(input);
         br.readLine();
         
         
	}

}
