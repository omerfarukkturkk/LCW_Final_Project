package tests;

import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.*;
import utils.Listeners.TestListeners;

@Listeners({ TestListeners.class })
@Epic("Regression Tests")
@Feature("Cart Tests")
public class CartTest extends BaseTest{

    HomePage homePage = new HomePage(driver);
    LoginPage loginPage = new LoginPage(driver);
    CategoryPage categoryPage = new CategoryPage(driver);
    FiltrePage filtrePage = new FiltrePage(driver);
    ProductPage productPage = new ProductPage(driver);
    CartPage cartPage = new CartPage(driver);

    @Test
    public void setupTest(){
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        categoryPage = new CategoryPage(driver);
        filtrePage = new FiltrePage(driver);
        productPage = new ProductPage(driver);
        cartPage = new CartPage(driver);
    }

    @Description("Test Description: Go to cart page")
    @Test(priority = 0, description="Going to cart page scenario.")
    @Severity(SeverityLevel.MINOR)
    @Story("Go to cart page")
    public void goToCart() throws InterruptedException {
        homePage.goToLoginPage().loginToAccount("sandmans823@gmail.com", "123456");
        categoryPage.selectCategory();
        filtrePage.selectFiltre();
        filtrePage.selectSort();
        productPage.addToCart();
        cartPage.goToCart("2.999,98 TL", "5-6 Yaş", "Bej");
    }



}
