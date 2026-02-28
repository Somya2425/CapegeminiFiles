package StreamAPITask;
import java.util.*;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Rahul", "IT", "Manager", 30, 3, 80000, 7),
                new Employee(2, "Anjali", "HR", "Lead", 40, 6, 110000, 9),
                new Employee(3, "Vikas", "IT", "Developer", 28, 2, 65000, 6),
                new Employee(4, "Sneha", "Finance", "Analyst", 32, 4, 120000, 5),
                new Employee(5, "Amit", "IT", "Manager", 45, 10, 150000, 4)
        );

        List<Integer> result = employees.stream()
                .filter(e -> e.getYearsOfExperience() <= 5 && e.getPerformanceRating() < 8 && e.getSalary() >= 6000 && e.getSalary() <= 120000)
                .sorted(Comparator
                        .comparing(Employee::getSalary)  // ascending
                        .thenComparing(
                                Comparator.comparing(Employee::getYearsOfExperience)
                                        .reversed()))  // descending
                .map(e -> e.getId() * 10)
                .collect(Collectors.toList());
        System.out.println(result);

    }
}
