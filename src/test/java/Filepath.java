import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

    public class Filepath {
        public static void main(String args[]) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://leafground.com/file.xhtml");
            WebElement file=driver.findElement(By.xpath("//button[@id='j_idt93:j_idt95']/descendant::span[text()='Download']"));
            file.click();;
            File fileLocation=new File("C:\\Users\\CODOID\\Downloads");
            File[] totalFiles=fileLocation.listFiles();
            for (File files: totalFiles)
            {
                if (files.getName().equals("TestLeaf Log.png"));
                System.out.println("The file is present");
                System.out.println(fileLocation);
                break;
            }
            driver.close();
        }






    }

