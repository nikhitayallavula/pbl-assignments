import java.util.*;

public class EmployeeVector {

    public static void main(String[] args) {

        Vector<Employee1> v = new Vector<>();

        v.add(new Employee1(101,"Rahul",45000));
        v.add(new Employee1(102,"Priya",50000));
        v.add(new Employee1(103,"Kiran",60000));

        System.out.println("Using Iterator");

        Iterator<Employee1> itr = v.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("\nUsing Enumeration");

        Enumeration<Employee1> e = v.elements();

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}