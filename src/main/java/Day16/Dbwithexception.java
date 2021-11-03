package Day16;

import java.sql.*;

public class Dbwithexception {

    public static void main(String[] args) throws ClassNotFoundException, SQLException, myProjectexception {

        //MySQL DATABASE
        Class.forName("com.mysql.cj.jdbc.Driver"); //this line means that we are registering the driver for this script for accessing mysql database
        Connection con = null;
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "admin10");
            }catch(Exception e){
                System.out.println(e.toString());
            }

            if (con != null) {
                System.out.println("Connection is established");
            }else{
                throw new myProjectexception("not able to connect.please try again");
            }

            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery("Select * from my "); //select query is all read part. update and delete(manipulation) are all different code

            //code for reading values when there is a lot of columns to read from the database(data)

            //result set basically stores the value in each row(column wise also). the column names and column types and all are stored in metadata
            //for reading values along with the name of the columns and rows, we need to combine the metadata and result set.

            ResultSetMetaData metaData = result.getMetaData();
            int columnCount = metaData.getColumnCount();

            while (result.next()) {
                for (int iCol = 1; iCol <= columnCount; iCol++) {
                    String columnName = metaData.getColumnLabel(iCol);
                    String rowValue = result.getString(iCol);
                    System.out.println(columnName + "<<<>>>" + rowValue);
                }

                //to read the values from the database and view it.the below method is hardcoded value.
                //while(result.next()){
                //System.out.println(result.getString(""));
                //System.out.println(result.getString(""));}
                }

                con.close();
            }


        }




