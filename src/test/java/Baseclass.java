import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
     public static WebDriver driver;

     public void Browsers(String browser){
         if (browser.equalsIgnoreCase("chrome")){
             WebDriverManager.chromedriver().setup();
             driver=new ChromeDriver();
             driver.manage().window().maximize();
             driver.get("https://www.tnpsc.gov.in");
         }
         else {
             System.out.println("driver not found");
         }
     }
     public void quit(){
         driver.quit();
     }



}
