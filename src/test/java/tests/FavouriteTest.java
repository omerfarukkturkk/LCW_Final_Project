package tests;

import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.*;
import utils.Listeners.TestListeners;

@Listeners({ TestListeners.class })
@Epic("Regression Tests")
@Feature("Favourite Tests")
public class FavouriteTest extends BaseTest{

    HomePage homePage = new HomePage(driver);
    LoginPage loginPage = new LoginPage(driver);
    CategoryPage categoryPage = new CategoryPage(driver);
    FiltrePage filtrePage = new FiltrePage(driver);
    ProductPage productPage = new ProductPage(driver);
    CartPage cartPage = new CartPage(driver);
    FavouritePage favouritePage = new FavouritePage(driver);

    @Test
    public void setupTest(){
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        categoryPage = new CategoryPage(driver);
        filtrePage = new FiltrePage(driver);
        productPage = new ProductPage(driver);
        cartPage = new CartPage(driver);
        favouritePage = new FavouritePage(driver);
    }

    @Description("Test Description: Add to favourite the product")
    @Test(priority = 0, description="Adding product to favourite list scenario")
    @Severity(SeverityLevel.NORMAL)
    @Story("Adding product to favourite list")
    public void addToFavourite() throws InterruptedException {
        homePage.goToLoginPage().loginToAccount("sandmans823@gmail.com", "123456");
        categoryPage.selectCategory();
        filtrePage.selectFiltre();
        filtrePage.selectSort();
        productPage.addToCart();
        cartPage.goToCart("2.999,98 TL", "5-6 Yaş", "Bej");
        favouritePage.addToFavourite("Kapüşonlu Kız Çocuk Mont");
    }





}
