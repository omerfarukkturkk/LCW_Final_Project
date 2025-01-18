package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CategoryPage extends BasePage{
    public CategoryPage(WebDriver driver) {
        super(driver);
    }

    //gerekli locater'ları burada tanımlıyoruz

    By kategori = By.xpath("//a[normalize-space()='ÇOCUK & BEBEK']");
    By kategori_kiz_cocuk = By.xpath("//span[normalize-space()='KIZ ÇOCUK']");
    By alt_kategori_mont_kaban = By.xpath("(//a[contains(@class,'')][normalize-space()='Mont ve Kaban'])[2]");


    public CategoryPage selectCategory() throws InterruptedException {

        //kategoriler elementinin üzerine geliyoruz
        Actions actions = new Actions(driver);
        WebElement kategoriElement = driver.findElement(kategori);
        actions.moveToElement(kategoriElement).perform();
        Thread.sleep(5000);

        //kız cocuk kategorisinin üzerine geliyoruz
        WebElement kategori_kiz_cocuk_element = driver.findElement(kategori_kiz_cocuk);
        actions.moveToElement(kategori_kiz_cocuk_element).perform();
        Thread.sleep(5000);

        //alt kategorilerden mont ve kaban kategorisine tıklıyoruz
        driver.findElement(alt_kategori_mont_kaban).click();

        return this;
    }

}