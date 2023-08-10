package myapp.tests.smoketest.excelautomation;
import myapp.utilities.ExcelUtils;
import org.testng.annotations.Test;
import java.util.List;
import java.util.Map;
public class Day16_ExcelAutomation {
    ExcelUtils excelUtils;
    List<Map<String,String>> dataList;
    @Test
    public void appLoginTest(){
        String path = "./resources/mysmoketestdata.xlsx";
        String sheetName = "customer_info";
        excelUtils= new ExcelUtils(path,sheetName);
        dataList=excelUtils.getDataList();
        System.out.println(dataList);
    }
}