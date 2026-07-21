import java.util.Scanner;

class Person{
    String name;
    Person(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
    void setName(String name){
        this.name=name;
    }
}
class Employee extends Person{
    double salary;
    int joining;
    String insurance;
    Employee(String name,double salary,int joining,String insurance){
        super(name);
        this.salary=salary;
        this.joining=joining;
        this.insurance=insurance;
    }
    double getSalary(){
        return salary;
    }
    void setSalary(double salary){
        this.salary=salary;
    }
    int getJoining(){
        return joining;
    }
    void setJoining(int joining){
        this.joining=joining;
    }
    String getInsurance(){
        return insurance;
    }
    void setInsurance(String insurance){
        this.insurance=insurance;
    }
}
public class TestEmployee{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        double salary1=sc.nextDouble();
        int joining1 = sc.nextInt();
        sc.nextLine();
        String insurance1=sc.nextLine();
        Employee emp = new Employee(name1,salary1, joining1, insurance1);
        System.out.println("Employee Details: ");
        System.out.println("Name: "+emp.getName());
        System.out.println("Salary: "+emp.getSalary());
        System.out.println("Joining Year: "+emp.getJoining());
        System.out.println("Insurance Number: "+emp.getInsurance());
        sc.close();
    }
}
