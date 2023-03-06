import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

    public class Pf {

        public static List<WebElement> printList(WebDriver driver)
        {
            return driver.findElements(By.className("notice"));
        }

        public static WebElement Mainclick(WebDriver driver)
        {
            return driver.findElement(By.linkText("Apply Online"));
        }

        //        List<WebElement> list = driver.findElements(By.className("notice"));
//        System.out.println(list.size());
//        for (WebElement webElement : list) {
//            String name = webElement.getText();
//            System.out.println(name);
//        }WebElement elm = driver.findElement(By.linkText("Apply Online"));

        @FindBy(how = How.XPATH,using = "//div[text()[normalize-space() = 'அறிவிக்கைகள்']]")

        public static WebElement enter;

        @FindBy(xpath = "//td[text()='BURSAR']/following-sibling::td/a[text()='Apply Now']")

        public static WebElement Id;

        @FindBy(xpath = "//label[text()='பயனாளர் குறியீடு ']/following-sibling::input")

        public static WebElement Email;

        @FindBy(xpath = "//label[text()='கடவுச்சொல்']/following-sibling::input")

        public static WebElement Password;


        @FindBy(xpath = "//button[text()='ரத்து செய்']")

        public static WebElement Button;
    }

