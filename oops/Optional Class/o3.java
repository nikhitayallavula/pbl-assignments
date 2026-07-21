import java.util.Optional;

class EmployeeDetails {
    int id;
    String name;

    EmployeeDetails(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class InvalidEmployeeException extends Exception {
    InvalidEmployeeException(String message) {
        super(message);
    }
}

public class o3 {
    public static void main(String[] args) {


        EmployeeDetails emp = new EmployeeDetails(101, "Lakshmi");

        Optional<EmployeeDetails> optionalEmp = Optional.ofNullable(emp);

        try {
            EmployeeDetails e = optionalEmp.orElseThrow(
                () -> new InvalidEmployeeException("Invalid Employee")
            );

            System.out.println("Employee ID: " + e.id);
            System.out.println("Employee Name: " + e.name);

        } catch (InvalidEmployeeException ex) {
            System.out.println(ex.getMessage());
        }
    }
}