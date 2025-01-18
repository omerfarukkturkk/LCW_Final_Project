package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //gerekli locater'ları burada tanımlıyoruz

    By emailTextbox = By.xpath("//input[@name='emailAndPhone']");
    By continueButton = By.xpath("//button[normalize-space()='Devam Et']");
    By passwordTextbox = By.xpath("//input[@placeholder='Şifreniz']");
    By loginButton = By.xpath("//button[text()='Giriş Yap']");
    By loginBtn = By.xpath("//span[contains(text(),'Giriş Yap')]");

    public LoginPage loginToAccount(String username, String password){

        //giriş yap butonuna tıklıyoruz
        driver.findElement(loginBtn).click();

        //email adresimizi giriyoruz
        driver.findElement(emailTextbox).sendKeys("sandmans823@gmail.com");

        //devam butonuna tıklıyoruz
        driver.findElement(continueButton).click();

        //şifremizi giriyoruz
        driver.findElement(passwordTextbox).sendKeys("123456");

        //giriş yap butonuna tıklıyoruz
        driver.findElement(loginButton).click();

        driver.navigate().to("https://www.lcw.com/");

        return this;

    }
}
