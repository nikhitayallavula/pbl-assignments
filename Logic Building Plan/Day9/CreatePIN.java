

import java.util.Scanner;

public class CreatePIN {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter alpha:");
        int alpha=sc.nextInt();

        System.out.print("Enter beta:");
        int beta=sc.nextInt();

        System.out.print("Enter gamma:");
        int gamma=sc.nextInt();

        int pin=(alpha*beta)+gamma;

        System.out.println("PIN="+pin);

        sc.close();
    }
}