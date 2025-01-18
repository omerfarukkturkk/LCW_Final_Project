package tests;


import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.CategoryPage;
import pages.HomePage;
import pages.LoginPage;
import utils.Listeners.TestListeners;

@Listeners({ TestListeners.class })
@Epic("Smoke Tests")
@Feature("Login Tests")
public class LoginTest extends BaseTest {

    HomePage homePage = new HomePage(driver);
    LoginPage loginPage = new LoginPage(driver);

    @Test
    public void setupTest(){
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
    }

    @Description("Test Description: Login test with valid username and valid password.")
    @Test(priority = 0, description="Success Login Scenario with valid username and password.")
    @Severity(SeverityLevel.BLOCKER)
    @Story("Valid username and password login test")
    public void loginToAccount(){
        homePage.goToLoginPage().loginToAccount("sandmans823@gmail.com", "123456");
    }
}
