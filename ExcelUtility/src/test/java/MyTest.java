import com.codoid.products.exception.FilloException;
import org.junit.Test;

public class MyTest {
    @Test
    public void displayDataFromExcel() throws FilloException {
        ExcelUtility eu=new ExcelUtility();
        eu.selectFromExcel();

    }

    @Test
    public void updateIntoExcel() throws FilloException {
        ExcelUtility eu1=new ExcelUtility();
        eu1.updateIntoExcel();

    }
    @Test
    public void insertIntoExcel() throws FilloException {
        ExcelUtility eu2=new ExcelUtility();
        eu2.insertIntoExcel();

    }
}
