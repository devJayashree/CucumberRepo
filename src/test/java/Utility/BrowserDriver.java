package Utility;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

public class BrowserDriver {


     //public static WebDriver driver;
     public static WebDriver driver = new ChromeDriver();
    public static ChromeOptions options;

    public static void StartBrowser(){
            System.out.println("browser");
            options = new ChromeOptions();
            System.out.println("browser");
            options.addArguments("--remote-allow-origins=*");
           System.setProperty("webdriver.http.factory", "jdk-http-client");
            System.setProperty("webdriver.chrome.driver", "D:\\NewProject\\CucumberTestNG\\src\\test\\resources\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html#");
        };
        public void close(){
            driver.close();
        }
    }

