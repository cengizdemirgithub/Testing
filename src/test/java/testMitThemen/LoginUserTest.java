package testMitThemen;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class LoginUserTest extends TestBase {
    @Test
    public void LoginTest() {
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.navigate().to("http://automationexercise.com");
        //3. Verify that home page is visible successfully
        String urlExpected="http://automationexercise.com";
       // String actualUrl =driver.getCurrentUrl();
        //Assert.assertEquals(urlExpected,actualUrl);



        //4. Click on 'Signup / Login' button
        //5. Verify 'Login to your account' is visible
        //6. Enter correct email address and password
        //7. Click 'login' button
        //8. Verify that 'Logged in as username' is visible
        //9. Click 'Delete Account' button
        //10. Verify that 'ACCOUNT DELETED!' is visible
    }
}
