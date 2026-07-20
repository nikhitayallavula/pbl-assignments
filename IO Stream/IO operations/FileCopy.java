
import java.io.*;

public class FileCopy {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter the input file name: ");
            String input = br.readLine();

            System.out.print("Enter the output file name: ");
            String output = br.readLine();

            FileReader fr = new FileReader(input);
            FileWriter fw = new FileWriter(output);

            int ch;

            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }

            fr.close();
            fw.close();

            System.out.println("File is copied.");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}