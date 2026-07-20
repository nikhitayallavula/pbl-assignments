import java.util.*;

public class EmployeeRegister {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Employee> list = new ArrayList<>();

        System.out.print("Enter the Number of Employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nEnter Employee " + i + " Details:");

            System.out.print("Enter the First Name: ");
            String firstName = sc.nextLine();

            System.out.print("Enter the Last Name: ");
            String lastName = sc.nextLine();

            System.out.print("Enter the Mobile Number: ");
            String mobile = sc.nextLine();

            System.out.print("Enter the Email: ");
            String email = sc.nextLine();

            System.out.print("Enter the Address: ");
            String address = sc.nextLine();

            list.add(new Employee(firstName, lastName, mobile, email, address));
        }

        Collections.sort(list);

        System.out.println("\nEmployee List:");
        System.out.format("%-15s %-15s %-15s %-30s %-15s%n",
                "Firstname", "Lastname", "Mobile", "Email", "Address");

        for (Employee e : list) {
            System.out.format("%-15s %-15s %-15s %-30s %-15s%n",
                    e.getFirstName(),
                    e.getLastName(),
                    e.getMobile(),
                    e.getEmail(),
                    e.getAddress());
        }

        sc.close();
    }
}