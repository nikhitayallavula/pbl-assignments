import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class QueryDemo2 {

    public static void main(String[] args) {

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            String username = "system";
            String password = "system123";

            Connection con = DriverManager.getConnection(url, username, password);

            Statement stmt = con.createStatement();

            String query = "SELECT EMPNO, ENAME FROM EMP";

            ResultSet rs = stmt.executeQuery(query);

            System.out.println("EMPNO\tENAME");

            while (rs.next()) {

                // By column index
                int empno = rs.getInt(1);

                // By column name
                String ename = rs.getString("ENAME");

                System.out.println(empno + "\t" + ename);
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}