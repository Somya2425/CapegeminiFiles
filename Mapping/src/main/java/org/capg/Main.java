package org.capg;



import org.capg.dao.StudentDAO;
import org.capg.dao.StudentDAOImp;
import org.capg.repository.Repository;

public class Main {

    public static void main(String[] args) {

        StudentDAO dao = new StudentDAOImp();

        dao.saveData();
        dao.fetchLaptopFromStudent(1);
        dao.fetchStudentFromLaptop(1);

        dao.updateLaptopBrand(1, "HP");

        dao.updateStudentCourse(1, "Spring Boot");

        dao.changeLaptopForStudent(1, 2);

        dao.removeLaptopFromStudent(1);

        dao.deleteStudentAndLaptop(1);

    }
}
