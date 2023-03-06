import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Weger {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        WebElement cli= driver.findElement(By.name("q"));
        cli.sendKeys("https://www.youtube.com/");
        cli.submit();
        cli.findElement(By.xpath("//h3[text()=\"YouTube\"]"));
        cli.findElement(By.id("text"));
        cli.click();
//        String n= driver.findElement(By.name("login")).getAttribute("value");
//        Thread.sleep(2000);
//        System.out.println(n);



    }
}

