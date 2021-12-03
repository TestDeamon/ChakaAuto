package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Verification {
    private WebDriver driver;
    public Verification(WebDriver driver){
        this.driver = driver;
    }

    public Signup returnToSignupPage() throws InterruptedException{
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/div[2]/a")).click();
        return new Signup(driver);
    }
}
