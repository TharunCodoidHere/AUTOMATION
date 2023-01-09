import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

import static org.openqa.selenium.support.Color.fromString;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

import java.awt.*;


public class ColorVerify {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tnpsc.gov.in/");
        WebElement web = driver.findElement(By.xpath("//*[@id=\"core\"]/div/div[1]/div[2]/aside/div[2]/div/div/div/ul/li[2]/div/h4/a"));
        Actions act =new Actions(driver);
        act.moveToElement(web).perform();
        String Element=web.getCssValue("background-color");
        System.out.println(Element);
        String hex = Color.fromString(Element).asHex();
        System.out.println(hex);
        if (hex.equals("#1a6194"))
            System.out.println("success");
        else
            System.out.println("Fail");

        driver.quit();
    }





}
