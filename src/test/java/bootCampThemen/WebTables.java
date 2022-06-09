package bootCampThemen;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WebTables extends TestBase {
    @Test
    public void test01() {


        //● https://www.hotelmycamp.com admin/HotelRoomAdmin adresine gidin
        driver.get("https://www.hotelmycamp.com");
        //● login( ) metodun oluşturun ve oturum açın.
        WebElement login = driver.findElement(By.xpath("//*[text()='Log in']"));
        login.click();
        //○ Username : manager
        WebElement userName = driver.findElement(By.xpath("//*[@*='UserName']"));
        userName.sendKeys("manager");
        //○ Password : Manager1!
        WebElement password = driver.findElement(By.xpath("//*[@*='Password']"));
        password.sendKeys("Manager1!");
        WebElement loginClick = driver.findElement(By.xpath("(//*[@*='btn btn-primary py-3 px-5'])[1]"));
        loginClick.click();
        //● table( ) metodu oluşturun


        //○ Tüm table body’sinin boyutunu(sutun sayisi) bulun. /tbody
        int sutun = driver.findElements(By.xpath("//table//thead//th")).size();
        System.out.println("sütun sayisi=" + sutun);


        //○ Table’daki tum body’I ve başlıkları(headers) konsolda yazdırın.
     String basliklar= driver.findElement(By.xpath("//thead//tr  ")).getText();
        System.out.println("basliklar :"+basliklar);
        System.out.println(driver.findElement(By.xpath("//tbody")).getText());
        //● printRows( ) metodu oluşturun //tr

        //○ table body’sinde bulunan toplam satir(row) sayısını bulun.
        int satir=driver.findElements(By.xpath("//table//tbody//tr")).size();
        System.out.println("satir sayisi: "+satir);
        //○ Table body’sinde bulunan satirlari(rows) konsolda yazdırın.

        List<WebElement> rowList =driver.findElements(By.xpath("//tbody//tr"));
        System.out.println(rowList);
        System.out.println(rowList.size());

        for (int i = 1; i <=rowList.size() ; i++) {
            System.out.println("sütun "+i+": "+driver.findElement(By.xpath("//tbody//tr["+i+"]")).getText());
        }


        //○ 4.satir(row) elementleri konsolda yazdırın
        System.out.println(driver.findElement(By.xpath("//tbody//tr[4]")).getText());


    }

}
