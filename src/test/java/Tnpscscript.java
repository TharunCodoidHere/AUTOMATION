import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Tnpscscript extends TnpscCode  {
    public void actions()  {
     PageFactory.initElements(Baseclass.driver, TnpscCode.class);
     TnpscCode.applyclick.click();
     try {
         Thread.sleep(4000);
         Alert n = driver.switchTo().alert();
         n.accept();
         Thread.sleep(10000);
         System.out.println("Tharun");
         Thread.sleep(3000);
         driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
         TnpscCode.arivikai.click();
         Thread.sleep(3000);
         System.out.println("Apply");
         TnpscCode.Applyonline2.click();
         TnpscCode.notif.getText();
         TnpscCode.halltick.getText();

     }
     catch (Exception e){
         System.out.println(e.getMessage());
     }
 }


    public static void main(String[] args) throws InterruptedException {



//
//        Thread.sleep(3000);
//        code.applyclick.click();
//        Thread.sleep(3000);
//        driver.switchTo().alert().accept();
//        Thread.sleep(3000);
//        code.arivikai.click();
//        Thread.sleep(3000);
    }


}
