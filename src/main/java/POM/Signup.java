package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Signup {
    private WebDriver driver;
    public Signup(WebDriver driver){
        this.driver = driver;
    }
    public Verification Register() throws InterruptedException{
        System.out.println(("Page 2"));
        driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/form/div[1]/label/input")).sendKeys("testing@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/form/div[1]/label/input")).sendKeys("Password1");
        driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/form/div[1]/label/input")).sendKeys("Password1");
//        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/form/div[5]/div[1]/button")).click();

        return new Verification(driver);
    }
}
