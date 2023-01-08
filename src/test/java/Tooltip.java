import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Tooltip extends TnpscElements{
        public static void main(String[] args) {
//            WebDriverManager.chromedriver().setup();
//            ChromeOptions options=new ChromeOptions();
//            options.addArguments("--start-fullscreen");
//            WebDriver driver =new ChromeDriver(options);
//            driver.get("https://www.google.co.in/");
//            WebElement web = driver.findElement(By.name("q"));
//            Actions action=new Actions(driver);
//            action.moveToElement(web);
//            /*String tool= web.("title");
//            System.out.println(tool);*/
            System.out.println("T");
            Tooltip ma=new Tooltip();
            ma.Browsers("chrome");
            ma.elementPrint();
            ma.actions();

//            ma.quit();
        }

    }

