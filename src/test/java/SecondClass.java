import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
class SecondClass implements Task3 {
    public void firefox() {
            WebDriverManager.edgedriver().setup();
            WebDriver driver = new EdgeDriver();
            driver.get("https://www.google.co.in/");
            driver.findElement(By.name("q")).sendKeys("One Piece");
        }

        public void chrome(){
            WebDriverManager.chromedriver().setup();
            WebDriver driver =new ChromeDriver();
            driver.get("https://www.google.co.in/");
            driver.findElement(By.name("q")).sendKeys("Akatsuki");
        }
    }

//
//ApplyOnline://*[@id="header"]/div/div[1]/div/div/nav/ul/li[3]/ul/li[2]/ul/li[1]/a
//arvikai://div[text()[normalize-space() = 'அறிவிக்கைகள்']]
//
//
//findElements:
//notif://*[@id="core"]/div/div[1]/div[2]/aside/div[2]/div/div/div/ul/li[1]/div/h4/a
//hall ticket://*[@id="core"]/div/div[1]/div[2]/aside/div[2]/div/div/div/ul/li[3]/div/h4/a