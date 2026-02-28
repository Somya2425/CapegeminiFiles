package ABC;
import java.util.Objects;


class Student{
	
	   int id;
	    String name;
	    
	    Student(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }


	public boolean equal(Object obj) {
		   if (this == obj)
	            return true;
		   if (obj == null)
	            return false;
		   Student other = (Student) obj;
		   return this.id == other.id && Objects.equals(this.name, other.name);

	}
	 public int hashCode() {
	        return Objects.hash(id, name);
	    }
}

public class equals {

    public static void main(String[] args) {

        Student s1 = new Student(1, "Cat");
        Student s2 = new Student(1, "Cat");
        Student s3 = new Student(2, "Sam");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // false
        System.out.println(s1 == s2);       // false 
    }
    
    
}