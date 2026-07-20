public class Employee1{

    int id;
    String name;
    float salary;

    Employee1(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return id + " " + name + " " + salary;
    }
}