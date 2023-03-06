import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Drop {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.google.com");
        //Following
        WebElement Following=driver.findElement(By.name("q"));
        Following.sendKeys("https://mail.rediff.com/cgi-bin/login.cgi");
        Following.submit();
        WebElement y= driver.findElement(By.xpath("//div[@class='TbwUpd NJjxre']/preceding::h3[@class='LC20lb MBeuO DKV0Md'][14]"));
        y.click();
        //Preceding
        //WebElement Preceding= driver.findElement(By.xpath("//div[@class='cell']/preceding::p[@class='form-label'][2]"));
        //Preceding.isDisplayed();
        WebElement Child= driver.findElement(By.xpath("//div[@class='table']/child::div//input[@id='login1']"));
        Child.sendKeys("Naruto");
        //parent
        WebElement Parent= driver.findElement(By.xpath("//em[@id='eyeicon']/parent::div//input[1]"));
        Parent.sendKeys("Uchiha");
        //Ancestor
        WebElement Ancestor= driver.findElement(By.xpath("//div[@class='floatR rightwidth']/ancestor::div//em"));
        Ancestor.click();
        //Descendant
        WebElement Descendant= driver.findElement(By.xpath("//div[@class='wrapper']/descendant::input[@value='Sign in']"));
        Descendant.click();



    }

}
