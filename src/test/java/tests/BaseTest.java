package tests;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    public WebDriver driver;

    final public String baseURL = "https://www.lcw.com/";

    @BeforeAll
    public void setup(WebDriver driver){this.driver=driver;}{
        ChromeOptions cop = new ChromeOptions();
        cop.addArguments("--remote-allow-origins=*");
        cop.addArguments("--disable-notifications");
        driver = new ChromeDriver(cop);

        driver.navigate().to(baseURL);
        driver.manage().window().maximize();
    }

    @AfterClass
    public void quit(){
        driver.close();
    }
}
