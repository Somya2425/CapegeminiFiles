package org.capg.dao;



import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import org.capg.entity.Laptop;
import org.capg.entity.Student1;
import org.capg.repository.Repository;

public class StudentDAOImp implements StudentDAO {

    @Override
    public void saveData() {

        EntityManager em = Repository.getEntityManager();
        em.getTransaction().begin();

        Laptop laptop = new Laptop();
        laptop.setBrand("Dell");
        laptop.setPrice(65000);

        Student1 student = new Student1();
        student.setName("Anant");
        student.setCourse("Java Full Stack");

        // bi-directional mapping
        student.setLaptop(laptop);
        laptop.setStudent(student);

        em.persist(laptop);
        em.persist(student);

        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void fetchLaptopFromStudent(int studentId) {

        EntityManager em = Repository.getEntityManager();

        Student1 student = em.find(Student1.class, studentId);
        if (student != null && student.getLaptop() != null) {
            System.out.println(student.getLaptop());
        } else {
            System.out.println("Student or Laptop not found");
        }

        em.close();
    }

    @Override
    public void fetchStudentFromLaptop(int laptopId) {

        EntityManager em = Repository.getEntityManager();

        Laptop laptop = em.find(Laptop.class, laptopId);
        if (laptop != null && laptop.getStudent() != null) {
            System.out.println(laptop.getStudent());
        } else {
            System.out.println("Laptop or Student not found");
        }

        em.close();
    }

    @Override
    public void updateLaptopBrand(int laptopId, String newBrand) {

        EntityManager em = Repository.getEntityManager();
        em.getTransaction().begin();

        Laptop laptop = em.find(Laptop.class, laptopId);
        if (laptop != null) {
            laptop.setBrand(newBrand);
        }

        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void updateStudentCourse(int studentId, String newCourse) {

        EntityManager em = Repository.getEntityManager();
        em.getTransaction().begin();

        Student1 student = em.find(Student1.class, studentId);
        if (student != null) {
            student.setCourse(newCourse);
        }

        em.getTransaction().commit();
        em.close();
    }

    public void changeLaptopForStudent(int studentId, int newLaptopId) {

        EntityManager em = Repository.getEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();

            Student1 student = em.find(Student1.class, studentId);

            if (student == null) {
                System.out.println("Student Not Found");
                tx.rollback();
                return;
            }

            // Find existing laptop
            Laptop newLaptop = em.find(Laptop.class, newLaptopId);

            // If laptop does not exist, create new one
            if (newLaptop == null) {
                newLaptop = new Laptop();
                newLaptop.setBrand("RandomBrand_" + newLaptopId);
                newLaptop.setPrice(50000);

                em.persist(newLaptop);
                System.out.println("New Laptop Created and Saved");
            }

            // Remove old laptop mapping (if any)
            Laptop oldLaptop = student.getLaptop();
            if (oldLaptop != null) {
                oldLaptop.setStudent(null);
            }

            // Set new laptop
            student.setLaptop(newLaptop);
            newLaptop.setStudent(student);

            tx.commit();
            System.out.println("Laptop changed successfully");

        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    @Override
    public void removeLaptopFromStudent(int studentId) {

        EntityManager em = Repository.getEntityManager();
        em.getTransaction().begin();

        Student1 student = em.find(Student1.class, studentId);

        if (student != null && student.getLaptop() != null) {
            Laptop laptop = student.getLaptop();
            student.setLaptop(null);
            laptop.setStudent(null);
        }

        em.getTransaction().commit();
        em.close();
    }
    @Override
    public void deleteStudentAndLaptop(int studentId) {

        EntityManager em = Repository.getEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();

            Student1 student = em.find(Student1.class, studentId);

            if (student == null) {
                System.out.println("Student Not Found");
                tx.rollback();
                return;
            }

            Laptop laptop = student.getLaptop();

            // Step 1: break relationship manually
            if (laptop != null) {
                laptop.setStudent(null);
                student.setLaptop(null);
            }

            // Step 2: delete Laptop first (FK safe)
            if (laptop != null) {
                em.remove(laptop);
            }

            // Step 3: delete Student
            em.remove(student);

            tx.commit();
            System.out.println("Student and Laptop deleted successfully");

        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
}
