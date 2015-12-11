package controller;
//STEP 1. Import required packages
import java.sql.*;

public class DataBaseConnection {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/EMP";

    //  Database credentials
    static final String USER = "username";
    static final String PASS = "password";

        void connectToDb() {
            Connection conn = null;
            Statement stmt = null;
            try {
                //STEP 2: Register JDBC driver
                Class.forName("com.mysql.jdbc.Driver");
            } catch (Exception e) {
                //Handle errors for Class.forName
                e.printStackTrace();
            }

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            try {
                conn = DriverManager.getConnection(DB_URL, USER, PASS);

            } catch (SQLException se) {
                //Handle errors for JDBC
                se.printStackTrace();
            }
        }
    // HATA LAHNA LABASS
    // ********************************************************************************//
/**
            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT id, first, last, age FROM Donor";
            ResultSet rs = stmt.executeQuery(sql);

            }
            //STEP 6: Clean-up environment
            rs.close();
            stmt.close();
            conn.close();

        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(stmt!=null)
                    stmt.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");
    }//end main
**/
}