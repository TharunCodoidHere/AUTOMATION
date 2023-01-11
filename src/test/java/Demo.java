import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import  org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Demo {

        @Test//(priority =3)
        void StartTheCar(){
            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            driver.get("https://www.google.com/");
            System.out.println("FirstGeaR");
        }

        @BeforeMethod
        void full_speed(){
            System.out.println("T");
        }

        @AfterMethod
        void SpeedLimit(){
            System.out.println("Tharun");
        }


        @Test(priority = 1)
        void FirstGear(){
            String tharun;
            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            driver.get("https://www.edge.com");
            System.out.println("SeconfGear");

        }
        @Test
        void SecondGear(){

            System.out.println("ThirdGear");
        }

        @BeforeClass
        void speed(){
            System.out.println("HINATA");
        }



        @Test(priority = 4)
        void FullSpeed(){

            System.out.println("Drive");
        }

    }


