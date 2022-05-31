package testMitThemen;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class SearchTest extends TestBase {
    @Test
    public void searchTest(){
        //1. Launch browser

        //Navigate to url 'http://automationexercise.com'
        driver.navigate().to("http://automationexercise.com");
        //Click on 'Products' button
        WebElement products=driver.findElement(By.xpath("//*[@*='material-icons card_travel']"));
        products.click();
        //Verify user is navigated to ALL PRODUCTS page successfully
        WebElement allProducts=driver.findElement(By.xpath("//*[@*='title text-center']"));
        Assert.assertTrue(allProducts.isDisplayed());
        //Enter product name in search input and click search button
        WebElement searchInput=driver.findElement(By.xpath("//*[@*='form-control input-lg']"));
        searchInput.sendKeys("Blue Top");
        WebElement searchButton=driver.findElement(By.xpath("//*[@*='btn btn-default btn-lg']"));
        searchButton.click();
        //Verify 'SEARCHED PRODUCTS' is visible
        WebElement searchProducts=driver.findElement(By.xpath("//*[@*='title text-center']"));
        Assert.assertTrue(searchProducts.isDisplayed());

    }
}
