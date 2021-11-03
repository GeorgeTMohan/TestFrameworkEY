package Day16;

import java.sql.*;
             //DML - Data Manipulation Languages
public class Dbhandling_DML {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        Class.forName("com.mysql.cj.jdbc.Driver"); //this line means that we are registering the driver for this script for accessing mysql database
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "admin10");

        if (con != null) {
            System.out.println("Connection is established");
        } else {
            System.out.println("Connection is not established");
        }

        Statement stmt = con.createStatement();
      stmt.executeUpdate("Update mydb.emp set empName = 'George' where empName is 'Max' ");






            }
        }


