package Collections.LambdaExpressions;

import java.util.ArrayList;

public class PrimeNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> a1=new ArrayList<>();

        for(int i=1;i<=25;i++){
            a1.add((int)(Math.random()*100)+1);
        }

        System.out.println("Prime Numbers:");

        a1.stream()
          .filter(n->{
              if(n<2)
                  return false;
              for(int i=2;i<=Math.sqrt(n);i++){
                  if(n%i==0)
                      return false;
              }
              return true;
          })
          .forEach(System.out::println);
    }
}