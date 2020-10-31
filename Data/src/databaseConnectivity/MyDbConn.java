package databaseConnectivity;

import java.sql.*;

public class MyDbConn {
static Connection conn;
    public static void main(String[] args) throws SQLException {

        try{
            String host="jdbc:mysql://localhost:3306/emp";
            String uname="root";
            String upass="admin";

            //1. Db Connection
            conn = DriverManager.getConnection(host,uname,upass);
            //2. Execute Quesry
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery("Select * from Synechron");
            while (rs.next()){
                System.out.println("Name"+rs.getString("name")+"---"+"Location:"+rs.getString("Location")+"Salary:"+rs.getInt("Salary"));
            }



        }catch (Throwable t){
            System.out.println(t.getMessage());

        }finally {
        conn.close();
        }
    }
}
