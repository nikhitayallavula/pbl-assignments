public class TestEmployee {

    public static void main(String[] args) {

        EmployeeDB db = new EmployeeDB();

        db.addEmployee(new Employee(101,"Rahul","rahul@gmail.com","Male",45000));
        db.addEmployee(new Employee(102,"Priya","priya@gmail.com","Female",50000));

        db.showAllEmployees();

        System.out.println(db.showPaySlip(102));

        db.deleteEmployee(101);

        System.out.println("\nAfter Deletion");

        db.showAllEmployees();
    }
}