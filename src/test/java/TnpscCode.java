import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TnpscCode extends Baseclass{

//    public Object pagefa(){
//        PageFactory.initElements(driver,this);
//
//        return null;
//    }
public static List<WebElement> printList(WebDriver driver)
{
    return driver.findElements(By.className("notice"));
}

    @FindBy(how= How.XPATH,using = "//div[@class='notice-inner']//following-sibling::h4/a[text()='Apply Online']")
    static   WebElement applyclick;
    @FindBy(how=How.XPATH,using = "//div[@class='alertMsg']//following-sibling::div[2]//div[3]//a[normalize-space(text()='அறிவிக்கைகள்' )]")
    static    WebElement arivikai;
    @FindBy(how=How.XPATH,using = "//h4/descendant::a[text()='Notification']")
    static  WebElement notif;
    @FindBy(how=How.XPATH,using ="//h4/descendant::a[text()='Hall Ticket Download']")
    static  WebElement halltick;
    @FindBy(xpath = "//table[@id=\"example\"]//child::a[text()='Apply Now']//preceding::a[text()='Apply Now']")
    static WebElement Applyonline2;
}
