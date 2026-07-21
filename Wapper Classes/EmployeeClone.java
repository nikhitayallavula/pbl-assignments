class Employee implements Cloneable {

    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    void display() {
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
    }
}

public class EmployeeClone {
    public static void main(String[] args) throws CloneNotSupportedException {

        Employee emp1 = new Employee(101, "John", 50000);

        Employee emp2 = (Employee) emp1.clone();

        // Modify original object
        emp1.id = 102;
        emp1.name = "David";
        emp1.salary = 70000;

        System.out.println("Original Employee");
        emp1.display();

        System.out.println();

        System.out.println("Cloned Employee");
        emp2.display();
    }
}