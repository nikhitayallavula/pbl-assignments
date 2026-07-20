package Collections.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeFilter {

    public static void main(String[] args){

        ArrayList<Employee> list=new ArrayList<>();

        list.add(new Employee(101,"Akhila",22,"Pune"));
        list.add(new Employee(102,"Rahul",24,"Hyderabad"));
        list.add(new Employee(103,"Priya",23,"Pune"));
        list.add(new Employee(104,"Kiran",25,"Delhi"));
        list.add(new Employee(105,"Ravi",26,"Pune"));

        List<Employee> result=list.stream()
                .filter(e->e.getLocation().equals("Pune"))
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}