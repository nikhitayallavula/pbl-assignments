import java.sql.*;

public class DAOClass {

    Connection con;

    // Constructor
    public DAOClass() {

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            String username = "system";
            String password = "system123";

            con = DriverManager.getConnection(url, username, password);

            System.out.println("Database Connected Successfully");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    // INSERT
    public void insert(int rollno, String name, String course, String dob, int fee) {

        try {

            String sql = "insert into Student values(?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, rollno);
            ps.setString(2, name);
            ps.setString(3, course);
            ps.setDate(4, Date.valueOf(dob));
            ps.setInt(5, fee);

            int rows = ps.executeUpdate();

            if(rows > 0)
                System.out.println("Record Inserted Successfully");
            else
                System.out.println("Insertion Failed");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void delete(int rollno) {

        try {

            String sql = "delete from Student where rollno=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, rollno);

            int rows = ps.executeUpdate();

            if(rows > 0)
                System.out.println("Record Deleted Successfully");
            else
                System.out.println("Record Not Found");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    // MODIFY
    public void modify(int rollno, int fee) {

        try {

            String sql = "update Student set fee=? where rollno=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, fee);
            ps.setInt(2, rollno);

            int rows = ps.executeUpdate();

            if(rows > 0)
                System.out.println("Record Updated Successfully");
            else
                System.out.println("Record Not Found");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    // DISPLAY ONE
    public void display(int rollno) {

        try {

            String sql = "select * from Student where rollno=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, rollno);

            ResultSet rs = ps.executeQuery();

            if(rs.next()) {

                System.out.println("-------------------------------------");
                System.out.println("Roll No : " + rs.getInt("rollno"));
                System.out.println("Name    : " + rs.getString("name"));
                System.out.println("Course  : " + rs.getString("course"));
                System.out.println("DOB     : " + rs.getDate("dob"));
                System.out.println("Fee     : " + rs.getInt("fee"));
                System.out.println("-------------------------------------");

            } else {

                System.out.println("Record Not Found");
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    // DISPLAY ALL
    public void displayAll() {

        try {

            String sql = "select * from Student";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            System.out.println("----------------------------------------------------------");
            System.out.printf("%-8s %-15s %-15s %-15s %-8s\n",
                    "ROLLNO","NAME","COURSE","DOB","FEE");
            System.out.println("----------------------------------------------------------");

            while(rs.next()) {

                System.out.printf("%-8d %-15s %-15s %-15s %-8d\n",
                        rs.getInt("rollno"),
                        rs.getString("name"),
                        rs.getString("course"),
                        rs.getDate("dob"),
                        rs.getInt("fee"));
            }

            System.out.println("----------------------------------------------------------");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void closeConnection() {

        try {

            if(con != null)
                con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}