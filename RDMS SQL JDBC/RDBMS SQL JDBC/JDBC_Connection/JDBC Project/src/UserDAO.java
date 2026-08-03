import java.sql.*;

public class UserDAO {

   public String[] getNames() {

    String[] names = null;

    try {

        Connection con = DBUtil.getConnection();

        // Get total number of records
        String sql1 = "SELECT COUNT(*) FROM USERS";

        PreparedStatement ps1 = con.prepareStatement(sql1);

        ResultSet rs1 = ps1.executeQuery();

        int count = 0;

        if(rs1.next()) {
            count = rs1.getInt(1);
        }

        // Create array
        names = new String[count];

        // Get all names
        String sql2 = "SELECT NAME FROM USERS";

        PreparedStatement ps2 = con.prepareStatement(sql2);

        ResultSet rs2 = ps2.executeQuery();

        int i = 0;

        while(rs2.next()) {

            names[i] = rs2.getString("NAME");

            i++;
        }

        con.close();

    } catch(Exception e) {
        e.printStackTrace();
    }

    return names;
}
}