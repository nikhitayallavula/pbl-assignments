package Collections.DateTimeAPI;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class ExperienceCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Joining Date (yyyy-mm-dd): ");
        LocalDate joiningDate = LocalDate.parse(sc.nextLine());

        LocalDate today = LocalDate.now();

        Period experience = Period.between(joiningDate, today);

        System.out.println("\nExperience");
        System.out.println("Years  : " + experience.getYears());
        System.out.println("Months : " + experience.getMonths());
        System.out.println("Days   : " + experience.getDays());

        sc.close();
    }
}