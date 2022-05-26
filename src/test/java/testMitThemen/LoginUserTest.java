package testMitThemen;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class LoginUserTest extends TestBase {
    @Test
    public void LoginTest() {
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.navigate().to("http://automationexercise.com");
        //3. Verify that home page is visible successfully
        WebElement home = driver.findElement(By.xpath("(//a[@href='/'])[2]"));
        Assert.assertTrue(home.isDisplayed());
        // String actualUrl =driver.getCurrentUrl();
        //Assert.assertEquals(urlExpected,actualUrl);


        //4. Click on 'Signup / Login' button
        WebElement login = driver.findElement(By.xpath("//a[@href='/login']"));
        login.click();

        //5. Verify 'Login to your account' is visible
        WebElement loginWriter = driver.findElement(By.xpath("//*[text()='Login to your account']"));
        Assert.assertTrue(loginWriter.isDisplayed());
        //6. Enter correct email address and password
        WebElement email = driver.findElement(By.xpath("//*[@*='email']"));
        email.sendKeys("@mail.com");
        WebElement password = driver.findElement(By.xpath("//*[@*='password']"));
        password.sendKeys("124");
        //7. Click 'login' button
        WebElement login2 = driver.findElement(By.xpath("//*[text()='Login']"));
        login2.click();

    }
}
