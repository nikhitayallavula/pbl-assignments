import java.util.Scanner;

class Patient {

    String patientName;
    double height;
    double weight;

    Patient(String patientName, double height, double weight) {
        this.patientName = patientName;
        this.height = height;
        this.weight = weight;
    }

    double computeBMI() {
        return weight / (height * height);
    }
}

public class Main1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Height (in meters): ");
        double height = sc.nextDouble();

        System.out.print("Enter Weight (in kg): ");
        double weight = sc.nextDouble();

        Patient p = new Patient(name, height, weight);

        System.out.printf("BMI = %.2f%n", p.computeBMI());

        sc.close();
    }
}