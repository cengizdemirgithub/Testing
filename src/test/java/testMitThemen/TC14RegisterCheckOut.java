package testMitThemen;

import com.github.dockerjava.api.model.Driver;
import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;

public class TC14RegisterCheckOut extends TestBase {
    @Test
    public void TC14() {
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
        //3. Verify that home page is visible successfully

        //4. Add products to cart
        List<WebElement> productList = new ArrayList<WebElement>();
        WebElement contionueShopping = driver.findElement(By.xpath("//*[text()='Continue Shopping']"));
        int userProductNum = 5;
        for (int i = 1; i <= userProductNum; i++) {
            productList.add(i - 1, driver.findElement(By.xpath("//a[@data-product-id='" + i + "']")));
            productList.get(i - 1).click();
            contionueShopping.click();
        }
        //5. Click 'Cart' button
        WebElement chart = driver.findElement(By.xpath("//*[@*='fa fa-shopping-cart']"));
        chart.click();
        //6. Verify that cart page is displayed
        WebElement chartElement = driver.findElement(By.xpath("//a[@href='/view_cart']"));
        Assert.assertTrue(chartElement.isDisplayed());
        //7. Click Proceed To Checkout
        WebElement proceedElement = driver.findElement(By.xpath("//*[@*='btn btn-default check_out']"));
        proceedElement.click();
        //8. Click 'Register / Login' button
        WebElement registerElement = driver.findElement(By.xpath("//*[text()='Continue On Cart']"));
        registerElement.click();
        //9. Fill all details in Signup and create account
        WebElement signIn = driver.findElement(By.xpath("(//*[@*='/login'])[1]"));
        signIn.click();
        WebElement name = driver.findElement(By.xpath("//*[@placeholder='Name']"));
        Faker faker = new Faker();
        name.sendKeys(faker.name().firstName());
        WebElement email = driver.findElement(By.xpath("//*[@*='signup-email']"));
        email.sendKeys(faker.internet().emailAddress());
        WebElement signUpButton = driver.findElement(By.xpath("//*[@*='signup-button']"));
        signUpButton.click();
        //10. Verify 'ACCOUNT CREATED!' and click 'Continue' button
        WebElement password = driver.findElement(By.xpath("(//*[@*='password'])[2]"));
        password.sendKeys(faker.internet().password());
        WebElement nameFill = driver.findElement(By.xpath("(//*[@*='first_name'])[2]"));
        nameFill.sendKeys(faker.name().firstName());
        WebElement surnameFill = driver.findElement(By.xpath("(//*[@*='last_name'])[2]"));
        surnameFill.sendKeys(faker.name().lastName());
        WebElement address = driver.findElement(By.xpath("(//*[@*='address1'])[2]"));
        address.sendKeys(faker.address().fullAddress());
        Select select = new Select(driver.findElement(By.xpath("//select[@*='country']")));
        select.selectByVisibleText("Canada");
        WebElement state = driver.findElement(By.xpath("(//*[@*='state'])[2]"));
        state.sendKeys(faker.country().name());
        WebElement city = driver.findElement(By.xpath("(//*[@*='city'])[2]"));
        city.sendKeys(faker.address().city());
        WebElement zipCode = driver.findElement(By.xpath("//*[@*='zipcode']"));
        zipCode.sendKeys(faker.address().zipCode());
        WebElement mobile = driver.findElement(By.xpath("(//*[@*='mobile_number'])[2]"));
        mobile.sendKeys(faker.phoneNumber().phoneNumber());
        WebElement creatAccountButton = driver.findElement(By.xpath("//*[text()='Create Account']"));
        creatAccountButton.click();
        WebElement createdWrite=driver.findElement(By.xpath("//*[text()='Account Created!']"));
        Assert.assertTrue(createdWrite.isDisplayed());
        WebElement continueButton=driver.findElement(By.xpath("//*[text()='Continue']"));
        continueButton.click();


        //11. Verify ' Logged in as username' at top
        //12.Click 'Cart' button
        //13. Click 'Proceed To Checkout' button
        //14. Verify Address Details and Review Your Order
        //15. Enter description in comment text area and click 'Place Order'
        //16. Enter payment details: Name on Card, Card Number, CVC, Expiration date
        //17. Click 'Pay and Confirm Order' button
        //18. Verify success message 'Your order has been placed successfully!'
        //19. Click 'Delete Account' button
        //20. Verify 'ACCOUNT DELETED!' and click 'Continue' button
    }
}
