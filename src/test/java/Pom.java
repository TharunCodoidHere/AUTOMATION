import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Pom
{

        public static void main(String []args) throws InterruptedException
        {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.tnpsc.gov.in/");
            driver.manage().window().maximize();
            String handle = driver.getWindowHandle();
            System.out.println(handle);
            List<WebElement> list=Pf.printList(driver);
            //List<WebElement> list = driver.findElements(By.className("notice"));
            System.out.println(list.size());
            for (WebElement webElement : list) {
                String name = webElement.getText();
                System.out.println(name);
            }

            Pf.Mainclick(driver).click();

            Alert alert = driver.switchTo().alert();
            String alertMsg = driver.switchTo().alert().getText();
            System.out.println(alertMsg);
            Thread.sleep(3000);
            alert.accept();
            System.out.println("You choose yes");
            Thread.sleep(3000);
            System.out.println(driver.getWindowHandles().size());

            Set<String> windowhandles = driver.getWindowHandles();

            System.out.println(windowhandles);
            System.out.println(driver.getCurrentUrl());
            List<String> Window = new ArrayList<String>(windowhandles);
            driver.switchTo().window(Window.get(1));
            System.out.println(driver.getCurrentUrl());


            PageFactory.initElements(driver, Pf.class);
            Pf.enter.click();
            Pf.Id.click();
            Pf.Email.sendKeys("Tharun");
            Pf.Password.sendKeys("COD298");
            Pf.Button.click();

        }
}

