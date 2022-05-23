package meineTestAufgaben;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Frage4 extends TestBase {
    @Test
    public void name() {
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
        //3. Click on 'Signup / Login' button
        WebElement clickSignup=driver.findElement(By.xpath("//a[@href='/login']"));
        clickSignup.click();
        //4. Verify 'New User Signup!' is visible
        WebElement newUser=driver.findElement(By.xpath("(//h2)[3]"));
        Assert.assertTrue(newUser.isDisplayed());
        //5. Enter name and email address
        WebElement name=driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
        WebElement email=driver.findElement(By.xpath("(//input[@placeholder='Email Address'])[2]"));
        name.sendKeys("Ali");
        email.sendKeys("Haydar@Rüzgar");

        //6. Click 'Signup' button
        WebElement signup=driver.findElement(By.xpath("//button[text()='Signup']"));
        signup.click();
        //7. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        WebElement accountInfo=driver.findElement(By.xpath("(//h2[@class='title text-center'])[1]"));
        Assert.assertTrue(accountInfo.isDisplayed());
    }
}
