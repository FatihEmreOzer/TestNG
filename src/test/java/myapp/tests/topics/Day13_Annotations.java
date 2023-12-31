package myapp.tests.topics;
import org.testng.annotations.*;
public class Day13_Annotations {
    /*
    @Test : creates test case
    @Before and @After : there are 5 Before and 5 After
    Hierarchy : suite > test > group > class > method
    @Ignore : Skip / Ignore the test cases
    @Test(enable=false) : disables the test cases
    @Test(priority=priority number) : prioritized test cases.
    By default, TestNG runs in alphabetical order-NOT FROM TOP TO BOTTOM
    Default priority = 0
     */
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before method...");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class...");
    }
    @BeforeGroups
    public void beforeGroups(){
        System.out.println("Before groups...");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before test...");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before msuite...");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After method...");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After class...");
    }
    @AfterGroups
    public void afterGroups(){
        System.out.println("After groups...");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("After test...");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("After suite...");
    }
    @Test(priority = 3)
    public void test1(){
        System.out.println("Test1");
    }
    @Test @Ignore//ignoring
    public void test2(){
        System.out.println("Test2");
    }
    @Test(enabled = false)//disabling
    public void test3(){
        System.out.println("Test3");
    }
    @Test(priority = 1)
    public void test4(){
        System.out.println("Test4");
    }
    @Test
    public void test5(){
        System.out.println("Test5");
    }
}