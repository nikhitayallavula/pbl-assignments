

import java.util.Scanner;

public class WeightOfHillPattern {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number of rows:");
        int rows=sc.nextInt();

        int weight=0;

        for(int i=1;i<=rows;i++){

            for(int j=1;j<=i;j++){
                System.out.print("* ");
                weight++;
            }

            System.out.println();
        }

        System.out.println("Weight of Hill Pattern = "+weight);

        sc.close();
    }
}