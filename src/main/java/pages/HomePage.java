package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    public HomePage (WebDriver driver){
        super(driver);
    }

    public LoginPage goToLoginPage(){

        //homepage sayfasına geldiğimizi doğruluyoryz
        Assertions.assertEquals(driver.getTitle(), "LCW.com: Trendler ve Yenilikçi Online Alışveriş Deneyimi Burada! | LCW");
        return new LoginPage(driver);

    }
}
