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
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Frage2 {
    static WebDriver driver;
    /*
    Bir class oluşturun: DropDown
● https://the-internet.herokuapp.com/dropdown adresine gidin.
1.Index kullanarak Seçenek 1’i (Option 1) seçin
2.Value kullanarak Seçenek 2'yi (Option 2) seçin
3.Visible Text(Görünen metin) kullanarak Seçenek 1’i (Option 1) seçin
4.Tüm dropdown optionslari yazdırın
5. Dropdown’un boyutunu bulun, Dropdown’da 4 öğe varsa konsolda True , degilse
False yazdırın
     */
    @Before

    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


    }
    @Test
    public void test(){
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[text()='Dropdown']")).click();
    WebElement dropDown= driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select select=new Select(dropDown);
        select.selectByIndex(1);
        select.selectByValue("2");
        select.selectByVisibleText("Option 2");
        List<WebElement> selectList=select.getOptions();
        System.out.println(selectList);
        int dropDownCount=selectList.size();
       if( dropDownCount==4){
           System.out.println("true");

       }
        else System.out.println("false");


    }



    @After
    public void tearDown() {
        driver.close();
    }
}
