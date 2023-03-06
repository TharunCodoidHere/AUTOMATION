import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        String URL = "https://jqueryui.com/droppable/";

        driver.get(URL);
        driver.switchTo().frame(0);

        //Actions class method to drag and drop
        Actions builder = new Actions(driver);

        WebElement from = driver.findElement(By.id("draggable"));

        WebElement to = driver.findElement(By.id("droppable"));

        //builder.dragAndDrop(from,to).build().perform();
        builder.clickAndHold(from).moveToElement(to).build().perform();


    }

}