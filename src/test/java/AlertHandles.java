import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertHandles {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver n = new ChromeDriver();
        n.get("https://mail.rediff.com/cgi-bin/login.cgi");
        WebElement p=n.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/div/input[2]"));
        p.click();
        Alert m = n.switchTo().alert();
        Thread.sleep(5000);
        m.accept();



        n.switchTo().frame(0);
        n.quit();





    }
}



