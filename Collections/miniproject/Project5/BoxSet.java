import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class BoxSet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Box> set = new LinkedHashSet<>();

        System.out.print("Enter the number of Box: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter the Box " + i + " details");

            System.out.print("Enter Length: ");
            double length = sc.nextDouble();

            System.out.print("Enter Width: ");
            double width = sc.nextDouble();

            System.out.print("Enter Height: ");
            double height = sc.nextDouble();

            set.add(new Box(length, width, height));
        }

        System.out.println("\nUnique Boxes in the Set are");

        for (Box b : set) {
            System.out.printf("Length =%.1f Width =%.1f Height =%.1f Volume =%.2f%n",
                    b.getLength(),
                    b.getWidth(),
                    b.getHeight(),
                    b.getVolume());
        }

        sc.close();
    }
}