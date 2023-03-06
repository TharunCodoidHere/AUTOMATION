import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefocOptionsTask {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options=new FirefoxOptions();
//Proxy
        Proxy prox = new Proxy();
        prox.setProxyAutoconfigUrl("https://proxy.chercher.tech");
        options.setProxy(prox);
        WebDriver driver=new FirefoxDriver(options);
        driver.get("https://www.google.com");

    }
}
