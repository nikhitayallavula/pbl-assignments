import java.sql.*;

public class DBUtil {

    public static Connection getConnection() {

        Connection con = null;

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:XE",
                    "system",
                    "system123");

        } catch(Exception e) {
            e.printStackTrace();
        }

        return con;
    }
}