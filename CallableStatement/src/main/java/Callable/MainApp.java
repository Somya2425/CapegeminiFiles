package Callable;

public class MainApp {
    public static void main(String[] args) throws Exception {
        EmployeeService service = new EmployeeService();
        service.insertEmployee("user", 788.8);
    }
}
