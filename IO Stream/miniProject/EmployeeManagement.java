import java.io.*;
import java.util.*;

public class EmployeeManagement {

    static final String FILE_NAME = "employees.dat";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\nMain Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addEmployee(sc);
                    break;

                case 2:
                    displayEmployees();
                    break;

                case 3:
                    System.out.println("Exiting the System");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    static void addEmployee(Scanner sc) {

        try {

            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Employee Age: ");
            int age = sc.nextInt();

            System.out.print("Enter Employee Salary: ");
            double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, age, salary);

            ArrayList<Employee> list = new ArrayList<>();

            File file = new File(FILE_NAME);

            if (file.exists()) {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
                list = (ArrayList<Employee>) ois.readObject();
                ois.close();
            }

            list.add(emp);

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(list);
            oos.close();

            System.out.println("Employee Added Successfully.");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void displayEmployees() {

        try {

            File file = new File(FILE_NAME);

            if (!file.exists()) {
                System.out.println("No Employee Records Found.");
                return;
            }

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

            ArrayList<Employee> list =
                    (ArrayList<Employee>) ois.readObject();

            ois.close();

            System.out.println("-----Report-----");

            for (Employee e : list) {
                System.out.println(e);
            }

            System.out.println("-----End of Report-----");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}