package meineTestAufgaben;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Frage1 {
    WebDriver driver;

    /*
    1) Bir class oluşturun: BestBuyAssertions
2) https://ultimateqa.com/automation Adresine gidin
○ Sayfa URL’inin https://ultimateqa.com/automation ‘a esit oldugunu test edin
○ titleTest => Sayfa başlığının “cat” içermediğini(contains) test edin
○ logoTest  logosunun görüntülendigini test edin
     */
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


    }

    @Test
    public void test() {
        driver.get("https://ultimateqa.com/automation");
        String expected = "https://ultimateqa.com/automation";
        String actual = "https://ultimateqa.com/automation";
        Assert.assertEquals(expected, actual);
        Assert.assertFalse(driver.getTitle().contains("cat"));
        WebElement logo = driver.findElement(By.xpath("(//i[@class='sw swp_twitter_icon'])[2]"));
        Assert.assertTrue(logo.isDisplayed());

        String title = driver.getTitle();
        System.out.println(title);

    }


    @After
    public void tearDown() {
        driver.close();
    }
}
