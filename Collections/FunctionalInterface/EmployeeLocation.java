package Collections.FunctionalInterface;

import java.util.ArrayList;
import java.util.function.Function;

public class EmployeeLocation {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101,"Ram","Hyderabad",25000));
        list.add(new Employee(102,"Ravi","Chennai",35000));
        list.add(new Employee(103,"Kiran","Delhi",45000));
        list.add(new Employee(104,"Anu","Mumbai",28000));
        list.add(new Employee(105,"Priya","Bangalore",50000));

        Function<Employee,String> fun = emp -> emp.getLocation();

        ArrayList<String> locations = new ArrayList<>();

        for(Employee e : list){
            locations.add(fun.apply(e));
        }

        System.out.println(locations);
    }
}