package StepDefinition;

import Pages.NewUserPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static Pages.NewUserPage.*;

public class NewUserSteps {

    private WebDriver driver;
    private NewUserPage loginPage;

    @Before
    public void setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html#");
        Thread.sleep(5000);
    }

    @After
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }




    @Given("User navigates to the Login page")
    public void user_navigates_to_the_login_page() throws InterruptedException {
        loginPage= new NewUserPage(driver);
        loginPage.clickHamburgerMenu();
        Thread.sleep(3000);
        loginPage.clickSignIn();
        Thread.sleep(3000);


    }
    @When("User clicks on new Registration button")
    public void user_clicks_on_new_registration_button() throws InterruptedException {
        loginPage.clickRegistration();
        Thread.sleep(3000);


    }
    @Then("User should be able to view the Registration page")
    public void user_should_be_able_to_view_the_registration_page() {
        String actualProductCategory = loginPage.getRegistrationPageText();
        System.out.println(actualProductCategory);

    }
}
