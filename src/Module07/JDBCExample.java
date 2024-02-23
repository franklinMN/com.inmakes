package Module07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {
    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/jdbcexample";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "franklin";

    public static void main(String[] args) {
        // Establishing a connection
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            System.out.println("Connected to the database!");

            // Creating a statement
            try (Statement statement = connection.createStatement()) {
                // Executing a query
                String query = "SELECT * FROM Employees";
                try (ResultSet resultSet = statement.executeQuery(query)) {
                    // Processing the result set
                    while (resultSet.next()) {
                        int id = resultSet.getInt("id");
                        String first_name = resultSet.getString("first_name");
                        double salary = resultSet.getInt("salary");

                        System.out.println("ID: " + id + ", First Name: " + first_name + ", Salary: " + salary);
                    }
                }
            }
        } catch (SQLException e) {
            System.err.println("Error connecting to the database: " + e.getMessage());
        }
    }
}

