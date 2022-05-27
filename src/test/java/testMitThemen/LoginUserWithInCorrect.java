package testMitThemen;

import com.github.javafaker.Faker;
import com.google.common.util.concurrent.FakeTimeLimiter;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class LoginUserWithInCorrect extends TestBase {
    //1. Launch browser
    //2. Navigate to url 'http://automationexercise.com'
    @Test
    public void test01() {
        driver.navigate().to("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        WebElement homePage = driver.findElement(By.xpath("//html"));
        Assert.assertTrue(homePage.isDisplayed());
        //4. Click on 'Signup / Login' button
        WebElement login = driver.findElement(By.xpath("//*[@*='/login']"));
        login.click();
        //5. Verify 'Login to your account' is visible
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Login to your account']")).isDisplayed());
        //6. Enter incorrect email address and password
        Faker faker = new Faker();

        driver.findElement(By.xpath("//*[@*='login-email']")).sendKeys(faker.internet().emailAddress());
        driver.findElement(By.xpath("//*[@*='login-password']")).sendKeys(faker.internet().password());
        //7. Click 'login' button
        driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();

        //8. Verify error 'Your email or password is incorrect!' is visible
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Your email or password is incorrect!']")).isDisplayed());
    }
}