package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage extends BasePage{


    public ProductPage(WebDriver driver) {
        super(driver);
    }

    //gerekli locater'ları burada tanımlıyoruz

    By selectFourthProduct = By.xpath("(//h5[@class=\"product-card__title\"])[3]");
    By age_five_or_six = By.xpath("//button[contains(text(),'5-6 Yaş')]");
    By addToCart = By.xpath("//button[normalize-space()='SEPETE EKLE']");

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

    public ProductPage addToCart() throws InterruptedException {

        Assertions.assertEquals("Kapüşonlu Kız Çocuk Mont", "Kapüşonlu Kız Çocuk Mont");


        //ilgili ürünün detay sayfasına gidiyoruz
        driver.findElement(selectFourthProduct).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'5-6 Yaş')]")));

        //beden seçiyoruz
        driver.findElement(age_five_or_six).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='SEPETE EKLE']")));

        //sepete ekle butonuna tıklıyoruz
        driver.findElement(addToCart).click();
        Thread.sleep(5000);

        return this;

    }

    public ProductPage saveTextAndAssert(){


        WebElement selectFourthProductElement = driver.findElement(selectFourthProduct);
        String actualText = selectFourthProductElement.getText();

        String expectedText = "Kapüşonlu Kız Çocuk Mont";

        Assertions.assertEquals(actualText,expectedText,"Ürün başlığı beklenenden farklı!");

        return this;
    }
}

