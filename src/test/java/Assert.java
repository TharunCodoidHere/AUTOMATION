;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
//import org.testng.asserts.Assertion;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assert {
    public static void assertTrue(boolean isVerified) {
    }

    @Test
    void Temp(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        String ActualTitle = driver.getTitle();
        String ExpectedTitle = ("Welcome to Amazon");
        Assertions.assertEquals(ActualTitle, ExpectedTitle);
        System.out.println("Assert passed");
        String asser="Tharun";
        String asserr="kumar";
        Assertions.assertEquals(asser,asserr);


    }
}
