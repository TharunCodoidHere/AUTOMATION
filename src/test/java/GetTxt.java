import com.google.errorprone.annotations.Var;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

    public class GetTxt{
        public static void main(String[] args) {
            WebDriverManager.chromedriver().setup();

            ChromeOptions options=new ChromeOptions();
            options.addArguments("--headless");
            ChromeDriver driver=new ChromeDriver(options);

            //WebDriver driver=new EdgeDriver();
            driver.get("https://mail.rediff.com/cgi-bin/login.cgi");


            // identify element
            WebElement p=driver.findElement(By.id("login1"));
            p.sendKeys("Itachi");
            WebElement q=driver.findElement(By.id("password"));
            q.sendKeys("Itachi");
            WebElement r=driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/div/input[2]"));
            r.click();
            String s= p.getAttribute("value");
            System.out.println("Text content is : " + s);
            String z=driver.getTitle();
            System.out.println(z);
            driver.close();
        }
    }
