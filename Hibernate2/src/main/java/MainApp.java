import com.capg.dao.StudentDAO;
import com.capg.dao.StudentDAOImp;
import com.capg.entity.Student;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAOImp();

        //dao.save(new Student(1, "Rahul", "CSE", 21, 85.5));
        //dao.save(new Student(2, "Ananya", "ECE", 20, 90.2));
        //dao.save(new Student(3, "Karan", "CSE", 22, 75.8));

       // List<Student> allStudents = dao.fetchAll();
        //System.out.println("All Students:");
        //allStudents.forEach(System.out::println);

      //  System.out.println(dao.fetchById(1));
     //   dao.updateMarks(1, 95.0);
      //  System.out.println(dao.fetchById(1));

       // dao.sortByMarks().forEach(System.out::println);

      //  dao.sortByAgeDesc().forEach(System.out::println);
        dao.delete(3);
        dao.fetchAll().forEach(System.out::println);





    }
}
