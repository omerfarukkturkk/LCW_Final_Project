package tests;

import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.CategoryPage;
import pages.FiltrePage;
import pages.HomePage;
import pages.LoginPage;
import utils.Listeners.TestListeners;

@Listeners({ TestListeners.class })
@Epic("Regression Tests")
@Feature("Filtre Tests")
public class FiltreTest extends BaseTest{

    HomePage homePage = new HomePage(driver);
    LoginPage loginPage = new LoginPage(driver);
    CategoryPage categoryPage = new CategoryPage(driver);
    FiltrePage filtrePage = new FiltrePage(driver);

    @Test
    public void setupTest(){
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        categoryPage = new CategoryPage(driver);
        filtrePage = new FiltrePage(driver);
    }

    @Description("Test Description: Select the right filter in dropdown menu")
    @Test(priority = 0, description="Select the right filter in dropdown menu scenario.")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Select the right filter")
    public void selectFiltre() throws InterruptedException {
        homePage.goToLoginPage().loginToAccount("sandmans823@gmail.com", "123456");
        categoryPage.selectCategory();
        filtrePage.selectFiltre();
        filtrePage.selectSort();

    }



}
