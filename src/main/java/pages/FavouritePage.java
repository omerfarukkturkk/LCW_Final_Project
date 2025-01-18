package pages;

import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FavouritePage extends BasePage{

    public FavouritePage(WebDriver driver) {
        super(driver);
    }

    //gerekli locater'ları burada tanımlıyoruz

    By favouriteButton = By.xpath("//i[@class='fa fa-heart-o']");
    By favorilerimButton = By.xpath("//span[normalize-space()='Favorilerim']");
    By productNameLocator = By.xpath("//h5[contains(text(),'Mont')]");

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

    public FavouritePage addToFavourite(String expectedProductName) throws InterruptedException {

        // favorilere ekleme butonuna tıklıyoruz
        driver.findElement(favouriteButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Favorilerim']")));
        Thread.sleep(5000);

        //favorilerim sayfasına gitmek için favorilerim butonuna tıklıyoruz
        driver.findElement(favorilerimButton).click();

        //favoriye eklediğimiz ürünün favorilerim sayfasında göründüğünü doğruluyoruz
        String actualProductName = driver.findElement(productNameLocator).getText();
        Assertions.assertEquals(expectedProductName, actualProductName, "Ürün isimleri eşleşmiyor!");


        return this;
    }
}
