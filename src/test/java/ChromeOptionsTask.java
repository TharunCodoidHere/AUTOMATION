import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeOptionsTask {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
//Arguments
        //options.addArguments("--incognito");
        //options.addArguments("--start-fullscreen");
        //options.addArguments("--headless");
        //options.addArguments("--disable-notifications");
        //options.addArguments("--force-dark-mode");
        options.addArguments("--silent-launch");



        //set
        //options.setAcceptInsecureCerts(true);

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
        driver.manage().window().maximize();
        System.out.println("url is launched "+driver.getTitle());
        //driver.quit();
    }
}

