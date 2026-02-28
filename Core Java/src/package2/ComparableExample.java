package package2;

 class Job implements Comparable<Job> {
    
	String title;
	int priority;
	double salary;
	
	
	Job(String title, int priority, double salary){
		this.title = title;
		this.priority = priority;
		this.salary = salary;
	}
	
	
//	public int compareTo(Job other) {
//		return this.title.compareTo(other, title;)
//	}
	
	public int compareTo(Job other) {
		//System.out.println(this);
		
		return this.priority - other.priority;
	}
	
	public String toString() {
		return title +" | Priority: " + priority+ " |salary: "+ salary;
	}

}

 public class ComparableExample{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}

 