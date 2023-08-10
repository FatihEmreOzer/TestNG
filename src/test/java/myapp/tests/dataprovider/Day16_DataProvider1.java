package myapp.tests.dataprovider;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Day16_DataProvider1 {
    //    Data source
    @DataProvider
    public Object[][] customerData(){
        Object [][] customerInfo={
                {"sam.walker@bluerentalcars.com","c!fas_art"},
                {"kate.brown@bluerentalcars.com","tad1$Fas"},
                {"raj.khan@bluerentalcars.com","v7Hg_va^"},
                {"pam.raymond@bluerentalcars.com","Nga^g6!"}
        };
        return customerInfo;
    }
    @Test(dataProvider = "customerData")
    public void test1(String username, String password){
        System.out.println("Username : "+username+" | Password : "+password);
    }
}
