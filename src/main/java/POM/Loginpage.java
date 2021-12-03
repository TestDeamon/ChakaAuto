package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
    private WebDriver driver;
    public Loginpage(WebDriver driver){this.driver = driver;}

    public Dashboardpage LoginDetails(){
        driver.findElement(By.xpath("/html/body/div[2]/main/div/form/div[1]/label/input")).sendKeys("davorigaga@mailinator.com");
        driver.findElement(By.xpath("/html/body/div[2]/main/div/form/div[2]/label/input")).sendKeys("PASSWORD");
        driver.findElement(By.tagName("button")).click();
        return new Dashboardpage(driver);
    }
}
