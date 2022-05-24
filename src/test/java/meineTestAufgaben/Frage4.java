package meineTestAufgaben;

import com.google.common.util.concurrent.FakeTimeLimiter;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class Frage4 extends TestBase {
    @Test
    public void name() {
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
        //3. Click on 'Signup / Login' button
        WebElement clickSignup = driver.findElement(By.xpath("//a[@href='/login']"));
        clickSignup.click();
        //4. Verify 'New User Signup!' is visible
        WebElement newUser = driver.findElement(By.xpath("(//h2)[3]"));
        Assert.assertTrue(newUser.isDisplayed());
        //5. Enter name and email address
        WebElement name = driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
        WebElement email = driver.findElement(By.xpath("(//input[@placeholder='Email Address'])[2]"));
        name.sendKeys("Ali");
        email.sendKeys("Haydar@Rüzgar");

        //6. Click 'Signup' button
        WebElement signup = driver.findElement(By.xpath("//button[text()='Signup']"));
        signup.click();
        //7. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        WebElement accountInfo = driver.findElement(By.xpath("(//h2[@class='title text-center'])[1]"));
        Assert.assertTrue(accountInfo.isDisplayed());
        //8-antworted
        //9. Fill details: Title,Password, Date of birth
        WebElement titlemale = driver.findElement(By.xpath("//input[@id='id_gender1']"));
        WebElement titlefemale = driver.findElement(By.xpath("//input[@id='id_gender2']"));
        titlemale.click();

        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("1234");
        WebElement select = driver.findElement(By.xpath("//select[@id='days']"));
        //Select select_=new Select(select);hocanin cözümü
        //select_.selectByIndex(3);hocanin cözümü
        select.click();
        WebElement option = driver.findElement(By.xpath("//option[@value='1'][1]"));
        option.click();
        //10. Select checkbox 'Sign up for our newsletter!'
        //11. Select checkbox 'Receive special offers from our partners!'
        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        //13. Click 'Create Account button'
        //14. Verify that 'ACCOUNT CREATED!' is visible
        //15. Click 'Continue' button
        //16. Verify that 'Logged in as username' is visible
        //17. Click 'Delete Account' button
        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
    }
}
