package Module07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class CRUDOperations {

    private final static String URL = "";
    private final static String USER_NAME = "";
    private final static String PASSWORD = "";
    private final static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

    private static Connection conn;
    private static Statement statement;
    private static ResultSet resultSet;

    private static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {

        try{

            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);

            performCRUD();


        }catch( SQLException exception ){

            exception.printStackTrace();

        }catch( ClassNotFoundException exception ){

            exception.printStackTrace();

        }finally{

            try{

                if( conn != null )
                    conn.close();

            }catch( Exception e ){

                e.printStackTrace();

            }
            
        }
        
    }

    public static void performCRUD() throws SQLException{

        int userChoice = 0;

        while( userChoice != 8 ) {

            System.out.println("-----Performing CRUD operations----- ");
            System.out.println("Please select from the below options: "
                                + "1. Create a new table in the database."
                                + "2. Insert into data to the table"
                                + "3. Read the values from the table"
                                + "4. Update the values"
                                + "5. Delete the rows from the table"
                                + "6. Delete the table"
                                + "7. View all the tables in the database"
                                + "8. Exit");
            
            switch (userChoice) {
                case 1: createTable();
                        break;
                case 2: insertValues();
                        break;
                case 3: readData();
                        break;
                case 4: updateValue();
                        break;
                case 5: deleteRow();
                        break;
                case 6: deleteTable();
                        break;
                case 7: allTables();
                        break;
                case 8: System.out.println("Completed!");
                        return;
                
                default:
                    System.out.println("Invalid Option, try again...!");
            }
        }
        
    }

    public static void createTable( ) {}


    public static void insertValues( ) {}


    public static void readData() throws SQLException {
        
        String tableName = selectTable();

        String sql = "Select * from " + tableName + ";";
        System.out.println("QUERY: " + sql);

        resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            System.out.println(resultSet);
        }
        System.out.println("Completed!");
    }


    public static void updateValue( ) throws SQLException{}


    public static void deleteRow() throws SQLException{

        String tableName = selectTable();
        System.out.println("Enter ID : ");
        int id = scan.nextInt();

        String sql = "delete from " + tableName + " where id = " + id + ";";
        int rowsAffected = statement.executeUpdate(sql);

        if(rowsAffected > 0){
            System.out.println("Row deleted successfully.");
        }else {
            System.out.println("No row deleted or row doesn't exist.");
        }
    }


    public static void deleteTable() throws SQLException {

        String tableName = selectTable();

        String sql = "DROP TABLE " + tableName + ";";
        System.out.println("QUERY: " + sql);
        statement.executeUpdate(sql);
        System.out.println("Table " + tableName + " deleted successfully.");
        
    }


    public static void allTables() throws SQLException {

        String sql = "SHOW TABLES";
        resultSet = statement.executeQuery(sql);
        System.out.println("QUERY: " + sql);

        while (resultSet.next()) {
            System.out.println(resultSet);
        }
    }

    public static String selectTable() throws SQLException{

        allTables();
        System.out.println("Select Table name: ");
        return scan.nextLine();

    }
    
}
