import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the file name: ");
            String fileName = sc.nextLine();

            System.out.print("Enter the character to be counted: ");
            char ch = Character.toLowerCase(sc.next().charAt(0));

            File file = new File(fileName);
            Scanner fileReader = new Scanner(file);

            int count = 0;

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine().toLowerCase();

                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == ch) {
                        count++;
                    }
                }
            }

            fileReader.close();

            System.out.println("File '" + fileName + "' has " + count +
                    " instances of letter '" + ch + "'.");

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        sc.close();
    }
}