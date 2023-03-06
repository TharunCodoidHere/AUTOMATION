import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class GetSelect {
    public static   String strOptions = "Selenium";
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
        WebElement element= driver.findElement(By.xpath("//select[@id='dropdown1']"));
        Select select = new Select(element);
        List<WebElement> all_options = select.getOptions();
        boolean found = false;

        for (WebElement we : all_options) {
            if (strOptions.equalsIgnoreCase(we.getText())) {
                select.selectByVisibleText(strOptions);
                found = true;

                break;
            }
        }
    }

}
