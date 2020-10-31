package databaseConnectivity;

import java.sql.*;

public class WriteIntoDb {
static Connection conn;
    public static void main(String[] args) throws SQLException {

        try{
            String host="jdbc:mysql://localhost:3306/emp";
            String uname="root";
            String upass="admin";

            //1. Db Connection
            conn = DriverManager.getConnection(host,uname,upass);
            //2. Execute Quesry
            PreparedStatement prep = conn.prepareStatement("insert into synechron values('Ram','Pune',20000)");
            prep.executeUpdate();


        }catch (Throwable t){
            System.out.println(t.getMessage());

        }finally {
        conn.close();
        }
    }
}
