package Collections.FunctionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeSalaryFilter {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101,"Ram","Hyderabad",8000));
        list.add(new Employee(102,"Ravi","Delhi",12000));
        list.add(new Employee(103,"Kiran","Chennai",7000));
        list.add(new Employee(104,"Priya","Mumbai",15000));
        list.add(new Employee(105,"Anu","Bangalore",9000));

        Predicate<Employee> p = emp -> emp.getSalary()<10000;

        System.out.println("Employees having salary less than 10000");

        for(Employee e:list){
            if(p.test(e))
                System.out.println(e.getName());
        }
    }
}