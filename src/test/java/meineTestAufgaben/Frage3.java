package meineTestAufgaben;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Frage3 {
    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));


    }

    @After
    public void tearDown() {
        driver.quit();
    }

    //Tests package’inda yeni bir class olusturun: WindowHandle2
    @Test
    public void WindowHandle2() {
        //● https://the-internet.herokuapp.com/windows adresine gidin.
        driver.get("https://the-internet.herokuapp.com/windows");
        String windowHandle1 = driver.getWindowHandle();


        //● Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
        String expected = "Opening a new window";
        WebElement actual = driver.findElement(By.xpath("//*[text()='Opening a new window']"));
        Assert.assertEquals(expected, actual.getText());


        //● Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
        String titelExpected = "The Internet";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(titelExpected, actualTitle);
        //● Click Here butonuna basın.
        driver.findElement(By.xpath("//*[@href='/windows/new']")).click();

        //● Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet” olduğunu
        //doğrulayın
        driver.switchTo().window(windowHandle1);
        String beklenentitle = "The Internet";
        String actualTitleson = driver.getTitle();
        Assert.assertEquals(beklenentitle, actualTitleson);
    }


}
