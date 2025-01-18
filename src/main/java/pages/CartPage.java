package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage extends BasePage{

    public CartPage(WebDriver driver) {
        super(driver);
    }

    //gerekli locater'ları burada tanımlıyoruz

    By sepetim = By.xpath("//span[normalize-space()='Sepetim']");
    By sepete_git_button = By.xpath("//a[text()=\"Sepete Git\"]");
    By arti_button = By.xpath("(//a[normalize-space()='+'])[1]");
    By odeme_adimina_gec_button = By.xpath("(//a[@class='main-button mt-15'][normalize-space()='ÖDEME ADIMINA GEÇ'])[1]");
    By toplamTutar = By.xpath("//div[@class='price-info-area']//span[@class='total-grand-box-amount']");
    By bedenBilgisi = By.xpath("//strong[contains(text(),'5-6 Yaş')]");
    By renkBilgisi = By.xpath("//strong[normalize-space()='Koyu Bej']");


    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

    public CartPage goToCart(String expectedToplamTutar, String expectedBedenBilgisi, String expectedRenkBilgisi) throws InterruptedException {

        //sepete eklediğimiz ürünü görüntülemek için sepetim butonun üzerine geliyoruz
        Actions actions = new Actions(driver);
        WebElement sepetimElement = driver.findElement(sepetim);
        actions.moveToElement(sepetimElement).perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=\"Sepete Git\"]")));

        //sepete git butonuna tıklayarak sepetim sayfasına yönlendiriliyoruz
        WebElement sepete_git_button_element = driver.findElement(sepete_git_button);
        actions.moveToElement(sepete_git_button_element).perform();
        sepete_git_button_element.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[normalize-space()='+'])[1]")));

        //ürünün beden bilgisini assert ediyoruz
        String actualBedenBilgisi = driver.findElement(bedenBilgisi).getText();
        Assertions.assertEquals(expectedBedenBilgisi, actualBedenBilgisi, "Ürün beden bilgisi eşleşmiyor!");

        //ürünün renk bilgisini assert ediyoruz
        String actualRenkBilgisi = driver.findElement(renkBilgisi).getText();
        Assertions.assertTrue(
                actualRenkBilgisi.contains(expectedRenkBilgisi),
                "Ürün renk bilgisi beklenen değeri içermiyor!");

        //sepete eklenen ürünün adetini bir artırıyoruz
        driver.findElement(arti_button).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='main-button mt-15'][normalize-space()='ÖDEME ADIMINA GEÇ'])[1]")));

        Thread.sleep(5000);

        //ürünün fiyat bilgisini assert ediyoruz
        String actualToplamTutar = driver.findElement(toplamTutar).getText();
        Assertions.assertEquals(expectedToplamTutar, actualToplamTutar, "Sepet fiyatı eşleşmiyor!");

        //ödeme adımına geç butonuna tıklıyoruz ve giriş bilgileri sayfasına yönlendiriliyoruz
        driver.findElement(odeme_adimina_gec_button).click();
        Thread.sleep(5000);

        //sepetim sayfasına yönlendiriyoruz
        driver.navigate().to("https://www.lcw.com/sepetim");

        return this;
    }

}
