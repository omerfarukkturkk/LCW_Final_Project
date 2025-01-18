package tests;

import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.*;
import utils.Listeners.TestListeners;


@Listeners({ TestListeners.class })
@Epic("Regression Tests")
@Feature("Product Tests")
public class ProductTest extends BaseTest{

    HomePage homePage = new HomePage(driver);
    LoginPage loginPage = new LoginPage(driver);
    CategoryPage categoryPage = new CategoryPage(driver);
    FiltrePage filtrePage = new FiltrePage(driver);
    ProductPage productPage = new ProductPage(driver);

    @Test
    public void setupTest(){
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        categoryPage = new CategoryPage(driver);
        filtrePage = new FiltrePage(driver);
        productPage = new ProductPage(driver);
    }

    @Description("Test Description: Add to cart the right product")
    @Test(priority = 0, description="Select the right product in the page scenario")
    @Severity(SeverityLevel.MINOR)
    @Story("Select the right product")
    public void addToCart() throws InterruptedException {
        homePage.goToLoginPage().loginToAccount("sandmans823@gmail.com", "123456");
        categoryPage.selectCategory();
        filtrePage.selectFiltre();
        filtrePage.selectSort();
        productPage.addToCart();
    }
}
