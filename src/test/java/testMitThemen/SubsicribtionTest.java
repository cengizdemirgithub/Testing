package testMitThemen;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.awt.*;
import java.awt.event.KeyEvent;

public class SubsicribtionTest extends TestBase {
    @Test
    public void subscrTest() throws AWTException {
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.navigate().to("http://automationexercise.com");
        // Scroll down to footer
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_END);


        //Verify text 'SUBSCRIPTION'
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Subscription']")).isDisplayed());
        //Enter email address in input and click arrow button
        driver.findElement(By.id("susbscribe_email")).sendKeys("-@mail.kom");
        driver.findElement(By.xpath("//*[@*='fa fa-arrow-circle-o-right']")).click();
        //Verify success message 'You have been successfully subscribed!' is visible
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='You have been successfully subscribed!']")).isDisplayed());


    }
}
