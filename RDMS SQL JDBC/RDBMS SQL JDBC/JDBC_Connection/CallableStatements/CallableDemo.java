import java.sql.*;

public class CallableDemo {

    public static void main(String args[]) {

        try {

            // Load Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");


            // Connection
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:XE",
                    "system",
                    "system123"
            );


            System.out.println("Database Connected Successfully");


            // Calling Stored Procedure

            String sql = "{call calculate_net_salary(?,?)}";


            CallableStatement cs = con.prepareCall(sql);


            // Get all employees

            Statement st = con.createStatement();


            ResultSet emp = st.executeQuery(
                    "select empno, ename from emp"
            );


            System.out.println("------------------------------------");
            System.out.println("EMPNO\tENAME\tNET SALARY");
            System.out.println("------------------------------------");


            while(emp.next()) {


                int empno = emp.getInt("empno");


                // Input parameter
                cs.setInt(1, empno);


                // Output parameter
                cs.registerOutParameter(2, Types.DOUBLE);


                // Execute procedure

                cs.execute();


                // Get output value

                double netSalary = cs.getDouble(2);



                System.out.println(
                        empno + "\t" +
                        emp.getString("ename") + "\t" +
                        netSalary
                );

            }


            System.out.println("------------------------------------");


            con.close();


        }
        catch(Exception e) {

            e.printStackTrace();

        }

    }

}