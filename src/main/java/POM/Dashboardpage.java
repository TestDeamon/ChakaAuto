package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboardpage {
    private WebDriver driver;
    public Dashboardpage(WebDriver driver){this.driver = driver;}

    public Loginpage Signout(){
        driver.findElement(By.xpath("/html/body/div[2]/header/nav/ul/li/span/span/span")).click();
        driver.findElement(By.xpath("/html/body/div[2]/header/nav/ul/li/span/span/div/a[9]")).click();
        return new Loginpage(driver);
    }

}
