import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class QueryDemo {

    public static void main(String[] args) {

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            String username = "system";
            String password = "system123";

            Connection con = DriverManager.getConnection(url, username, password);

            Statement stmt = con.createStatement();

            String query = "SELECT e_id, first_name, salary, designation FROM employee WHERE salary > 45000 AND salary < 78000";

            ResultSet rs = stmt.executeQuery(query);

            System.out.println("ID\tNAME\tSALARY\tDESIGNATION");

            while (rs.next()) {

                System.out.println(
                        rs.getInt("e_id") + "\t" +
                        rs.getString("first_name") + "\t" +
                        rs.getDouble("salary") + "\t" +
                        rs.getString("designation")
                );
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}