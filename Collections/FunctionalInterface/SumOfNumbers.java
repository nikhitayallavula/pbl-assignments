package Collections.FunctionalInterface;

import java.util.ArrayList;
import java.util.function.Function;

public class SumOfNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=1;i<=10;i++)
            list.add(i);

        Function<ArrayList<Integer>,Integer> sum = l -> {
            int s=0;
            for(int n:l)
                s+=n;
            return s;
        };

        System.out.println("Numbers : "+list);
        System.out.println("Sum = "+sum.apply(list));
    }
}