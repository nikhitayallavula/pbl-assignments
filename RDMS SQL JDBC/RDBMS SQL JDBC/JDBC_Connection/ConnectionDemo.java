import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDemo {

    public static void main(String[] args) {

        try {

            //Class.forName("oracle.jdbc.driver.OracleDriver");

            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            String username = "system";
            String password = "system123";

            Connection con = DriverManager.getConnection(url, username, password);

            System.out.println("Connection Established successfully");

            con.close();

        } catch (Exception e) {

            System.out.println("Connection could not be established");
            System.out.println(e.getMessage());

        }

    }
}