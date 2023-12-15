package Pages;

import Utility.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import static Utility.BrowserDriver.*;

public class NewUserPage {
    private  WebDriver driver;



    //Locator
    private By hamburger_menu_xpath= By.xpath("//*[@id=\"menuToggle\"]/input");
    private By  signin_link_xpath=By.xpath("//*[@id=\"menu\"]/a[2]/li");
    private By  productcategory_heading_xpath =By.xpath( "//*[@id=\"ShoeType\"]");
    private By  registration_page_header=By.xpath("/html/body/center/h1");
    private By registrationlink= By.xpath("//*[@id=\"NewRegistration\"]");


    //Constructor
    public NewUserPage(WebDriver driver){
        this.driver = driver;
    }

    public  void clickHamburgerMenu() {

        WebElement hamburgermenu = driver.findElement(hamburger_menu_xpath);
        hamburgermenu.click();
    }

    public void clickSignIn(){
        WebElement signIn = driver.findElement(signin_link_xpath);
        signIn.click();

    }

    public void clickRegistration(){
        System.out.println("method");
        WebElement clickReg = driver.findElement(registrationlink);
        clickReg.click();
    }

    public  String  visiblity_productCategory(){
        String actualProductCategory = driver.findElement(productcategory_heading_xpath).getText();
        return actualProductCategory;


    }


    public  String getRegistrationPageText()
    {
        String registrationHeaderText = driver.findElement(registration_page_header).getText();
        System.out.println("Registration header text is" + registrationHeaderText);
        return registrationHeaderText;


    }
}
