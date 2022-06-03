package testMitThemen;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class AddProducktsTest extends TestBase {
    @Test
    public void AddProducktsTest() throws InterruptedException {
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.navigate().to("http://automationexercise.com");
        //Click 'Products' button
        driver.findElement(By.xpath("//a[@*='/products']")).click();
        //Hover over first product and click 'Add to cart'
        driver.findElement(By.xpath("(//*[@*='btn btn-default add-to-cart'])[1]")).click();
        //Click 'Continue Shopping' button
        driver.findElement(By.xpath("//*[text()='Continue Shopping']")).click();
        //Hover over second product and click 'Add to cart'
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//*[@*='btn btn-default add-to-cart'])[2]")).click();
        //Click 'View Cart' button
        driver.findElement(By.xpath("//*[text()='View Cart']")).click();
        //Verify both products are added to Cart
        String resource = driver.getPageSource();
        Thread.sleep(3000);
        WebElement product1=driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[1]"));
        WebElement product2=driver.findElement(By.xpath("(//*[@*='btn btn-default add-to-cart'])[2]"));
        Assert.assertTrue(resource.contains(product1.getText()));
        //Verify their prices, quantity and total price
    }
}
