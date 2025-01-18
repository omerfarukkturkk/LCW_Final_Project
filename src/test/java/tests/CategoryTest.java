package tests;

import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.CategoryPage;
import pages.HomePage;
import pages.LoginPage;
import utils.Listeners.TestListeners;

@Listeners({ TestListeners.class })
@Epic("Regression Tests")
@Feature("Category Tests")
public class CategoryTest extends BaseTest{

    HomePage homePage = new HomePage(driver);
    LoginPage loginPage = new LoginPage(driver);
    CategoryPage categoryPage = new CategoryPage(driver);

    @Test
    public void setupTest(){
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        categoryPage = new CategoryPage(driver);
    }

    @Description("Test Description: Select the right category in menu")
    @Test(priority = 0, description="Select the right category in menu scenario.")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Select the right category")
    public void selectCategory() throws InterruptedException {
        homePage.goToLoginPage().loginToAccount("sandmans823@gmail.com", "123456");
        categoryPage.selectCategory();
    }
}
