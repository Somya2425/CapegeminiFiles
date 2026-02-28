package ABC;

public class Constructor {
	 String name;
     String email;
     int id;
     public Constructor(int id) {
    	 this.id = id;
     }
     public Constructor(String email, String name) {
    	 this.email = email;
    	 this.name = name;
     }
}
     
class 	Main{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor con = new Constructor(4);
		Constructor constructor = new Constructor("nj","h");
        
	}

}
