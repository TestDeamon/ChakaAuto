package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Calculator {
    private WebDriver driver;
    public Calculator(WebDriver driver) {
        this.driver = driver;
    }

    public Loginpage enterSearchDetails(){
        driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div/section[1]/div[2]/div[1]/input")).sendKeys("Goal");
        driver.findElement(By.xpath("/html/body/div[2]/main/div/div/section[1]/div[2]/div[2]/select")).click();
        driver.findElement(By.xpath("/html/body/div[2]/main/div/div/section[1]/div[2]/div[2]/select/option[3]")).click();


        driver.findElement(By.xpath("/html/body/div[2]/header/nav/ul/li[1]/a")).click();
        return new Loginpage(driver);
    }
}
