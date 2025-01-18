package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasePage {

    public static WebDriver driver;

    final public String baseURL = "https://www.lcw.com/";

    public BasePage(WebDriver driver){this.driver=driver;}

    /*public WebDriver setup(){
        ChromeOptions cop = new ChromeOptions();
        cop.addArguments("--remote-allow-origins=*");
        cop.addArguments("--disable-notifications");
        driver = new ChromeDriver(cop);

        driver.navigate().to(baseURL);
        driver.manage().window().maximize();

        return driver;
    }

     */



}
