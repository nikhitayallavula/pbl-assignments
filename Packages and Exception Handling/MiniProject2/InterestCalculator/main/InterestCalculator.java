package main;

import java.util.Scanner;

import account.*;
import exception.InvalidInputException;

public class InterestCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("\nMAIN MENU");
            System.out.println("---------");
            System.out.println("1. Interest Calculator - SB");
            System.out.println("2. Interest Calculator - FD");
            System.out.println("3. Interest Calculator - RD");
            System.out.println("4. Exit");

            System.out.print("Enter your option (1..4): ");
            int option = sc.nextInt();

            try {

                switch(option) {

                case 1:

                    System.out.print("Enter Average Amount: ");
                    double sbAmount = sc.nextDouble();

                    if(sbAmount < 0)
                        throw new InvalidInputException("Amount cannot be negative.");

                    System.out.print("Enter Account Type (Normal/NRI): ");
                    String type = sc.next();

                    SBAccount sb = new SBAccount(sbAmount,type);

                    System.out.println("Interest gained : Rs. " + sb.calculateInterest());
                    break;

                case 2:

                    System.out.print("Enter FD Amount: ");
                    double fdAmount = sc.nextDouble();

                    if(fdAmount<0)
                        throw new InvalidInputException("Amount cannot be negative.");

                    System.out.print("Enter Number of Days: ");
                    int days = sc.nextInt();

                    if(days<0)
                        throw new InvalidInputException("Invalid Number of days. Please enter non-negative values.");

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    if(age<0)
                        throw new InvalidInputException("Age cannot be negative.");

                    FDAccount fd = new FDAccount(fdAmount,days,age);

                    System.out.println("Interest gained : Rs. "+fd.calculateInterest());
                    break;

                case 3:

                    System.out.print("Enter Monthly Amount: ");
                    double monthly = sc.nextDouble();

                    if(monthly<0)
                        throw new InvalidInputException("Amount cannot be negative.");

                    System.out.print("Enter Number of Months (6/9/12/15/18/21): ");
                    int months = sc.nextInt();

                    if(months<0)
                        throw new InvalidInputException("Months cannot be negative.");

                    System.out.print("Enter Age: ");
                    age = sc.nextInt();

                    RDAccount rd = new RDAccount(monthly,months,age);

                    System.out.println("Interest gained : Rs. "+rd.calculateInterest());
                    break;

                case 4:

                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice.");
                }

            } catch(InvalidInputException e) {

                System.out.println(e.getMessage());
            }
        }
    }
}