import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class ExcelUtility {
Fillo fillo=new Fillo();

String strQuerySelect="Select * from UserData";
String strQueryUpdate="Update UserData set Phone='9999999999' where FirstName='FirstName10' ";
String strQueryInsert="Insert into UserData(FirstName,LastName,Email,Phone) Values('FirstName11','LastName11','FirstName11@test.com','1234567890')";
Recordset rs;
String path="D:\\Automation\\ExcelUtility\\resources\\TestData.xlsx";

    public ExcelUtility() throws FilloException {
    }

    public void selectFromExcel() throws FilloException {
        fillo=new Fillo();
        Connection connection=fillo.getConnection(path);
        rs=connection.executeQuery(strQuerySelect);
        while(rs.next()) {
                System.out.println(rs.getField("FirstName") + "|" + rs.getField("LastName") + "|" + rs.getField("Email") + "|" + rs.getField("Phone"));
            }
      rs.close();
      connection.close();
    }
 public void updateIntoExcel() throws FilloException {
     fillo=new Fillo();
     Connection connection=fillo.getConnection(path);
     connection.executeUpdate(strQueryUpdate);
     connection.close();
     System.out.println("Update Into Excel done");
    }
 public void insertIntoExcel() throws FilloException {
     fillo=new Fillo();
     Connection connection=fillo.getConnection(path);
     connection.executeUpdate(strQueryInsert);
     connection.close();
     System.out.println("Insert Into Excel Done");
 }

}