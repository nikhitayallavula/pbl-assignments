package Collections.StreamAPI;

import java.util.ArrayList;

public class StudentFilter {

    public static void main(String[] args){

        ArrayList<Student> list=new ArrayList<>();

        list.add(new Student(1,"Akhila",90));
        list.add(new Student(2,"Rahul",45));
        list.add(new Student(3,"Priya",80));
        list.add(new Student(4,"Kiran",55));
        list.add(new Student(5,"Ravi",35));

        long count=list.stream()
                .filter(s->s.getMark()>=50)
                .peek(System.out::println)
                .count();

        System.out.println("Students Passed : "+count);
    }
}