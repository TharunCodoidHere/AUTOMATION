import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExe {
    WebDriver driver;

    public void setup(String browser) throws Exception{
        if(browser.equalsIgnoreCase("Firefox")){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        }
        else if(browser.equalsIgnoreCase("Chrome")){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
//    public void visitCodoidPage() {
//        String baseUrl = "https://codoid.com/";
//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver = new FirefoxDriver();
//        driver.get(baseUrl);
//        driver.manage().window().maximize();
    }}

    @Test
//    @Parameters("browser")
    public void visitAmazonPage() {
        String baseUrl = "https://www.amazon.in/";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
}}
