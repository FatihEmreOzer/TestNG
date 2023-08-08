package myapp.tests.topics;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;
public class Day14_Assertions {
    @Test
    public void hardAssertion(){
        /*
        HARD ASSERTION : if hard assertion fails, then STOP execution for that test case
         */
        System.out.println("line 8");
        assertTrue(true);//PASS SO CONTINUE
        System.out.println("line 12");
        assertEquals("apple","orange");//FAILS SO STOP
        System.out.println("line 15");
    }
    @Test
    public void softAssertion(){
        /*
        SOFT ASSERT : if soft assertion fails, then CONTINUE execution for that test case
         */
        System.out.println("line 19");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(true);//PASS SO CONTINUE
        System.out.println("line 23");
        softAssert.assertEquals("apple","orange");//FAIL SO CONTINUE
        System.out.println("line 25");
        softAssert.assertAll("Test Assertion Completed");//assertAll MUST BE USED FOR CORRECT TEST RESULT
    }
    @Test
    public void javaAssertion(){
        /*
        java assertions are hard assertions. if assert fails then STOPS
        We should prefer to use TestNG assertions
        if java assertion fails, then STOP execution for that test case
         */
        System.out.println("line 35");
        assert 3<5; // if(...) assertion TRUE then continue, otherwise throw java.lang.AssertionError
        System.out.println("line 37");
        assert "apple"=="apple";
        assert "apple".toLowerCase().contains("e");
    }
}