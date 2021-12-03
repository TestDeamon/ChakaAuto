package Setup;

import POM.Calculator;
import POM.Signup;
import POM.Verification;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class SetupTest {
    private WebDriver driver;
    protected Calculator calculator;

    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://chaka.ng/");
        //Go to calculator page
//        driver.findElement(By.xpath("/html/body/div[2]/header/nav/div[1]/ul/li[2]/a")).click();
        driver.findElement(By.className("nav__link")).click();
        System.out.println(calculator);
        calculator = new Calculator(driver);
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

}
