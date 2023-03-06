import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown{
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver Drop=new ChromeDriver();
        Drop.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
//        Select select = new Select(Do);
        WebElement Down=Drop.findElement(By.xpath("//select[@id='course']"));
        Select select=new Select(Down);
        //select.selectByIndex(4);
        select.selectByValue("java");




    }

}
