package StreamAPITask;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeTest {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Rahul", "IT", "Manager", 35, 2, 120000, 4),
                new Employee(2, "Anjali", "HR", "Manager", 40, 5, 150000, 3),
                new Employee(3, "Vikas", "IT", "Developer", 28, 2, 90000, 5),
                new Employee(4, "Sneha", "Finance", "Manager", 30, 1, 130000, 2),
                new Employee(5, "Amit", "IT", "Manager", 45, 10, 200000, 5)
        );

        List<String> result = employees.stream()
                .filter(e->e.getJobTitle().equalsIgnoreCase("Manager"))
                .filter(e-> e.getSalary() >10000)
                .filter(e-> e.getYearsOfExperience() <= 3)

                .sorted(Comparator.comparing(Employee::getYearsOfExperience).reversed()
                        .thenComparing(Employee::getPerformanceRating))

                .map(e -> new StringBuilder(e.getName())
                        .reverse()
                        .toString()
                        .toUpperCase())

                .collect(Collectors.toList());
        System.out.println(result);

    }
}
