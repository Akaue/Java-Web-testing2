package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

    protected WebDriver driver;
    public BasePage(WebDriver driver){

        this.driver = driver;
    }

    public String capturaMsg(){

     return driver.findElement(By.className("info-account")).getText();
    }
}
