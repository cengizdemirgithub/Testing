package testMitThemen;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import utilities.TestBase;

public class ContactFormTest extends TestBase {
    //1. Launch browser
    @Test
    public void test() throws InterruptedException {
        //2. Navigate to url 'http://automationexercise.com'
        driver.navigate().to("http://automationexercise.com");
        //3. Verify that home page is visible successfully
        Assert.assertTrue(driver.findElement(By.xpath("//html")).isDisplayed());
        //4. Click on 'Contact Us' button
        driver.findElement(By.xpath("//*[@*='/contact_us']")).click();

        //5. Verify 'GET IN TOUCH' is visible
        Assert.assertTrue(driver.findElement(By.xpath("(//*[@class='title text-center'])[1]")).isDisplayed());
        //6. Enter name, email, subject and message
        WebElement name = driver.findElement(By.xpath("(//*[@class='form-control'])[1]"));
        name.sendKeys("xya");
        WebElement email = driver.findElement(By.xpath("(//*[@class='form-control'])[2]"));
        email.sendKeys("@mail.com");
        WebElement subject = driver.findElement(By.xpath("(//*[@class='form-control'])[3]"));
        subject.sendKeys("testing");
        WebElement message = driver.findElement(By.xpath("(//*[@class='form-control'])[4]"));
        message.sendKeys("message");

        //7. Upload file
        //Thread.sleep(3000);
        WebElement uploadFile = driver.findElement(By.xpath("//input[@name='upload_file']"));
       JavascriptExecutor jse=(JavascriptExecutor) driver;
       jse.executeScript("window.scrollBy(0,400)");

        uploadFile.sendKeys("C:\\Users\\konta\\IdeaProjects\\MyGithubQA\\src\\trytest.txt");
        //"C:\Users\konta\OneDrive\Desktop\note.txt"
        driver.findElement(By.xpath("//*[@*='btn btn-primary pull-left submit_form']")).click();


        //8. Click 'Submit' button
        WebElement submitButton=driver.findElement(By.xpath("//*[@*='btn btn-primary pull-left submit_form']"));
       submitButton.click();

    }
}