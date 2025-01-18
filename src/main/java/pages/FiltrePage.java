package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FiltrePage extends BasePage{
    public FiltrePage(WebDriver driver) {
        super(driver);
    }

    //gerekli locater'ları burada tanımlıyoruz

    By beden_filtre = By.xpath("//div[normalize-space()='Beden']");
    By beden_5_6_yas = By.xpath("//span[contains(text(),'6 Yaş')]");
    By beden_6_yas = By.xpath("(//span[@class = \"filter-option__text\" and contains(text(),'6 Yaş')])[2]");
    By beden_6_7_yas = By.xpath("//span[@class = \"filter-option__text\" and contains(text(), \"6-7 Yaş\")]");
    By renk_bej_rengi = By.xpath("//span[normalize-space()='BEJ']");
    By allow_cookies = By.xpath("//*[@id=\"cookieseal-banner-accept\"]");
    By sortList = By.xpath("//button[@class='dropdown-button__button']");
    By en_cok_satanlar = By.xpath("//a[normalize-space()='En çok satanlar']");

    public FiltrePage selectFiltre() throws InterruptedException {

        Thread.sleep(5000);
        driver.findElement(allow_cookies).click();

        //renk seçimini yapıyoruz
        driver.findElement(renk_bej_rengi).click();

        Thread.sleep(5000);

        WebElement beden_filtre_element = driver.findElement(beden_filtre);
        WebElement beden_5_6_yas_element = driver.findElement(beden_5_6_yas);
        WebElement beden_6_yas_element = driver.findElement(beden_6_yas);
        WebElement beden_6_7_yas_element = driver.findElement(beden_6_7_yas);


        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", beden_filtre_element);

        // 5-6, 6 ve 6-7 yaş filtrelerini seçiyoruz
        beden_5_6_yas_element.click();
        Thread.sleep(5000);

        beden_6_yas_element.click();
        Thread.sleep(5000);

        beden_6_7_yas_element.click();
        Thread.sleep(5000);

        return this;
    }

    public FiltrePage selectSort() throws InterruptedException {

        //en çok satanlar sıralamasını uyguluyoruz
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
        driver.findElement(sortList).click();
        driver.findElement(en_cok_satanlar).click();
        Thread.sleep(5000);

        return this;
    }

}
