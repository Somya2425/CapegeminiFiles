package ABC;

 class wrapper{
	private int id;
	private String name;
	
	public void setId(int ID) {
		this.id = ID;
	}
	
	public int getId() {
		return id;
	}
	
}
public class Encapsulation{
	public static void main(String[] args) {
		
		wrapper m = new wrapper();
		m.setId(10);
		
	}
	
}
