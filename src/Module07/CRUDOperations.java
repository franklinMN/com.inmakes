package Module07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class CRUDOperations {

    private final static String URL = "jdbc:mysql://localhost:3306/jdbcexample";
    private final static String USER_NAME = "root";
    private final static String PASSWORD = "franklin";
    private final static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

    private static Connection conn;
    private static Statement statement;
    private static ResultSet resultSet;
    private static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {

        try{
            //initialising JDBC
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            statement = conn.createStatement();


            
            performCRUD();


        }catch( SQLException exception ){

            exception.printStackTrace();

        }catch( ClassNotFoundException exception ){

            exception.printStackTrace();

        }finally{

            try{ // closing all the resources

                if( statement != null ) statement.close();
                if( resultSet != null ) resultSet.close();
                if( conn != null ) conn.close();
                if( scan != null ) scan.close();
                

            }catch( Exception e ){

                e.printStackTrace();

            }
            
        }
        
    }

    //--------------------- CRUD manager----------------------------------------------------------

    public static void performCRUD() throws SQLException{

        int userChoice = 0;

        while( userChoice != 8 ) {

            System.out.println("-----Performing CRUD operations----- ");
            System.out.println("Please select from the below options: "
                                + "\n1. Create a new table in the database."
                                + "\n2. Insert into data to the table"
                                + "\n3. Read the values from the table"
                                + "\n4. Update the values"
                                + "\n5. Delete the rows from the table"
                                + "\n6. Delete the table"
                                + "\n7. View all the tables in the database"
                                + "\n8. Exit");
            
            userChoice = scan.nextInt();
            scan.nextLine();
            switch (userChoice) {
                case 1: createTable();  // completed
                        break;
                case 2: insertValues();  // completed
                        break;
                case 3: readData();  // completed
                        break;
                case 4: updateValue();  // completed
                        break;
                case 5: deleteRow();  // completed
                        break;
                case 6: deleteTable();  // completed
                        break;
                case 7: allTables();  // completed
                        break;
                case 8: System.out.println("Completed!");
                        return;
                
                default:
                    System.out.println("Invalid Option, try again...!");
            }
        }
        
    }


//---------------------Create Table----------------------------------------------------------


    public static void createTable( ) throws SQLException {

        // String createTableQuery = "CREATE TABLE student ("
        // + "Student_id INT AUTO_INCREMENT PRIMARY KEY,"
        // + "Student_name VARCHAR(100) NOT NULL,"
        // + "Student_place VARCHAR(100),"
        // + "Course VARCHAR(100),"
        // + "Contact_num VARCHAR(20)"
        // + ");";

        String tableName;
        int numberOfCol;
        allTables();
        
        System.out.print("Enter table Name(should not be available in the database): ");
        tableName = scan.nextLine();

        if (tableNameExists(tableName)) {
            System.out.println("Table with the provided name already exists. Please choose a different name.");
            return; // Exit method if table name already exists
        }

        System.out.print("Enter number of Columns in the table: ");
        numberOfCol = scan.nextInt();
        scan.nextLine();

        List<String> columnName = new ArrayList<>();
        List<String> datatypeList = new ArrayList<>();
        List<String> spcList = new ArrayList<>();

        for( int i=0 ; i<numberOfCol ; i++ ){
            
            System.out.print("Enter column " + (i+1) + " name: ");
            columnName.add(scan.nextLine());
            System.out.print("Enter column " + (i+1) + " datatype: ");
            datatypeList.add(scan.nextLine());
            System.out.print("Enter column " + (i+1) + " special conditions: ");
            spcList.add(scan.nextLine());
            System.out.println("-----");
        }

        StringBuilder sqlCreateQuery = new StringBuilder();

        sqlCreateQuery.append("Create table " + tableName + " ( ");
        for( int i=0 ; i<numberOfCol ; i++ ){
            sqlCreateQuery.append(columnName.get(i) + " ")
                            .append(datatypeList.get(i) + " ")
                            .append(spcList.get(i) + " ")
                            .append(",");
        }
        sqlCreateQuery.deleteCharAt(sqlCreateQuery.length() - 1); // delete the last , which is added previously

        sqlCreateQuery.append(" );");
        System.out.println(sqlCreateQuery);

        statement.executeUpdate(sqlCreateQuery.toString());

        System.out.println("Completed!");
    }

    public static boolean tableNameExists( String tableName ) throws SQLException{

        String sql = "show tables like '" + tableName + "'";
        resultSet = statement.executeQuery(sql);
        return resultSet.next();
    }


//---------------------Insert into values ----------------------------------------------------------



    public static void insertValues( ) throws SQLException {

        // INSERT INTO table_name (column1, column2, column3, ...)
        // VALUES (value1, value2, value3, ...);

        String tableName = selectTable();
        String sql = "select * from " + tableName + ";";
        
        String input;

        System.out.println(sql);
        resultSet = statement.executeQuery(sql);
        ResultSetMetaData metaData = resultSet.getMetaData();
        int cols = metaData.getColumnCount();
        String insertSQL = "insert into " + tableName + " ( ";

        for( int i=1 ; i <= cols ; i++ ){
            insertSQL += metaData.getColumnName(i);
            if( i < cols ){
                insertSQL += " , ";
            }
        }

        insertSQL += " ) values ( ";

        for( int i=1 ; i <= cols ; i++ ){
            insertSQL += "?";
            if( i < cols ){
                insertSQL += " , ";
            }
        }

        insertSQL += " )";

        PreparedStatement preparedStatement = conn.prepareStatement(insertSQL);

        for( int i=1 ; i <= cols ; i++ ){
            System.out.print("Enter " + metaData.getColumnName(i) + " : ");
            input = scan.nextLine();
            preparedStatement.setString(i, input);
        }

        int rowsInserted = preparedStatement.executeUpdate();
        System.out.println(rowsInserted + " row(s) inserted successfully.");

        // StringBuilder insertInto = new StringBuilder();
        // StringBuilder values = new StringBuilder();

        // insertInto.append("INSERT INTO " + tableName + " ( ");
        // values.append(" VALUES ( ");

        // for( int i=1 ; i<=metaData.getColumnCount(); i++ ){
        //     System.out.print("Enter " + metaData.getColumnName(i) + " : ");
        //     input = scan.nextLine();

        //     insertInto.append(metaData.getColumnName(i));
        //     values.append(input);

        //     if(i<metaData.getColumnCount()){
        //         insertInto.append(", ");
        //         values.append(", ");
        //     }
        // }
        // insertInto.append(" )");
        // values.append(" )");

        // sql = insertInto.append(values).append(";").toString();
        // System.out.println(sql);

        // statement.executeUpdate(sql);

    }



//---------------------Read the data from Table----------------------------------------------------------



    public static void readData() throws SQLException {
        
        String tableName = selectTable();
        String sql = "Select * from " + tableName + ";";
        System.out.println("QUERY: " + sql);
        resultSet = statement.executeQuery(sql);
        ResultSetMetaData metaData = resultSet.getMetaData();
        System.out.println();
        System.out.println();
        while (resultSet.next()) {
            for( int i=1 ; i<=metaData.getColumnCount() ; i++ ){
                System.out.print( metaData.getColumnName(i) + " : "  + resultSet.getString(i) + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println("Completed!");
    }



//---------------------Update the Table----------------------------------------------------------


    public static void updateValue() throws SQLException {
        String tableName = selectTable();
        String sql = "SELECT * FROM " + tableName + ";";
        System.out.println(sql);
        resultSet = statement.executeQuery(sql);
        ResultSetMetaData metaData = resultSet.getMetaData();

        System.out.println("Columns in the selected table: ");
        for( int i=1 ; i <= metaData.getColumnCount() ; i++ ){
            System.out.println(metaData.getColumnName(i));

        }
        
        System.out.print("Enter the name of the column to update: ");
        String columnNameToUpdate = scan.nextLine();
        
        System.out.print("Enter the value of the column to match: ");
        String matchValue = scan.nextLine();
        
        System.out.print("Enter the name of the column to set: ");
        String columnToSet = scan.nextLine();
        
        System.out.print("Enter the new value for the column: ");
        String newValue = scan.nextLine();
        
        String updateSql = "UPDATE " + tableName + " SET " + columnToSet + " = ? WHERE " + columnNameToUpdate + " = ?";
        
        try (PreparedStatement preparedStatement = conn.prepareStatement(updateSql)) {
            preparedStatement.setString(1, newValue);
            preparedStatement.setString(2, matchValue);
            
            int rowsUpdated = preparedStatement.executeUpdate();
            System.out.println(rowsUpdated + " row(s) updated successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }




//---------------------delete a row from Table----------------------------------------------------------


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



//---------------------delete Table----------------------------------------------------------


    public static void deleteTable() throws SQLException {

        String tableName = selectTable();
        String sql = "DROP TABLE if exists " + tableName + ";";
        System.out.println("QUERY: " + sql);
        statement.executeUpdate(sql);
        System.out.println("Table " + tableName + " deleted successfully.");
        
    }



//---------------------View All Table----------------------------------------------------------


    public static void allTables() throws SQLException {

        String sql = "SHOW TABLES;";
        resultSet = statement.executeQuery(sql);
        System.out.println("QUERY: " + sql);
        while (resultSet.next()) {
            System.out.println(resultSet.getString(1));
        }
    }


//---------------------Select a particular Table----------------------------------------------------------

    public static String selectTable() throws SQLException{

        allTables();
        System.out.println("Select Table name: ");
        String tableName = scan.next();
        scan.nextLine();
        return tableName.trim();
    }
    
}
