package Collections.FunctionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PerfectSquareNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<=20;i++)
            list.add(i);

        Predicate<Integer> p = n -> {
            int root=(int)Math.sqrt(n);
            return root*root==n;
        };

        System.out.println("Perfect Square Numbers");

        for(int n:list){
            if(p.test(n))
                System.out.print(n+" ");
        }
    }
}