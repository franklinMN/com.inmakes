package Module07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class JDBCExample1 {

    public static final String URL = "jdbc:mysql://localhost:3306/jdbcexample";
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "franklin";

    public static void main(String[] args) {
        
        
       try {
            Connection conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            Statement statement = conn.createStatement();

            String query = "select * from Employees;";

            ResultSet rs = statement.executeQuery(query);

            while( rs.next() ){
                System.out.println(
                    "id: " + rs.getInt("id") +
                    " first_name: " + rs.getString("first_name") +
                    " salary: " + rs.getDouble("salary")
                 );
            }

            conn.close();

        } catch (SQLException e) {

            System.out.println(e);
        }
    }

    
}
