package myapp.tests.smoketest;
import myapp.pages.RentalHomePage;
import myapp.pages.RentalLoginPage;
import myapp.utilities.BrowserUtils;
import myapp.utilities.Driver;
import myapp.utilities.ExtentReportUtils;
import myapp.utilities.WaitUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Day15_PositiveLoginTest {
    @Test
    public void US100201_Admin_Login(){
//        As admin, I should be able to log in the application
//        https://www.bluerentalcars.com/
//        Admin email: jack@gmail.com
//        Admin password: 12345
        ExtentReportUtils.createTestReport("Admin Login Test" , "smoke test");

//        TEST CASE:
//        go to login page
        ExtentReportUtils.pass("Starting test case...");
        Driver.getDriver().get("https://www.bluerentalcars.com/");
//        click on login link
        RentalHomePage rentalHomePage = new RentalHomePage();
        rentalHomePage.loginLink.click();
        WaitUtils.waitFor(2);
//        enter email, pass, click login button
        RentalLoginPage rentalLoginPage = new RentalLoginPage();
        rentalLoginPage.username.sendKeys("jack1@gmail.com");
        rentalLoginPage.password.sendKeys("12345");
        rentalLoginPage.loginButton.click();
        WaitUtils.waitFor(2);
//        then verify login is successful
//        Assert.assertTrue(rentalHomePage.userID.isDisplayed());ALTERNATIVELY
        BrowserUtils.verifyElementDisplayed(rentalHomePage.userID);
//        click on user id
        rentalHomePage.userID.click();
        WaitUtils.waitFor(2);
//        click on logout
        rentalHomePage.logOut.click();
        WaitUtils.waitFor(2);
//        click on OK
        rentalHomePage.OK.click();
        WaitUtils.waitFor(2);
//        then verify logout is successful
        BrowserUtils.verifyElementDisplayed(rentalHomePage.loginLink);//OR
        BrowserUtils.verifyElementNotDisplayed(rentalHomePage.OK);
        WaitUtils.waitFor(2);
        Driver.closeDriver();
    }
}
